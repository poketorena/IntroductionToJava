public class Main {
    public static void main(String... args) {
        log("ユーザを登録しました", "userName", "Ken");
        log("エラーが発生しました", "Cannot load file");
        log("処理を終了しました");

    }

    private static void log(String message, String... args) {
        System.out.println(message);
        System.out.println("パラメータ：");
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
