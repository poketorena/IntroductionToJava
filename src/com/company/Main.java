package com.company;

import java.util.Scanner;

public class Main {
    public static double calcTriangleArea(double bottom, double height) {
        return bottom * height / 2;
    }

    public static double calcCircleArea(double radius) {
        return radius * radius * 3.14;
    }

    public static void main(String[] args) {
        double triangleArea = calcTriangleArea(10.0, 5.0);
        System.out.println(triangleArea);

        double circleArea = calcCircleArea(5.0);
        System.out.println(circleArea);
    }
}
