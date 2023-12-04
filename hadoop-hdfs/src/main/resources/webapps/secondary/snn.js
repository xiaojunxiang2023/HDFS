(function () {
    "use strict";

    var data = {};
    var outstanding_requests = 2;

    dust.loadSource(dust.compile($('#tmpl-snn').html(), 'snn'));

    function show_error_msg(msg) {
        $('#alert-panel-body').html(msg);
        $('#alert-panel').show();
    }

    function finished_request() {
        outstanding_requests--;
        if (outstanding_requests == 0) {
            if (data.snn !== undefined && data.conf !== undefined) {
                var conf = data.conf;
                data.snn.CheckpointPeriod = conf['dfs.namenode.checkpoint.period'];
                data.snn.TxnCount = conf['dfs.namenode.checkpoint.txns'];
                render();
            } else {
                show_error_msg('Failed to load the information.');
            }
        }
    }

    function load() {
        $.getJSON('/jmx?qry=Hadoop:service=SecondaryNameNode,name=SecondaryNameNodeInfo', function (resp) {
            data.snn = resp.beans[0];
        }).always(finished_request);

        $.ajax({'url': '/conf', 'dataType': 'xml'}).done(function (d) {
            var $xml = $(d);
            var confs = {};
            $xml.find('property').each(function (idx, v) {
                confs[$(v).find('name').text()] = $(v).find('value').text();
            });
            data.conf = confs;
        }).always(finished_request);
    }

    function render() {
        dust.render('snn', data, function (err, out) {
            $('#tab-overview').html(out);
            $('#tab-overview').addClass('active');
        });
    }

    load();
})();
