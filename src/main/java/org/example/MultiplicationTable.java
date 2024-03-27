package org.example;

public class MultiplicationTable {
    public static void main(String[] args) {
        //bảng cứu chương
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int result = i * j;
                System.out.println(i + "*" + j + "=" + result);
            }
        }
    }
}
