import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String... args) {
        Integer[] array = {3, 1, 13, 2, 8, 5, 1};

        Arrays.sort(array, Comparator.reverseOrder());
        System.out.println(Arrays.toString(array));
    }
}
