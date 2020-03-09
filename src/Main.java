public class Main {
    public static void main(String[] args) {
        int i1 = 15;
        // 明示的に書く場合
        Integer i2 = Integer.valueOf(i1);
        // 暗黙の型変換を使う場合（AutoBoxing）
        Integer i3 = i1;
        // 明示的に書く場合
        int i4 = i2.intValue();
        // 暗黙の型変換を使う場合（AutoUnboxing）
        int i5 = i2;
    }
}
