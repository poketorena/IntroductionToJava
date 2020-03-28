import java.time.LocalDateTime;
import java.time.Month;

public class Main {
    public static void main(String... args) {
        Month month = LocalDateTime.now().getMonth();

        //JavaのEnumはnullを代入することができる
        // C++ではNULLもnullptrも代入できない
        // C#ではnullは代入できない（?でnull許容型にすれば代入できる）
        Month nullDayo = null;

        switch (month) {
            case MARCH:
                // C#は空でないcaseブロックには必ずbreakを書く必要があるが、
                // Javaは空でないブロックにbreakを書き忘れた場合（フォールスルー）もエラーにならない！！！
                // バグの元なので気をつけよう！
                var tmp = 123;
            case APRIL:
            case MAY:
                System.out.println(month + "は春です");
                break;
            case JUNE:
            case JULY:
            case AUGUST:
                System.out.println(month + "は夏です");
                break;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                System.out.println(month + "は秋です");
                break;
            default:
                System.out.println(month + "は冬です");
                break;
        }
    }
}
