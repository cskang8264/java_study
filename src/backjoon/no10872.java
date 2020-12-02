package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        br.close();
        if (0 <= num && num <= 12){
            int result = factorial(num);
            System.out.println(result);
        }else {
            return ;
        }

    }
    public static int factorial(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * factorial(num-1);
        }

    }

}
