import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        day += 100;
        calendar.set(Calendar.DAY_OF_MONTH, day);
        Date futureDate = calendar.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("西暦yyyy年MM月dd日");
        String formatedStr = simpleDateFormat.format(futureDate);
        System.out.println(formatedStr);
    }
}
