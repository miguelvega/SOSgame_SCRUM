package com.example.activity;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private static Calculadora calculadora;

    @BeforeAll
    public static void init(){
        calculadora = new Calculadora();
    }

    @Test
    public void whenCalculatorInitializedThenReturnTrue() {
        assertTrue(calculadora.getStatus());
    }
    @Test
    public void whenAdditionTwoNumberThenReturnCorrectAnswer() {
        assertEquals( 5, calculadora.addition(2,3));
    }
    @Test
    public void whenSubtractionTwoNumberThenReturnCorrectAnswer() {
        assertEquals( 7, calculadora.subtraction(10,3));
    }
    @Test
    public void whenDivisionThenReturnCorrectAnswer() {
        assertEquals(2, calculadora.division(8, 4));
    }
    @Test
    public void whenDivisionByZeroThenThrowException() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            calculadora.division(5, 0);
        });
        assertEquals("No se puede divisor por cero", exception.getMessage());
    }
    @Test
    public void whenMultiplicationTwoNumberThenReturnCorrectAnswer() {
        assertEquals( 10, calculadora.multiplication(2,5));
    }
    @Test
    public void whenPowerThenReturnCorrectAnswer() {
        assertEquals( 25.0, calculadora.power(5.0,2.0));
    }
    @Test
    public void whenSquareRootThenReturnCorrectAnswer() {
        assertEquals( 10.0, calculadora.squareRoot(100.0));
    }
    @Test
    public void whenSquareRootOfNegativeNumberThenThrowException() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            calculadora.squareRoot(-100.0);
        });
        assertEquals("No se puede obtener la raíz de un negativo", exception.getMessage());
    }

}

