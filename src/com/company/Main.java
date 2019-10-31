package com.company;

import java.util.Scanner;

public class Main {
    public static int add(int x, int y) {
        return x + y;
    }

    public static int add(int x, int y, int z) {
        return x + y + z;
    }

    public static double add(double x, double y) {
        return x + y;
    }

    public static double add(double x, double y, double z) {
        return x + y + z;
    }

    public static String add(String x, String y) {
        return x + y;
    }

    public static String add(String x, String y, String z) {
        return x + y + z;
    }

    public static void main(String[] args) {
        var result1 = add(10, 20);
        var result2 = add(10, 20, 30);
        var result3 = add(3.5, 2.7);
        var result4 = add(3.5, 2.7, 4.9);
        var result5 = add("Hello", "World");
        var result6 = add("Hello", "World", "!!!");

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
    }
}
