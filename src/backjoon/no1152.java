package  backjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        System.out.println(text.length());
        if (text.length() <= 1000000) {
            String[] splitText = text.trim().split(" ");
            System.out.println(splitText.length);
        } else {
            return ;
        }

    }
}
