package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class no10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        if (num <= 20) {
            System.out.println(fibonacci(num));
        } else {
            return;
        }
    }

    public static int fibonacci (int num) {
        if (num == 2) {
            return 0 ;
        } else {
            return fibonacci(num-1) + fibonacci(num - 2);
        }
    }
}
