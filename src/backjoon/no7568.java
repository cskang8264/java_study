package backjoon;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class no7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        Map<Integer,Integer> data = new HashMap<>();

        for (int i = 0; i < size; i++) {
            String [] personData = br.readLine().split(" ");
            int w = Integer.parseInt(personData[0]);
            int h = Integer.parseInt(personData[1]);
            data.put(w,h);
        }

        List<Map.Entry<Integer,Integer>> entries =
                data.entrySet()
                        .stream()
                        .sorted((o1, o2) -> o1.getKey() > o2.getKey()
                                ? 1 : o1.getKey() < o2.getKey()
                                ? -1 : o1.getKey() == o2.getKey()
                                ? o1.getValue().compareTo(o2.getValue()): -99)
                        .collect(Collectors.toList());
        for (Map.Entry<Integer,Integer> entry: entries) {

            System.out.println("entryKey = " + entry.getKey() + " entryValue = " + entry.getValue());

        }





    }
}
