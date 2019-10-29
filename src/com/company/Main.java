package com.company;

public class Main {
    public static void main(String[] args) {
        String hoge = "qwerty";
        String fuga = new String("qwerty");

        System.out.println("hoge:" + hoge);
        System.out.println("fuga:" + fuga);

        if (hoge.equals(fuga)) {
            System.out.println("同じだよ");
        } else {
            System.out.println("違うよ");
        }
    }
}
