package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class no4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String [] input = br.readLine().split(" ");
            int [] input2 = new int[3];
            input2[0] = Integer.parseInt(input[0]);
            input2[1] = Integer.parseInt(input[1]);
            input2[2] = Integer.parseInt(input[2]);
            Arrays.sort(input2);
            int a = input2[0];
            int b = input2[1];
            int h = input2[2];

            if (a==0 && b==0 && h==0) {
                break;
            } else {
                if ((a*a)+(b*b)==(h*h)){
                    System.out.println("right");
                }else {
                    System.out.println("wrong");
                }
            }

        }

    }
}
