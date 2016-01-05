package com.example.helloworld;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

import static com.example.helloworld.HelloWorld.*;
import static org.junit.Assert.*;

/**
 * Created by bjorn on 1/4/16.
 */
public class HelloWorldTest {

    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private HelloWorld newPrinter;
    String message = "Hello World!";


    @Before
    public void setUp() throws UnsupportedEncodingException {
        newPrinter = new HelloWorld(message);
        System.setOut(new PrintStream(output, true, "UTF-8"));
    }

    @Test
    public void testPrintMessage() {
        assertEquals(message,newPrinter.printMessage());
    }

    @After
    public void cleanUp() {
        System.setOut(stdout);
    }
}

