(function () {
    "use strict";

    var data = {};

    dust.loadSource(dust.compile($('#tmpl-jn').html(), 'jn'));

    var BEANS = [
        {"name": "jn", "url": "/jmx?qry=Hadoop:service=JournalNode,name=JournalNodeInfo"},
        {"name": "journals", "url": "/jmx?qry=Hadoop:service=JournalNode,name=Journal-*"}

    ];

    var HELPERS = {
        'helper_date_tostring': function (chunk, ctx, bodies, params) {
            var value = dust.helpers.tap(params.value, chunk, ctx);
            return chunk.write('' + moment(Number(value)).format('ddd MMM DD HH:mm:ss ZZ YYYY'));
        }
    };

    load_json(
        BEANS,
        guard_with_startup_progress(function (d) {
            for (var k in d) {
                data[k] = k === 'journals' ? workaround(d[k].beans) : d[k].beans[0];
            }
            render();
        }),
        function (url, jqxhr, text, err) {
            show_err_msg('<p>Failed to retrieve data from ' + url + ', cause: ' + err + '</p>');
        });

    function guard_with_startup_progress(fn) {
        return function () {
            try {
                fn.apply(this, arguments);
            } catch (err) {
                if (err instanceof TypeError) {
                    show_err_msg('JournalNode error: ' + err);
                }
            }
        };
    }

    function workaround(journals) {
        for (var i in journals) {
            journals[i]['NameService'] = journals[i]['modelerType'].split("-")[1];
        }

        return journals;
    }

    function render() {
        var base = dust.makeBase(HELPERS);
        dust.render('jn', base.push(data), function (err, out) {
            $('#tab-overview').html(out);
            $('#tab-overview').addClass('active');
        });
    }

    function show_err_msg() {
        $('#alert-panel-body').html("Failed to load journalnode information");
        $('#alert-panel').show();
    }
})();
