package com.example.helloworld;

import org.junit.Test;

import static com.example.helloworld.HelloWorld.*;
import static org.junit.Assert.*;

/**
 * Created by bjorn on 1/4/16.
 */
public class HelloWorldTest {

    String message = "Hello World";
    HelloWorld newPrinter = new HelloWorld(message);

    @Test
    public void testPrintMessage() {
        assertEquals(message,newPrinter.printMessage());
    }
}

