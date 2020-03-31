import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String... args) {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 62, 31, 1, 54, 31));

        // Arrays.asListで作ったリストの内容を変更したい場合は、Listクラスをnewするときの引数として渡す
        integerList.add(999);

        for (var element : integerList) {
            System.out.println(element);
        }
    }
}
