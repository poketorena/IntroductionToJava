import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String filename = "test.txt";
        FileWriter fileWriter = null;
        char c1 = 'z';
        char c2 = 'z';
        try {
            fileWriter = new FileWriter(filename);
            try {
                fileWriter.write('そ');// 1文字書く（上書き）
                fileWriter.write('れ');// 1文字書く（上書き）
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("書き込み成功！");
    }
}
