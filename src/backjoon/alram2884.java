package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class alram2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] time = new String[2];
        time = br.readLine().split(" ");

        int hour = Integer.parseInt(time[0]);
        int minuite = Integer.parseInt(time[1]);

        if ( 0<=hour && hour<=23 || 0 <= minuite && minuite <= 59){
            minuite = minuite - 45;
            if (minuite < 0 && hour != 0) {
                System.out.println(hour-1+" "+(60+minuite));
            }
            else if (minuite < 0 && hour == 0) {
                System.out.println((hour+23)+" "+(60+minuite));
            }
            else {
                System.out.println(hour+" "+minuite);
            }
        }

    }
}
