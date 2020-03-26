public class Main {
    public static void main(String... args) {
        int number = 0x12345678;
        System.out.println("int number = 0x12345678");

        int lower = number & 0x0000ffff;
        System.out.println("int lower = number & 0x0000ffff");

        System.out.println("16 ^ 0 * 8 + 16 ^ 1 * 7 + 16 ^ 2 * 6 + 16 ^ 3 * 5 = 22136");
        System.out.println("lower(10進数) = " + lower);
        System.out.printf("lower(16進数) = %x\n", lower);
    }
}
