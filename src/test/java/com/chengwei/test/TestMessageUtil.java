package com.chengwei.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestMessageUtil {
    String message = "Robert";   
    MessageUtil messageUtil = new MessageUtil(message);
    
    @Test
    public void testPrintMessage() { 
        System.out.println("Inside testPrintMessage()");
        assertTrue(message.equals(messageUtil.printMessage()));
    }
    
    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
        message = "Hi!" + "Robert";
        assertTrue(message.equals(messageUtil.salutationMessage()));
    }
    
}
