
(function () {
  "use strict";

  dust.loadSource(dust.compile($('#tmpl-dfshealth').html(), 'dfshealth'));
  dust.loadSource(dust.compile($('#tmpl-startup-progress').html(), 'startup-progress'));
  dust.loadSource(dust.compile($('#tmpl-datanode').html(), 'datanode-info'));
  dust.loadSource(dust.compile($('#tmpl-datanode-volume-failures').html(), 'datanode-volume-failures'));
  dust.loadSource(dust.compile($('#tmpl-snapshot').html(), 'snapshot-info'));

  $.fn.dataTable.ext.order['ng-value'] = function (settings, col)
  {
    return this.api().column(col, {order:'index'} ).nodes().map(function (td, i) {
      return $(td).attr('ng-value');
    });
  };

  function load_overview() {
    var BEANS = [
      {"name": "nn",      "url": "/jmx?qry=Hadoop:service=NameNode,name=NameNodeInfo"},
      {"name": "nnstat",  "url": "/jmx?qry=Hadoop:service=NameNode,name=NameNodeStatus"},
      {"name": "fs",      "url": "/jmx?qry=Hadoop:service=NameNode,name=FSNamesystemState"},
      {"name": "fsn",     "url": "/jmx?qry=Hadoop:service=NameNode,name=FSNamesystem"},
      {"name": "replicastat",      "url": "/jmx?qry=Hadoop:service=NameNode,name=ReplicatedBlocksState"},
      {"name": "ecstat",      "url": "/jmx?qry=Hadoop:service=NameNode,name=ECBlockGroupsState"},
      {"name": "blockstats",      "url": "/jmx?qry=Hadoop:service=NameNode,name=BlockStats"},
      {"name": "mem",     "url": "/jmx?qry=java.lang:type=Memory"}
    ];

    var HELPERS = {
      'helper_fs_max_objects': function (chunk, ctx, bodies, params) {
        var o = ctx.current();
        if (o.MaxObjects > 0) {
          chunk.write('(' + Math.round((o.FilesTotal + o.BlockTotal) / o.MaxObjects * 100) * 100 + ')%');
        }
      },

      'helper_dir_status': function (chunk, ctx, bodies, params) {
        var j = ctx.current();
        for (var i in j) {
          chunk.write('<tr><td>' + i + '</td><td>' + j[i] + '</td><td>' + params.type + '</td></tr>');
        }
      },

      'helper_date_tostring' : function (chunk, ctx, bodies, params) {
        var value = dust.helpers.tap(params.value, chunk, ctx);
        return chunk.write('' + moment(Number(value)).format('ddd MMM DD HH:mm:ss ZZ YYYY'));
      }
    };

    var data = {};
    var non_ha = false;

    $.ajax({'url': '/conf', 'dataType': 'xml', 'async': true}).done(
      function(d) {
        var $xml = $(d);
        var namespace, nnId;
        $xml.find('property').each(function(idx,v) {
          if ($(v).find('name').text() === 'dfs.nameservice.id') {
            namespace = $(v).find('value').text();
          }
          if ($(v).find('name').text() === 'dfs.ha.namenode.id') {
            nnId = $(v).find('value').text();
          }
        });
        if (namespace && nnId) {
          data['HAInfo'] = {"Namespace": namespace, "NamenodeID": nnId};
        } else {
          non_ha = true;
        }
    });

    // Workarounds for the fact that JMXJsonServlet returns non-standard JSON strings
    function workaround(nn) {
      nn.JournalTransactionInfo = JSON.parse(nn.JournalTransactionInfo);
      nn.NameJournalStatus = JSON.parse(nn.NameJournalStatus);
      nn.NameDirStatuses = JSON.parse(nn.NameDirStatuses);
      nn.NodeUsage = JSON.parse(nn.NodeUsage);
      nn.CorruptFiles = JSON.parse(nn.CorruptFiles);
      return nn;
    }

    load_json(
      BEANS,
      guard_with_startup_progress(function(d) {
        for (var k in d) {
          data[k] = k === 'nn' ? workaround(d[k].beans[0]) : d[k].beans[0];
        }

        var blockstats = data['blockstats'];
        for (var k in blockstats.StorageTypeStats) {
          var b = blockstats.StorageTypeStats[k].value;
          b.capacityUsedPercentage = b.capacityUsed * 100.0 / b.capacityTotal;
          b.capacityRemainingPercentage = b.capacityRemaining * 100.0 / b.capacityTotal;
        }

        data.fs.ObjectsTotal = data.fs.FilesTotal + data.fs.BlocksTotal;

        var wait_for_conf =  setInterval(function() {
          if (non_ha ||
              (('HAInfo' in data) &&
                  ("Namespace" in data['HAInfo']) &&
                  ("NamenodeID" in data['HAInfo'])
              )
          ) {
            render();
            clearInterval(wait_for_conf);
          }
        }, 5);
      }),
      function (url, jqxhr, text, err) {
        show_err_msg('<p>Failed to retrieve data from ' + url + ', cause: ' + err + '</p>');
      });

    function render() {
      var base = dust.makeBase(HELPERS);
      dust.render('dfshealth', base.push(data), function(err, out) {
        $('#tab-overview').html(out);
        $('#ui-tabs a[href="#tab-overview"]').tab('show');
      });
    }
  }

  function show_err_msg(msg) {
    $('#alert-panel-body').html(msg);
    $('#alert-panel').show();
  }

  function ajax_error_handler(url, jqxhr, text, err) {
    show_err_msg('<p>Failed to retrieve data from ' + url + ', cause: ' + err + '</p>');
  }

  function guard_with_startup_progress(fn) {
    return function() {
      try {
        fn.apply(this, arguments);
      } catch (err) {
        if (err instanceof TypeError) {
          show_err_msg('NameNode is still loading. Redirecting to the Startup Progress page.');
          load_startup_progress();
        }
      }
    };
  }

  function load_startup_progress() {
    function workaround(r) {
      function rename_property(o, s, d) {
        if (o[s] !== undefined) {
          o[d] = o[s];
          delete o[s];
        }
      }
      r.percentComplete *= 100;
      $.each(r.phases, function (idx, p) {
        p.percentComplete *= 100;
        $.each(p.steps, function (idx2, s) {
          s.percentComplete *= 100;
          // dust.js is confused by these optional keys in nested
          // structure, rename them
          rename_property(s, "desc", "stepDesc");
          rename_property(s, "file", "stepFile");
          rename_property(s, "size", "stepSize");
        });
      });
      return r;
    }
    $.get('/startupProgress', function (resp) {
      var data = workaround(resp);
      dust.render('startup-progress', data, function(err, out) {
        $('#tab-startup-progress').html(out);
        $('#ui-tabs a[href="#tab-startup-progress"]').tab('show');
      });
    }).fail(ajax_error_handler);
  }

  function load_datanode_info() {
    var HELPERS = {
      'helper_relative_time' : function (chunk, ctx, bodies, params) {
        var value = dust.helpers.tap(params.value, chunk, ctx);
        return chunk.write(moment().subtract(Number(value), 'seconds').format('ddd MMM DD HH:mm:ss ZZ YYYY'));
      },
      'helper_usage_bar' : function (chunk, ctx, bodies, params) {
        var value = dust.helpers.tap(params.value, chunk, ctx);
        var v = Number(value);
        var r = null;
        if (v < 70) {
          r = 'progress-bar-success';
        } else if (v < 85) {
          r = 'progress-bar-warning';
        } else {
          r = "progress-bar-danger";
        }
        return chunk.write(r);
      },
    };

    function workaround(r) {
      function node_map_to_array(nodes) {
        var res = [];
        for (var n in nodes) {
          var p = nodes[n];
          p.name = n;
          res.push(p);
        }
        return res;
      }

      function augment_live_nodes(nodes) {
        for (var i = 0, e = nodes.length; i < e; ++i) {
          var n = nodes[i];
          n.usedPercentage = Math.round((n.used + n.nonDfsUsedSpace) * 1.0 / n.capacity * 100);

          var port = n.infoAddr.split(":")[1];
          var securePort = n.infoSecureAddr.split(":")[1];
          var dnHost = n.name.split(":")[0];
          n.dnWebAddress = "http://" + dnHost + ":" + port;
          if (securePort != 0) {
            n.dnWebAddress = "https://" + dnHost + ":" + securePort;
          }

          if (n.adminState === "In Service") {
            n.state = "alive";
          } else if (nodes[i].adminState === "Decommission In Progress") {
            n.state = "decommissioning";
          } else if (nodes[i].adminState === "Decommissioned") {
            n.state = "decommissioned";
          } else if (nodes[i].adminState === "Entering Maintenance") {
            n.state = "entering-maintenance";
          } else if (nodes[i].adminState === "In Maintenance") {
            n.state = "in-maintenance";
          }
        }
      }

      function augment_dead_nodes(nodes) {
        for (var i = 0, e = nodes.length; i < e; ++i) {
          if (nodes[i].adminState === "Decommissioned") {
            nodes[i].state = "down-decommissioned";
          } else if (nodes[i].adminState === "In Maintenance") {
            nodes[i].state = "down-maintenance";
          } else {
            nodes[i].state = "down";
          }
        }
      }

      r.LiveNodes = node_map_to_array(JSON.parse(r.LiveNodes));
      augment_live_nodes(r.LiveNodes);
      r.DeadNodes = node_map_to_array(JSON.parse(r.DeadNodes));
      augment_dead_nodes(r.DeadNodes);
      r.DecomNodes = node_map_to_array(JSON.parse(r.DecomNodes));
      r.EnteringMaintenanceNodes = node_map_to_array(JSON.parse(r.EnteringMaintenanceNodes));
      return r;
    }

    function renderHistogram(dnData) {
      var data = dnData.LiveNodes.map(function(dn) {
        return (dn.usedSpace / dn.capacity) * 100.0;
      });

      var formatCount = d3.format(",.0f");

      var widthCap = $("div.container").width();
      var heightCap = 150;

      var margin = {top: 10, right: 60, bottom: 30, left: 30},
          width = widthCap * 0.9,
          height = heightCap - margin.top - margin.bottom;

      var x = d3.scaleLinear()
          .domain([0.0, 100.0])
          .range([0, width]);

      var bins = d3.histogram()
          .domain(x.domain())
          .thresholds(x.ticks(20))
          (data);

      var y = d3.scaleLinear()
          .domain([0, d3.max(bins, function(d) { return d.length; })])
          .range([height, 0]);

      var svg = d3.select("#datanode-usage-histogram").append("svg")
          .attr("width", width + 50.0)
          .attr("height", height + margin.top + margin.bottom)
          .append("g")
          .attr("transform", "translate(" + margin.left + "," + margin.top + ")");

      svg.append("text")
          .attr("x", (width / 2))
          .attr("y", heightCap - 6 - (margin.top / 2))
          .attr("text-anchor", "middle")
          .style("font-size", "15px")
          .text("Disk usage of each DataNode (%)");

      var bar = svg.selectAll(".bar")
          .data(bins)
          .enter().append("g")
          .attr("class", "bar")
          .attr("transform", function(d) { return "translate(" + x(d.x0) + "," + y(d.length) + ")"; });

      window.liveNodes = dnData.LiveNodes;

      bar.append("rect")
          .attr("x", 1)
          .attr("width", x(bins[0].x1) - x(bins[0].x0) - 1)
          .attr("height", function(d) { return height - y(d.length); })
          .attr("onclick", function (d) { return "open_hostip_list(" + d.x0 + "," + d.x1 + ")"; });

      bar.append("text")
          .attr("dy", ".75em")
          .attr("y", 6)
          .attr("x", (x(bins[0].x1) - x(bins[0].x0)) / 2)
          .attr("text-anchor", "middle")
          .text(function(d) { return formatCount(d.length); });

      svg.append("g")
          .attr("class", "axis axis--x")
          .attr("transform", "translate(0," + height + ")")
          .call(d3.axisBottom(x));
    }

    $.get(
      '/jmx?qry=Hadoop:service=NameNode,name=NameNodeInfo',
      guard_with_startup_progress(function (resp) {
        var data = workaround(resp.beans[0]);
        var base = dust.makeBase(HELPERS);
        dust.render('datanode-info', base.push(data), function(err, out) {
          $('#tab-datanode').html(out);
          $('#table-datanodes').dataTable( {
            'lengthMenu': [ [25, 50, 100, -1], [25, 50, 100, "All"] ],
            'columnDefs': [
              { 'targets': [ 0 ], 'visible': false, 'searchable': false }
             ],
            'columns': [
              { 'orderDataType': 'ng-value', 'searchable': true , "defaultContent": "" },
              { 'orderDataType': 'ng-value', 'searchable': true , "defaultContent": "" },
              { 'orderDataType': 'ng-value', 'searchable': true , "defaultContent": ""},
              { 'orderDataType': 'ng-value', 'type': 'num' , "defaultContent": 0},
              { 'orderDataType': 'ng-value', 'type': 'num' , "defaultContent": 0},
              { 'orderDataType': 'ng-value', 'type': 'num' , "defaultContent": 0},
              { 'orderDataType': 'ng-value', 'type': 'num' , "defaultContent": 0},
              { 'orderDataType': 'ng-value', 'type': 'num' , "defaultContent": 0},
              { 'type': 'num' , "defaultContent": 0},
              { 'orderDataType': 'ng-value', 'type': 'num' , "defaultContent": 0},
              { 'type': 'string' , "defaultContent": ""}
              ],
              initComplete: function () {
                var column = this.api().column([0]);
                var select = $('<select class="datanodestatus form-control input-sm"><option value="">All</option></select>')
                              .appendTo('#datanodefilter')
                              .on('change', function () {
                                var val = $.fn.dataTable.util.escapeRegex(
                                $(this).val());
                                column.search(val ? '^' + val + '$' : '', true, false).draw();
                              });
                console.log(select);
                column.data().unique().sort().each(function (d, j) {
                  select.append('<option value="' + d + '">' + d + '</option>');
                });
            }
          });
          renderHistogram(data);
          $('#ui-tabs a[href="#tab-datanode"]').tab('show');
        });
      })).fail(ajax_error_handler);
  }

  function load_datanode_volume_failures() {

    var HELPERS = {
      'helper_date_tostring' : function (chunk, ctx, bodies, params) {
        var value = dust.helpers.tap(params.value, chunk, ctx);
        return chunk.write('' + moment(Number(value)).format('ddd MMM DD HH:mm:ss ZZ YYYY'));
      }
    };

    function workaround(r) {
      function node_map_to_array(nodes) {
        var res = [];
        for (var n in nodes) {
          var p = nodes[n];
          // Filter the display to only datanodes with volume failures.
          if (p.volfails > 0) {
            p.name = n;
            res.push(p);
          }
        }
        return res;
      }

      r.LiveNodes = node_map_to_array(JSON.parse(r.LiveNodes));
      return r;
    }

    $.get(
      '/jmx?qry=Hadoop:service=NameNode,name=NameNodeInfo',
      guard_with_startup_progress(function (resp) {
        var data = workaround(resp.beans[0]);
        var base = dust.makeBase(HELPERS);
        dust.render('datanode-volume-failures', base.push(data), function(err, out) {
          $('#tab-datanode-volume-failures').html(out);
          $('#ui-tabs a[href="#tab-datanode-volume-failures"]').tab('show');
        });
      })).fail(ajax_error_handler);
  }

  function load_snapshot_info() {
    $.get(
      '/jmx?qry=Hadoop:service=NameNode,name=SnapshotInfo',
      guard_with_startup_progress(function (resp) {
      dust.render('snapshot-info', resp.beans[0], function(err, out) {
          $('#tab-snapshot').html(out);
          $('#ui-tabs a[href="#tab-snapshot"]').tab('show');
        });
      })).fail(ajax_error_handler);
  }

  function load_page() {
    var hash = window.location.hash;
    switch(hash) {
      case "#tab-datanode":
        load_datanode_info();
        break;
      case "#tab-datanode-volume-failures":
        load_datanode_volume_failures();
        break;
      case "#tab-snapshot":
        load_snapshot_info();
        break;
      case "#tab-startup-progress":
        load_startup_progress();
        break;
      case "#tab-overview":
        load_overview();
        break;
      default:
        window.location.hash = "tab-overview";
        break;
    }
  }
  load_page();

  $(window).bind('hashchange', function () {
    load_page();
  });
})();

