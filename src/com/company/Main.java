package com.company;

import java.util.Scanner;

public class Main {
    public static void email(String title, String address, String text) {
        System.out.println(address + "に、以下のメールを送信しました");
        System.out.println("件名：" + title);
        System.out.println("本文：" + text);
    }

    public static void main(String[] args) {
        email("自己紹介", "sample@hoge.com", "こんにちは");
    }
}
