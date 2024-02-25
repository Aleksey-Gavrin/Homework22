package pro.sky.Homework22.service;

import org.junit.jupiter.api.Test;
import pro.sky.Homework22.exceptions.DivisionByZeroException;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTests {
    CalculatorService calculatorService = new CalculatorService();

    @Test
    void positiveSum() {
        int x = 5;
        int y = 5;
        int actual = calculatorService.sum(x, y);
        assertEquals(10, actual);
    }

    @Test
    void negativeSum() {
        int x = -5;
        int y = -5;
        int actual = calculatorService.sum(x, y);
        assertEquals(-10, actual);
    }

    @Test
    void positiveMinus() {
        int x = 5;
        int y = 5;
        int actual = calculatorService.minus(x, y);
        assertEquals(0, actual);
    }

    @Test
    void negativeMinus() {
        int x = -5;
        int y = -10;
        int actual = calculatorService.minus(x, y);
        assertEquals(5, actual);
    }

    @Test
    void positiveDivide() {
        int x = 5;
        int y = 5;
        int actual = calculatorService.divide(x, y);
        assertEquals(1, actual);
    }

    @Test
    void negativeDivide() {
        int x = -10;
        int y = -2;
        int actual = calculatorService.divide(x, y);
        assertEquals(5, actual);
    }

    @Test
    void positiveMultiply() {
        int x = 5;
        int y = 5;
        int actual = calculatorService.multiply(x, y);
        assertEquals(25, actual);
    }

    @Test
    void negativeMultiply() {
        int x = -5;
        int y = -10;
        int actual = calculatorService.multiply(x, y);
        assertEquals(50, actual);
    }

    @Test
    void divisionByZero() {
        assertThrows(DivisionByZeroException.class, () -> calculatorService.divide(10, 0));
    }
}
