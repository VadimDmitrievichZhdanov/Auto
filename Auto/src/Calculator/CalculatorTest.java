package Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class CalculatorTest {
    private final Calculator calculator = new Calculator();

    //Сложение:
    @org.junit.jupiter.api.Test
    void addTest() {
        assertEquals(2, calculator.add(1, 1));
    }

    @org.junit.jupiter.api.Test
    void addTest1() {
        assertEquals(545, calculator.add(544, 1));
    }

    @org.junit.jupiter.api.Test
    void addTest2() {
        assertEquals(2, calculator.add(-1, 3));
    }

    @org.junit.jupiter.api.Test
    void addTest4() {
        assertEquals(1, calculator.add(0.1, 0.9));
    }

    //Сложение завал:
    @org.junit.jupiter.api.Test
    void addTestUnEquals() {
        assertNotEquals(5, calculator.add(2, 2));
    }

    @org.junit.jupiter.api.Test
    void addTestUnEquals1() {
        assertNotEquals(44, calculator.add(-2, 20008));
    }

    @org.junit.jupiter.api.Test
    void addTestUnEquals3() {
        assertNotEquals(5, calculator.add(-2, -3));
    }

    //Вычитание:
    @org.junit.jupiter.api.Test
    void sub() {
        assertEquals(0, calculator.sub(1, 1));
    }

    @org.junit.jupiter.api.Test
    void sub1() {
        assertEquals(10, calculator.sub(20, 10));
    }

    @org.junit.jupiter.api.Test
    void sub2() {
        assertEquals(-555, calculator.sub(-999, -444));
    }

    @org.junit.jupiter.api.Test
    void sub3() {
        assertNotEquals(0, calculator.sub(10, -10.1));
    }

    //Умножение:
    @org.junit.jupiter.api.Test
    void mul() {
        assertEquals(20, calculator.mul(4, 5));
    }

    @org.junit.jupiter.api.Test
    void mul2() {
        assertEquals(0, calculator.mul(434, 0));
    }

    @org.junit.jupiter.api.Test
    void mul3() {
        assertNotEquals(0, calculator.mul(434, 12));
    }

    //Деление:
    @org.junit.jupiter.api.Test
    void div() {
        assertEquals(2, calculator.div(10, 5));
    }

    @org.junit.jupiter.api.Test
    void div1() {
        assertEquals(0, calculator.div(0, 5));
    }

    @org.junit.jupiter.api.Test
    void div3() {
        assertNotEquals(19.5, calculator.div(1, 59.5));
    }

    //возведение в степень:
    @org.junit.jupiter.api.Test
    void pow() {
        assertEquals(3125, calculator.pow(5, 5));
    }

    @org.junit.jupiter.api.Test
    void pow1() {
        assertEquals(1, calculator.pow(1, 0));
    }

    @org.junit.jupiter.api.Test
    void pow2() {
        assertNotEquals(0, calculator.pow(1, 1));
    }
}