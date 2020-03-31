import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String... args) {
        Student[] students = {
                new Student("Ken", 100),
                new Student("Shin", 60),
                new Student("Takuya", 80)
        };

        Arrays.sort(students, (o1, o2) -> Integer.compare(o2.getScore(), o1.getScore()));
        for (Student student : students) {
            System.out.println(student.getName() + ":" + student.getScore());
        }
    }
}
