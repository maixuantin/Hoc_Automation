package org.example;

import java.util.ArrayList;

public class JavaArrays {
    public static void main(String[] args) {
        int[] soNguyen = {23, 65, 73, 19, 43, 65, 55, 100, 19, 9, 93};
        /*int maxValue = findMax(soNguyen);
        print(maxValue);
        int minValue = findMin(soNguyen);
        print(minValue);
        int sumValue = calcSum(soNguyen);
        print(sumValue);
        print(sortAscending(soNguyen));
        print(sortDescending(soNguyen));
        findDuplicate(soNguyen);
        print(findDuplicate2(soNguyen));*/
        /*ArrayList<Integer> abc = new ArrayList<>();
        abc.add(10);
        abc.add(20);
        abc.add(30);
        abc.add(10);
        abc.add(10);
        System.out.println(abc);*/
        print(removeDuplicate(soNguyen));
    }

    static int findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    static int findMin(int[] array) {
        int min = array[0];
        for (int j = 0; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
            }
        }
        return min;
    }

    static int calcSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    static int[] sortAscending(int[] intArray) {
        int temp = 0;
        //print original array
        System.out.println("\nOriginal array: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        //Sort the array in ascending order using two for loops
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] > intArray[j]) {      //swap elements if not in order
                    temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }

        return intArray;
    }

    static int[] sortDescending(int[] intArray) {
        int temp = 0;
        //print original array
        System.out.println("\nOriginal array: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        //Sort the array in descending order using two for loops
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] < intArray[j]) {      //swap elements if not in order
                    temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }

        return intArray;
    }

    static void findDuplicate(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] == intArray[j]) {
                    System.out.println("\nSố bị trùng là: " + intArray[i]);
                }
            }
        }
    }

    static ArrayList<Integer> findDuplicate2(int[] intArray) {
        ArrayList<Integer> duplicateArray = new ArrayList<>();
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] == intArray[j]) {
                    duplicateArray.add(intArray[i]);
                }
            }
        }
        return duplicateArray;
    }

    static ArrayList<Integer> removeDuplicate(int[] intArray) {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < intArray.length; i++) {
            array.add(intArray[i]);
        }
        System.out.println(array.size());
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] == intArray[j]) {
                    array.remove(Integer.valueOf(intArray[i]));
                }
            }
        }
        System.out.println(array.size());
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
        return array;
    }

    static void print(int number) {
        System.out.println("Result: " + number);
    }

    static void print(int[] intArray) {
        System.out.println("\nArray sorted: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
    }

    static void print(ArrayList<Integer> intArray) {
        for (int i = 0; i < intArray.size(); i++) {
            System.out.println("Array: " + intArray.get(i));
        }
    }
}