package com.company;

import java.util.Scanner;

public class Main {
    public static int add(int x, int y) {
        return x + y;
    }

    public static double add(double x, double y) {
        return x + y;
    }

    public static String add(String x, String y) {
        return x + y;
    }

    public static void main(String[] args) {
        var result1 = add(10, 20);
        var result2 = add(3.5, 2.7);
        var result3 = add("Hello", "World");

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
