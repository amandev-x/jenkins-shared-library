def call(Map args) {
    echo "App ${args.appName} with version ${args.appVersion}"
    echo "Using build tool ${args.buildTool} in environment ${args.environment}"
}
