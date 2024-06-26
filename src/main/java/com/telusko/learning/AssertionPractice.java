package com.telusko.learning;

public class AssertionPractice {
    // Método que retorna la suma de dos números
    public int sum(int a, int b) {
        return a + b;
    }

    // Método que verifica si un número es par
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Método que retorna una cadena en mayúsculas
    public String toUpperCase(String input) {
        return input.toUpperCase();
    }

    // Método que retorna el tamaño de una cadena
    public int getLength(String input) {
        return input.length();
    }

    // Método que verifica si una cadena es vacía
    public boolean isEmpty(String input) {
        return input.isEmpty();
    }

    // Método que lanza una excepción si el número es negativo
    public void checkPositive(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
    }

    // Método que retorna el mayor de dos números
    public int max(int a, int b) {
        return Math.max(a, b);
    }

    // Método que retorna una subcadena
    public String substring(String input, int beginIndex, int endIndex) {
        return input.substring(beginIndex, endIndex);
    }

    // Método que verifica si una cadena contiene otra cadena
    public boolean contains(String input, String substring) {
        return input.contains(substring);
    }

    // Método que retorna el factorial de un número
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
