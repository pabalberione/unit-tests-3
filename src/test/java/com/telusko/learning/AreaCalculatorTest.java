package com.telusko.learning;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreaCalculatorTest {

    private AreaCalculator areaCalculator;

    @BeforeEach
    public void init(){
        this.areaCalculator = new AreaCalculator();
    }

    @Test
    void testAreaCuadrado() {
        //Given
        double lado = 4.0;
        //Then
        assertEquals(16,areaCalculator.areaCuadrado(lado));

    }

    @Test
    void testAreaRectangulo() {
        //Given
        double largo = 4.0;
        double ancho = 6.0;
        //Then
        assertEquals(24,areaCalculator.areaRectangulo(largo, ancho));
    }

    @Test
    void testAreaCirculo() {
        //Given
        double radio = 15.0;
        //Then
        assertEquals(706.8583470577034,areaCalculator.areaCirculo(radio));
    }

    @Test
    void testAreaTriangulo() {
        //Given
        double base = 2.0;
        double altura = 5.0;
        //Then
        assertEquals(5,areaCalculator.areaTriangulo(base, altura));
    }

    @Test
    void testAreaTrapecio() {
        //Given
        double baseMayor = 2.0;
        double baseMenor = 6.0;
        double altura = 3.0;
        //Then
        assertEquals(12,areaCalculator.areaTrapecio(baseMayor, baseMenor, altura));
    }

    @Test
    void testAreaParalelogramo() {
        //Given
        double base = 6;
        double altura = 4;
        //Then
        assertEquals(24, areaCalculator.areaParalelogramo(base, altura));
    }

    @Test
    void testAreaRombo() {
        //Given
        double diagonalMayor = 7;
        double diagonalMenor = 4;
        //Then
        assertEquals(14, areaCalculator.areaRombo(diagonalMayor, diagonalMenor));
    }

    @Test
    void testAreaElipse() {
        //Given
        double ejeMayor = 6;
        double ejeMenor = 4;
        //Then
        assertEquals(75.39822368615503,areaCalculator.areaElipse(ejeMayor, ejeMenor));
    }
}