public class Main {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        // ここで何らかの時間がかかる処理
        Thread.sleep(5000);
        long end = System.currentTimeMillis();
        System.out.println("処理にかかった時間は…" + (end - start) + "ミリ秒でした");
    }
}
