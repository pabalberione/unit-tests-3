package com.telusko.learning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @Test
    void test(){
        var c = new Calc();
        int actual = c.divide(10, 5);
        assertEquals(2,actual);
    }
}