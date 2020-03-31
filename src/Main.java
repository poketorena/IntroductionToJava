import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String... args) {
        Employee employee1 = new Employee(1, "山田太郎");
        Employee employee2 = new Employee(1, "山田太郎");
        Set<Employee> employees = new HashSet<>();
        employees.add(employee1);
        employees.add(employee2);
        // hashCodeメソッドがオーバーライドされていないため、
        // ObjectクラスのhashCodeメソッドが呼ばれ、
        // employee1とemployee2はHashSetから異なるインスタンスとして扱われてしまう。（意図しない動作）
        System.out.println(employees.size());
    }
}
