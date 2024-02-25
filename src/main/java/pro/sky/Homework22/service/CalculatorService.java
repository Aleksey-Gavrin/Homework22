package pro.sky.Homework22.service;

import org.springframework.stereotype.Service;
import pro.sky.Homework22.exceptions.DivisionByZeroException;
@Service
public class CalculatorService {

    public int sum(int x, int y) {
        return x + y;
    }

    public int minus(int x, int y) {
        return x - y;
    }

    public int divide(int x, int y) {
        if (y == 0) {
            throw new DivisionByZeroException("Ошибка при попытке деления на 0");
        }
        return x / y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }
}
