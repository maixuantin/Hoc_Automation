package org.example;

public class JavaArrays_FindElementInArray {
    public static void main(String[] args) {
        int[] soNguyen = {23, 65, 73, 19, 43, 65, 55, 100, 83, 9, 93};
        int x = 100;
        String result = "Number not found";
        for (int i = 0; i < soNguyen[i]; i++) {
            if (x == soNguyen[i]) {
                result = "Found number: " + x;
                break;
            }
        }
        System.out.println(result);
    }
}
