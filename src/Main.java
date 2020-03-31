import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String... args) {
        List list = new ArrayList();
        list.add("Java");
        String element = (String) list.get(0);// キャストが必要！
        System.out.println(element);
    }
}
