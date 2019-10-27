package com.company;

public class Main {
    /* コメントだよ */
    // コメントだよ
    public static void main(String[] args) {
        // int型リテラルをbyte型やshort型の変数に対して実害のない範囲で、
        // 単純代入することは例外的に認められている。

        // 符号付きbyte（-128～+127）
        byte b1 = 127;
        // これはだめ
        // byte b2=128;

        // 符号付きshort（-327678～+32767）
        short s1 = 32767;
        // これはだめ
        // short s2=327678;
    }
}
