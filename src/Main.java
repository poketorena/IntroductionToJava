public class Main {
    public static void main(String... args) {
        int number = 0x12345678;
        int higher = number >> 16;
        System.out.printf("higher=%x\n", higher);
    }
}
