def call(Map config) {
    echo "App ${config.APP_NAME} with version ${config.APP_VERSION}"
    echo "Using build tool ${config.BUILD_TOOL} in environment ${config.ENVIRONMENT}"
}
