package com.company;

import java.util.Scanner;

public class Main {
    public static void incArray(int[] array) {
        for (var i = 0; i < array.length; i++) {
            array[i]++;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        incArray(array);

        for (var i : array) {
            System.out.println(i);
        }
    }
}
