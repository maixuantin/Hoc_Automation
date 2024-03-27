package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        print(add(a,b));
        print(add(c,d));
    }

    /**
     * Add method
     * @param a value a
     * @param b value b
     * @return result
     */
    static int add(int a, int b){
        return a + b;
    }
    static void print(int result){
        System.out.println("Result: " +result);
    }
}