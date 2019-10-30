package com.company;


public class Main {
    public static void main(String[] args) {
        int[] scores1 = new int[5];
        var scores2 = new int[5];
        var scores3 = new int[]{1, 2, 3, 4, 5};
        int[] scores4 = {10, 20, 30, 40, 50};

        int scoresCount1 = scores1.length;
        int scoresCount2 = scores2.length;
        int scoresCount3 = scores3.length;
        int scoresCount4 = scores3.length;
        System.out.println("scores1の要素数:" + scoresCount1);
        System.out.println("scores2の要素数:" + scoresCount2);
        System.out.println("scores3の要素数:" + scoresCount3);
        System.out.println("scores4の要素数:" + scoresCount4);

        for (int i = 0; i < scores1.length; i++) {
            scores1[i] = i;
        }
        for (int i = 0; i < scores2.length; i++) {
            scores2[i] = (i + 1) * 111;
        }

        for (var score : scores1) {
            System.out.println(score);
        }
        for (var score : scores2) {
            System.out.println(score);
        }
        for (var score : scores3) {
            System.out.println(score);
        }
        for (var score : scores4) {
            System.out.println(score);
        }
    }
}
