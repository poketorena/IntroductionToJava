public class Main {
    public static void main(String... args) {
        // int型の整数リテラル（10進数）
        int num1 = 123;
        System.out.println(num1);

        // int型の整数リテラル（8進数）
        int num2 = 010; // 先頭に0を付ける
        System.out.println(num2);

        // int型の整数リテラル（16進数）
        int num3 = 0xa; // 先頭に0xまたは0Xを付ける
        int num4 = 0Xa; // 先頭に0xまたは0Xを付ける
        System.out.println(num3);
        System.out.println(num4);

        // int型の整数リテラル（2進数）
        int num5 = 0b11; // 先頭に0bまたは0Bを付ける
        int num6 = 0B11; // 先頭に0bまたは0Bを付ける
        System.out.println(num5);
        System.out.println(num6);

        // long型の整数リテラル
        long longNum1 = 100000000000000000l;//末尾にlまたはLを付ける
        long longNum2 = 100000000000000000L;//末尾にlまたはLを付ける
        System.out.println(longNum1);
        System.out.println(longNum2);

        // float型の整数リテラル
        float floatNum1 = 3.14f;//末尾にfまたはFを付ける
        float floatNum2 = 3.14F;//末尾にfまたはFを付ける
        System.out.println(floatNum1);
        System.out.println(floatNum2);

        // double型の整数リテラル
        double doubleNum1 = 3.14;// 小数点はデフォルトでdouble型となる
        double doubleNum2 = 3.14d;// 末尾にdまたはDを付ける
        double doubleNum3 = 3.14D;// 末尾にdまたはDを付ける
        System.out.println(doubleNum1);
        System.out.println(doubleNum2);
        System.out.println(doubleNum3);

        // 真偽リテラル
        boolean bool1 = true; // trueまたはfalse
        boolean bool2 = false; // trueまたはfalse
        System.out.println(bool1);
        System.out.println(bool2);

        // 文字リテラル
        char c = 'A';// シングルクォート（'）で囲む
        System.out.println(c);
    }
}
