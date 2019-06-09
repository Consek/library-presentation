def call(Map config){
    echo config.preMakeCommand
    echo "make ${config.makeParam}"
}