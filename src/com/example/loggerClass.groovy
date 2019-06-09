package com.example

def class loggerClass(){
    def info(String message){
        echo "INFO: $message"
    }

    def debug(String message){
        echo "DEBUG: $message"
    }
}