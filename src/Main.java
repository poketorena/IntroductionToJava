import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // 現在の年を表示する
        Date now = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(now);
        int y = c.get(Calendar.YEAR);
        System.out.println("今年は" + y + "年です。");

        // 指定した日のDate型の値を得る
        c.set(2010, 8, 22, 1, 23, 45);
        // Calendarを用いて「月」の情報を取得・設定する場合、1~12ではなく0~11で指定することになっているため注意が必要。
        // 以下のようにCalendar型に定義されている定数を使うと間違えにくいので積極的に定数を使おう！
        // c.set(2010, Calendar.SEPTEMBER, 22, 1, 23, 45);

        c.set(Calendar.YEAR, 2011);
        Date past = c.getTime();
    }
}
