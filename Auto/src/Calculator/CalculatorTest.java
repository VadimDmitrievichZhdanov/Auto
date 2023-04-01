package Calculator;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @org.junit.jupiter.api.Test
    void addTest() {
        assertEquals(2, calculator.add(1, 1));
    }

    @org.junit.jupiter.api.Test
    void addTestUnEquals() {
        assertNotEquals(5, calculator.add(2, 2));
    }

    @org.junit.jupiter.api.Test
    void sub() {
        assertEquals(0, calculator.sub(1, 1));
    }

    @org.junit.jupiter.api.Test
    void mul() {
        assertEquals(20, calculator.mul(4, 5));
    }

    @org.junit.jupiter.api.Test
    void div() {
        assertEquals(2, calculator.div(10, 5));
    }

    @org.junit.jupiter.api.Test
    void pow() {
        assertEquals(BigInteger.valueOf(3125), calculator.pow(BigInteger.valueOf(5), 5));
    }
}