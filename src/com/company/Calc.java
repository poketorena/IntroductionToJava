package com.company;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        int total = tasu(a, b);
        int delta = hiku(a, b);
        System.out.println("足すと" + total + "引くと" + delta);
    }

    private static int tasu(int a, int b) {
        return a + b;
    }

    private static int hiku(int a, int b) {
        return a - b;
    }
}