function open_hostip_list(x0, x1) {
  close_hostip_list();
  var ips = new Array();
  for (var i = 0; i < liveNodes.length; i++) {
    var dn = liveNodes[i];
    var index = (dn.usedSpace / dn.capacity) * 100.0;
    if (index == 0) {
      index = 1;
    }
    //More than 100% do not care,so not record in 95%-100% bar
    if (index > x0 && index <= x1) {
      ips.push(dn.infoAddr.split(":")[0]);
    }
  }
  var ipsText = '';
  for (var i = 0; i < ips.length; i++) {
    ipsText += ips[i] + '\n';
  }
  var histogram_div = document.getElementById('datanode-usage-histogram');
  histogram_div.setAttribute('style', 'position: relative');
  var ips_div = document.createElement("textarea");
  ips_div.setAttribute('id', 'datanode_ips');
  ips_div.setAttribute('rows', '8');
  ips_div.setAttribute('cols', '14');
  ips_div.setAttribute('style', 'position: absolute;top: 0px;right: -38px;');
  ips_div.setAttribute('readonly', 'readonly');
  histogram_div.appendChild(ips_div);

  var close_div = document.createElement("div");
  histogram_div.appendChild(close_div);
  close_div.setAttribute('id', 'close_ips');
  close_div.setAttribute('style', 'position: absolute;top: 0px;right: -62px;width:20px;height;20px');
  close_div.setAttribute('onclick', 'close_hostip_list()');
  close_div.innerHTML = "X";
  ips_div.innerHTML = ipsText;
}

function close_hostip_list() {
  $("#datanode_ips").remove();
  $("#close_ips").remove();
}
