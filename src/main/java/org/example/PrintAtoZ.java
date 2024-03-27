package org.example;

public class PrintAtoZ {
    public static void main(String[] args) {
        printAlphabets();
    }

    /**
     * for A  > Z
     */
    static void printAlphabets() {
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + "\t");
        }
    }

    /**
     * for a > z
     */
    static void printAlphabets2() {
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + "\t");
        }
    }

    /**
     * for A > Z ASII
     */
    static void printAlphabets3() {
        for (char i = 65; i <= 90; i++) {
            System.out.print(i + "\t");
        }
    }

    /**
     * for a > z ASII
     */
    static void printAlphabets4() {
        for (char i = 97; i <= 122; i++) {
            System.out.print(i + "\t");
        }
    }

    /**
     * while A > Z
     */
    static void printAlphabets5() {
        char i = 'A';
        while (i <= 'Z') {
            System.out.print(i + "\t");
            i++;
        }
    }

    /**
     * while a > z
     */
    static void printAlphabets6() {
        char j = 'a';
        while (j <= 'z') {
            System.out.print(j + "\t");
            j++;
        }
    }

    /**
     * do while A > Z
     */
    static void printAlphabets7() {
        char a = 'A';
        do {
            System.out.print(a + "\t");
            a++;
        } while (a <= 'Z');
    }

    /**
     * do while a > z
     */
    static void printAlphabets8() {
        char b = 'a';
        do {
            System.out.print(b + "\t");
            b++;
        } while (b <= 'z');
    }
}