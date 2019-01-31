if (process.env.NODE_ENV === "production") {
    const opt = require("./$name$-opt.js");
    opt.main();
    module.exports = opt;
} else {
    var exports = window;
    exports.require = require("./$name$-fastopt-entrypoint.js").require;
    window.global = window;

    const fastOpt = require("./$name$-fastopt.js");
    fastOpt.main()
    module.exports = fastOpt;

    if (module.hot) {
        module.hot.accept();
    }
}
