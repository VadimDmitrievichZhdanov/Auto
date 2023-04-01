package Calculator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidParameterException;
import java.util.Properties;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        double result; // TODO: Impl me!
        FileWriter fWriter = null;
        try {
            File outputFile = new File("CalculatorOutput.txt");
            fWriter = new FileWriter(outputFile, true);
            Scanner scanner = new Scanner(outputFile);

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

            Properties props = new Properties();
            FileInputStream inputStream = new FileInputStream("config.properties");
            props.load(inputStream);


        } catch (IOException ex) {
            System.out.println(ex.toString());
        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            try {
                if (fWriter != null) {
                    fWriter.close();
                }
            } catch (IOException exception) {
                System.out.println(exception.toString());
            }
        }
    }

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

    public double pow(double a, double b) {
        return Math.pow(a, b);
    }

}
