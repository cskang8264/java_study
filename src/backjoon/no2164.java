package backjoon;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class no2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= num; i++) {
            queue.add(i);
        }
        while (queue.size()==1) {
            queue.poll();
            int temp = queue.poll();
            queue.add(temp);
            if (queue.size()==1) break;
        }
        System.out.println(queue.peek());
    }
}
