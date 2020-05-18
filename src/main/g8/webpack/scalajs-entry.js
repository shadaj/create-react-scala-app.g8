if (process.env.NODE_ENV === "production") {
    const opt = require("./$name;format="lower"$-opt.js");
    opt.main();
    module.exports = opt;
} else {
    var exports = window;
    exports.require = require("./$name;format="lower"$-fastopt-entrypoint.js").require;
    window.global = window;

    const fastOpt = require("./$name;format="lower"$-fastopt.js");
    fastOpt.main()
    module.exports = fastOpt;

    if (module.hot) {
        module.hot.accept();
    }
}
