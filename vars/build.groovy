def call(Map config){
    config.preMakeCommand()
    echo "make ${config.makeParam}"
}