package com.telusko.learning;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssertionPracticeTest {

    private AssertionPractice assertionPractice;

    @BeforeEach
    public void init(){
        this.assertionPractice = new AssertionPractice();
    }

    @Test
    void testSum() {
        //Given
        int a = 3;
        int b = 2;
        //Then
        assertEquals(5,assertionPractice.sum(a, b));
    }

    @Test
    void testIsEven() {
        //Given
        int number = 4;
        int number2 = 5;
        //Then
        assertTrue(assertionPractice.isEven(number));
        assertFalse(assertionPractice.isEven(number2));
    }

    @Test
    void testToUpperCase() {
        //Given
        String cadena = "acelerar";
        //Then
        assertEquals("ACELERAR",assertionPractice.toUpperCase(cadena));
    }

    @Test
    void testGetLength() {
        //Given
        String cadena = "auto";
        //Then
        assertEquals(4,assertionPractice.getLength(cadena));
    }

    @Test
    void testIsEmpty() {
        //Given
        String cadena = "";
        String cadena1 = "otra";
        //Then
        assertTrue(assertionPractice.isEmpty(cadena));
        assertFalse(assertionPractice.isEmpty(cadena1));
    }

    @Test
    void testCheckPositive() {
        //Given
        int number = -1;
        //Then
        assertThrows(IllegalArgumentException.class, () ->{
            assertionPractice.checkPositive(number);
        });
    }

    @Test
    void testMax() {
        //Given
        int a = 10;
        int b = 13;
        //Then
        assertEquals(13,assertionPractice.max(a, b));
    }

    @Test
    void testSubstring() {
        //Given
        String cadena = "Barometro";
        int beginIndex = 4;
        int endIndex = 9;
        assertEquals("metro", assertionPractice.substring(cadena, beginIndex, endIndex));
    }

    @Test
    void testContains() {
        //Given
        String input = "Kilometro";
        String substring = "metro";
        String substring2 = "calle";
        //Then
        assertTrue(assertionPractice.contains(input,substring));
        assertFalse(assertionPractice.contains(input, substring2));

    }

    @Test
    void testFactorialException() {
        //Given
        int numero = -1;
        //Then
        assertThrows(IllegalArgumentException.class,()->{
            assertionPractice.factorial(numero);
        });
    }

    @Test
    void testFactorial() {
        //Given
        int numero = 1;
        //Then
        assertEquals(1, assertionPractice.factorial(numero));
    }


}