const fs = require("fs");
const path = require("path");
module.exports = function(source) {
  const sourceMapPath = source.substring(
    source.lastIndexOf("//# sourceMappingURL=") + "//# sourceMappingURL=".length
  ).trim();
  
  const map = JSON.parse(fs.readFileSync(sourceMapPath, { encoding: "utf-8" }));
  map.sources = map.sources.map(s => {
    if (s.startsWith("http://") || s.startsWith("https://")) {
      return s;
    } else {
      return "file://" + path.resolve(s);
    }
  })
  
  this.callback(null,
    source,
    JSON.stringify(map)
  );
};
