import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String... args) {
        List<String> strList = new ArrayList<>();
        strList.add("Java");
        strList.add("Groovy");
        GenericStack<String> gstack = GenericStackUtil.as(strList);
    }
}
