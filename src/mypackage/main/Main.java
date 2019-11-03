package mypackage.main;

public class Main {
    public static void main(String[] args) throws Exception {
        doWatusa();
        doTogame();
        callDeae();
        showMondokoro();
    }

    private static void doWatusa() {
        System.out.println("きなこでござる。食えませんがの。");
    }

    private static void doTogame() {
        System.out.println("この老いぼれの目はごまかせませんぞ。");
    }

    private static void callDeae() {
        System.out.println("えぇい、こしゃくな。くせ者だ！であえい！");
    }

    private static void showMondokoro() {
        System.out.println("飛車さん、角さん。もういいでしょう。");
        System.out.println("この紋所が目にはいらぬか！");
        doTogame(); // もう一度、とがめる
    }
}
