package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class no10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int commandNum = Integer.parseInt(br.readLine());
        if (1 <= commandNum && commandNum <= 10000){
            for (int i = 0; i < commandNum; i++) {
                String command = br.readLine();
                int num = 0;
                if (command.equals("push")) {
                     num = Integer.parseInt(br.readLine());
                }
                stack(commandNum , command, num);
            }
        }else {
            return ;
        }

    }

    public static void stack (int size, String command, int num) {
        Stack<Integer> stack= new Stack<Integer>();

       if (command.equals("push")) {
            stack.push(num);
       } else if (command.equals("pop")) {
           System.out.println("pop");
           System.out.println(stack.isEmpty() ? -1 : stack.pop());
       } else if  (command.equals("size")) {
           System.out.println("size");
           System.out.println(stack.size());
       } else if (command.equals("empty")) {
           System.out.println("empty");
           System.out.println(stack.isEmpty() ? -1 : 0);
       } else if (command.equals("top")) {
           System.out.println("top");
           System.out.println(stack.isEmpty() ? -1 : stack.peek());
       }
    }
}
