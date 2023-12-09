(function () {
    "use strict";

    var data = {};

    dust.loadSource(dust.compile($('#tmpl-dn').html(), 'dn'));

    function load() {
        $.get('/jmx?qry=Hadoop:service=DataNode,name=DataNodeInfo', function (resp) {
            data.dn = workaround(resp.beans[0]);
            data.dn.HostName = resp.beans[0]['DatanodeHostname'];
            render();
        }).fail(show_err_msg);
    }

    function workaround(dn) {
        function node_map_to_array(nodes) {
            var res = [];
            for (var n in nodes) {
                var p = nodes[n];
                p.name = n;
                res.push(p);
            }
            return res;
        }

        dn.VolumeInfo = node_map_to_array(JSON.parse(dn.VolumeInfo));
        dn.BPServiceActorInfo = JSON.parse(dn.BPServiceActorInfo);

        return dn;
    }

    function render() {
        var base = dust.makeBase({
            'helper_relative_time': function (chunk, ctx, bodies, params) {
                var value = dust.helpers.tap(params.value, chunk, ctx);
                return chunk.write(moment().subtract(Number(value), 'seconds').fromNow(true));
            }
        });
        dust.render('dn', base.push(data), function (err, out) {
            $('#tab-overview').html(out);
            $('#tab-overview').addClass('active');
        });
    }

    function show_err_msg() {
        $('#alert-panel-body').html("Failed to load datanode information");
        $('#alert-panel').show();
    }

    load();

})();
