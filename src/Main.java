import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {
        URL u = new URL("http://www.impressjapan.jp/");
        InputStream is = u.openStream();
        int i = is.read();
        while (i != -1) {
            char c = (char) i;
            System.out.print(c);
            i = is.read();
        }
    }
}
