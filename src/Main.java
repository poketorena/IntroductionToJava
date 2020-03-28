public class Main {
    public static void main(String... args) {
        // int -> Integer
        Integer num01 = new Integer(10);// 新たなオブジェクトを生成するので効率が悪い
        Integer num02 = Integer.valueOf(10); // キャッシュされたオブジェクトを返す

        // Integer -> int
        int num03 = num02.intValue();

        // String -> Integer
        Integer num04 = new Integer("10"); // 新たなオブジェクトを生成するので効率が悪い
        Integer num05 = Integer.valueOf("10");// キャッシュされたオブジェクトを返す
        Integer num06 = Integer.valueOf("11", 2);// 基数（radix）を指定。この場合の値は3

        // String -> int
        int num07 = Integer.parseInt("10");
        int num08 = Integer.parseInt("11", 2);// 基数（radix）を指定。このの値は3

        // int -> String
        String num09 = Integer.toString(10);

        // Integer -> String
        String num10 = num01.toString();
    }
}
