package Calculator;

import java.math.BigInteger;
import java.security.InvalidParameterException;

public class Calculator {
    private double result; // TODO: Impl me!

    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double mul(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        if (b == 0) {
            throw new InvalidParameterException("Error: b == 0");
        }
        return a / b;
    }

    public BigInteger pow(BigInteger a, int b) {
        return a.pow(b);
    }
}


