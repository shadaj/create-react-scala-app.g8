# Create React Scala App
Create [React](https://facebook.github.io/react/) apps in [Scala](https://scala-lang.org/) (via [Slinky](https://github.com/shadaj/slinky)) with no build configuration

Based on https://github.com/facebookincubator/create-react-app

## Quick Overview
Make sure you have SBT and NPM installed.

```sh
sbt new shadaj/create-react-scala-app.g8
... follow instructions to create your app

cd my-app/
sbt ";fastOptJS::startWebpackDevServer;~fastOptJS"
```

Then open http://localhost:8080 to see your app.
When you're ready to deploy to production, create a minified bundle with `sbt fullOptJS::webpack`

### Get Started Immediately
You **don’t** need to install or configure tools like Webpack or Babel.
They are preconfigured and hidden so that you can focus on the code.

Just create a project, and you’re good to go.

## Getting Started
### Installation
To use create-react-scala-app, you'll need SBT, which is the primary build tool, and NPM, which is used to pull in JavaScript dependencies and bundle your application with Webpack.

**You’ll need to have Node >= 6 on your machine.** You can use [nvm](https://github.com/creationix/nvm#installation) to easily switch Node versions between different projects.

**This tool doesn’t assume a Node backend.** The Node installation is only required for Create React App itself.

### Creating an App
To create a new app, run: `sbt new shadaj/create-react-scala-app.g8`, follow the instructions that follow, then `cd my-app`.

This will create a folder `my-app` inside the current folder.
Inside that directory, it will generate the initial project structure:
```
my-app
├── build.sbt
├── hot-launcher.js
├── opt-launcher.js
├── webpack-fastopt.config.js
├── webpack-opt.config.js
├── project
│   └── build.properties
│   └── plugins.sbt
├── public
│   └── favicon.ico
│   └── index.html
│   └── manifest.json
└── src
    └── main
        └── resources
            └── App.css
            └── index.css
            └── logo.svg
        └── scala
            └── hello/world
                └── App.scala
                └── Main.scala
```

No configuration or complicated folder structures, just the files you need to build your app.
Once the installation is done, you can run some commands inside the project folder:

### `sbt ";fastOptJS::startWebpackDevServer;~fastOptJS"`
Runs the app in development mode with hot-reloading enabled.
Open http://localhost:8080 to see your app

The page will automatically reload if you make changes to the code. You will see compilation and Webpack errors in your console.

### `sbt fullOptJS::webpack`
Builds the app for production to the `build` folder. It correctly bundles React in production mode and optimizes the build for the best performance. It also minifies the build using UglifyJS.

**Note:** there is currently a bug that causes execution of this command to always end in an exception. It is safe to ignore this exception, since the build folder will still be correctly generated.

Your app is ready to be deployed.
