package com.telusko.learning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringJavaTest {

    @Test
    void test(){
        var reverse = new ReverseStringJava();
        assertEquals("avaJ", reverse.reverseString("Java"));
    }
}