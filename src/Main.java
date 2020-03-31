import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String... args) {
        int[] array = {1, 1, 4, 5, 7, 8, 11, 12, 17, 21, 24};

        // 配列内の検索（二分探索）
        // 二分探索のため、配列は事前に昇順にソートされている必要がある
        int found = Arrays.binarySearch(array, 5);// ①「5」という数字を検索
        System.out.println(found);

        int notFound = Arrays.binarySearch(array, 6);// ②「6」という数字を検索

        // 見つからなかったときは負の値が返ってくる
        // 見つからなかったときに返ってくる値は、
        // 「もしその要素が入るとすれば何番目となるか」という数値に
        // マイナス符号を付け、さらに1引いた数になっている。
        // この場合はもし「6」が入るなら4番目（インデックス）なので、
        // -4から1を引いた-5が返ってきている。
        System.out.println(notFound);
    }
}
