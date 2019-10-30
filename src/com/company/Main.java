package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{3, 4, 9};
        System.out.println("1桁の数字を入力してください");
        int input = new Scanner(System.in).nextInt();

        for (var number : numbers) {
            if (input == number) {
                System.out.println("アタリ！");
            }
        }
    }
}
