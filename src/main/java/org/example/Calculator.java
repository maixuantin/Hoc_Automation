package org.example;

public class Calculator {
    /**
     * Addition Method
     *
     * @param a value a
     * @param b value b
     * @return result
     */
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    /**
     * Subtraction Method
     *
     * @param a value a
     * @param b value b
     * @return result
     */
    public static int minus(int a, int b) {
        return a - b;
    }

    /**
     * Multiplication Method
     *
     * @param a value a
     * @param b value b
     * @return result
     */
    public static int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Division Method
     *
     * @param a value a
     * @param b value b
     * @return result
     */
    public static double divide(double a, double b) {
        return a / b;
    }

    /**
     * Modulus Method
     *
     * @param a value a
     * @param b value b
     * @return result
     */
    public static int modulus(int a, int b) {
        return a % b;
    }

    /**
     * Print Result
     *
     * @param result result
     */
    public static void print(String result) {
        System.out.println("Result: " + result);
    }
}
