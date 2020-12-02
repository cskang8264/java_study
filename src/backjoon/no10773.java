package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class no10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i=0; i<size; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0){
              stack.pop();
            } else {
                stack.push(num);
            }
        }
        for (int i=0; i<size; i++) {
            if (stack.isEmpty()) {
                System.out.println(result);
                return ;
            } else {
                result += stack.pop();
            }

        }
        System.out.println(result);

    }
}
