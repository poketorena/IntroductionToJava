import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String... args) {
        List<Integer> integerList = Arrays.asList(1, 62, 31, 1, 54, 31);

        // Arrays.asListで作ったリストは要素の追加・変更・削除をすることができない！
         integerList.add(999);

        for (var element : integerList) {
            System.out.println(element);
        }
    }
}
