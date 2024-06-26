package com.telusko.learning;

public class AreaCalculator {
    // Área de un cuadrado
    public double areaCuadrado(double lado) {
        return lado * lado;
    }

    // Área de un rectángulo
    public double areaRectangulo(double largo, double ancho) {
        return largo * ancho;
    }

    // Área de un círculo
    public double areaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    // Área de un triángulo
    public double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    // Área de un trapecio
    public double areaTrapecio(double baseMayor, double baseMenor, double altura) {
        return ((baseMayor + baseMenor) / 2) * altura;
    }

    // Área de un paralelogramo
    public double areaParalelogramo(double base, double altura) {
        return base * altura;
    }

    // Área de un rombo
    public double areaRombo(double diagonalMayor, double diagonalMenor) {
        return (diagonalMayor * diagonalMenor) / 2;
    }

    // Área de una elipse
    public double areaElipse(double ejeMayor, double ejeMenor) {
        return Math.PI * ejeMayor * ejeMenor;
    }
}
