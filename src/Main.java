public class Main {
    public static void main(String[] args) {
        Book b = new Book("hoge", 1000, "Blue", "123465789");
        Computer c = new Computer("fuga", 5000, "Red", "hey");
        System.out.println(b.getName());
        System.out.println(c.getName());
    }
}
