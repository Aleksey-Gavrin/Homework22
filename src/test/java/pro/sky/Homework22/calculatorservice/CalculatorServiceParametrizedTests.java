package pro.sky.Homework22.calculatorservice;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceParametrizedTests {
    CalculatorService calculatorService = new CalculatorService();
    static Stream<Arguments> getArgs(){
        return Stream.of(
                Arguments.of(1,2),
                Arguments.of(10,-2),
                Arguments.of(128,254),
                Arguments.of(-18,-20)
        );
    }
    @ParameterizedTest
    @MethodSource("getArgs")
    void sum(int x, int y){
        int expected = x + y;
        assertEquals(expected, calculatorService.sum(x,y));
    }
    @ParameterizedTest
    @MethodSource("getArgs")
    void minus(int x, int y){
        int expected = x - y;
        assertEquals(expected, calculatorService.minus(x,y));
    }
    @ParameterizedTest
    @MethodSource("getArgs")
    void divide(int x, int y){
        int expected = x / y;
        assertEquals(expected, calculatorService.divide(x,y));
    }
    @ParameterizedTest
    @MethodSource("getArgs")
    void multiply(int x, int y){
        int expected = x * y;
        assertEquals(expected, calculatorService.multiply(x,y));
    }
}
