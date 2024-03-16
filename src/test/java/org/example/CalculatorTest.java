package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    //Test for factorial function
    @Test
    void shouldThrowErrorForFactorialOfNegaticeNumber() {
        //Arrange
        assertThrows(IllegalArgumentException.class, ()-> new Calculator().factorial(-2));
    }

    @Test
    void shouldReturnFactorialZero() {
        //Arrange
        int actualValue = 1;
        int number = 0;
        Calculator calculator = new Calculator();

        //Act
        int expectedValue = calculator.factorial(number);

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    void shouldReturnFactorialOfFive() {
        int actualValue = 120;
        int number = 5;
        Calculator calculator = new Calculator();

        int expectedValue = calculator.factorial(number);

        assertEquals(expectedValue, actualValue);
    }

    // Test for power function
    @Test
    void shouldReturnNumberRaisedToZero() {
        // Arrange
        double actualValue = 1;
        double base = 10;
        double expo = 0;
        Calculator calculator = new Calculator();

        //Act
        double expectedValue;
        expectedValue = calculator.power(base, expo);

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    void shouldReturnNumberRaisedToNegativeNumber() {
        // Arrange
        double actualValue = 0.25;
        double base = 2;
        double expo = -2;
        Calculator calculator = new Calculator();

        //Act
        double expectedValue;
        expectedValue = calculator.power(base, expo);

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    void shouldReturnNumberRaisedToNumber() {
        // Arrange
        double actualValue = 25;
        double base = 5;
        double expo = 2;
        Calculator calculator = new Calculator();

        //Act
        double expectedValue;
        expectedValue = calculator.power(base, expo);

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    //Test for sqrt function
    @Test
    void shouldReturnRootOfAPositiveNumber() {
        // Arrange
        int actualValue = 4;
        double number = 16;
        Calculator calculator = new Calculator();

        //Act
        int expectedValue;
        expectedValue = calculator.sqrt(number);

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    void shouldThrowErrorForSquareRootOfNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> new Calculator().sqrt(-2));
    }

    @Test
    void shouldReturnLogToTheBase10() {
        //Arrange
        double actualValue = 2.0;
        double number = 100.0;
        Calculator calculator = new Calculator();

        //Act
        double expectedValue;
        expectedValue = calculator.log(number);

        //Assert
        assertEquals(expectedValue, actualValue);

    }

}