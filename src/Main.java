import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String... args) {
//        List<String> list = new ArrayList<String>(); // Java 5.0 Java 6での書き方
        List<String> list = new ArrayList<>(); // Java 7以降ならダイヤモンドオペレータが使用可能
        list.add("Java");
        String element = list.get(0);// キャストが必要！
        System.out.println(element);
    }
}
