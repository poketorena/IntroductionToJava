public class Main {
    public static void main(String... args) {
        NumberStack<Integer> intStack = new NumberStack<>();// IntegerクラスはNumberクラス

        NumberStack<Long> longStack = new NumberStack<>();// LongクラスはNumberクラスの子クラス

        // StringはNumberクラスの小クラスではないためコンパイルエラー
        // NumberStack<String> strStack = new NumberStack<String>();
        intStack.push(100);
        intStack.push(200);

        Integer numElement = intStack.pop();

        if (numElement != null) {
            System.out.println(numElement);
        }
    }
}
