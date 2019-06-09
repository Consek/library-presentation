package com.example

class LoggerClass implements Serializable{
    def context

    def info(String message){
        context.echo "INFO: $message"
    }

    def debug(String message){
        context.echo "DEBUG: $message"
    }
}