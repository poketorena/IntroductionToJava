import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String filename = "test.txt";
        FileReader fr = null;
        char c1 = 'z';
        char c2 = 'z';
        try {
            fr = new FileReader(filename);
            try {
                c1 = (char) fr.read();// 1文字読む
                c2 = (char) fr.read();// 1文字読む
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("最初の1文字 : " + c1);
        System.out.println("次の1文字 : " + c2);
    }
}
