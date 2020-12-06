package backjoon;

import java.io.*;
import java.util.TreeSet;

public class no1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        TreeSet<String> data = new TreeSet<>((o1, o2) -> {
            if (o1.length() > o2.length()) return 1;
            else if (o1.length() < o2.length()) return -1;
            else {
                if (o1.compareTo(o2) > 0) return 1;
                else if (o1.compareTo(o2) < 0) return -1;
                else return 0;
            }
        });
        for (int i=0; i< size; i++) {
            data.add(br.readLine());
        }
        for (String a:  data) {
            bw.write(a);
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
