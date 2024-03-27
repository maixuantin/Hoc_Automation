package org.example;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào một số: ");
        int soNguyen = sc.nextInt();
        if (soNguyen % 2 == 0) {
            System.out.println(soNguyen + " là số chẵn");
        }
        else {
            System.out.println(soNguyen + " là số lẻ");
        }*/
        int num = input();
        checkEvenOdd(num);
    }

    static void checkEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " là số chẵn");
        } else {
            System.out.println(number + " là số lẻ");
        }
    }

    static int input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Mời nhập vào một số: ");
        return in.nextInt();
    }
}
