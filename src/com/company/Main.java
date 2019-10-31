package com.company;

import java.util.Scanner;

public class Main {
    public static void introduceOneself() {
        String name = "Java仙人";
        int age = 999;
        double height = 123.45;
        char gender = '男';

        System.out.println("こんにちは、私の名前は" + name + "です。");
        System.out.println("年齢は" + age + "です。");
        System.out.println("身長は" + height + "です。");
        System.out.println("性別は" + gender + "です。");
        System.out.println("よろしくおねがいします。");
    }

    public static void main(String[] args) {
        introduceOneself();
    }
}
