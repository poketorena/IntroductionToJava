public class Main {
    public static void main(String[] args) {
        String s = "三";
        int i = -1;
        try {
            i = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        System.out.println(i);
    }
}
