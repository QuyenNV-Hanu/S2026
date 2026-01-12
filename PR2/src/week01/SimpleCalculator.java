package week01;

import java.util.Scanner;

public class SimpleCalculator {
    public SimpleCalculator() {

    }

    public static double addition(double a, double b) {
        return a + b;
    }

    public static double subtraction(double a, double b) {
        return a - b;
    }

    public static double multiplication(double a, double b) {
        return a * b;
    }

    public static String division(double a, double b) {
        if (b == 0) {
            return "Cannot divide by zero";
        }
        return (a / b) + "";
    }
}

class Main {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        System.out.println(calculator.addition(5.0, 3.0));
        System.out.println(calculator.subtraction(5.0, 3.0));
        System.out.println(calculator.multiplication(4.0, 2.0));
        System.out.println(calculator.division(4.0, 0));
    }
}
