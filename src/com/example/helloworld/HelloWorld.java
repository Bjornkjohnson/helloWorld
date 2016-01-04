package com.example.helloworld;

/**
 * Created by bjorn on 1/4/16.
 */
public class HelloWorld {
    private String message;

    //Constructor
    public HelloWorld(String message){
        this.message = message;
    }

    // prints the message
    public String printMessage(){
        System.out.println(message);
        return message;
    }

    public static void main(String[] args) {

    }
}
