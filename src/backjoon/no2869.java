package backjoon;

import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class no2869 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> data = new ArrayList<>();
        String input[] = br.readLine().split(" ");

        for (int i = 0; i < input.length; i++) {
           data.add(Integer.parseInt(input[i]));
        }
        int A = data.get(0);
        int B = data.get(1);
        int V = data.get(2);

        int day = (V-B) / (A-B);
        if ((V-B) % (A-B) != 0) {
            day ++;
        }
        System.out.println(day);


    }
}
