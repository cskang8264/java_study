package backjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class no10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());

        List<Member> memberList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            String input[] = br.readLine().split(" ");
            memberList.add(new Member(Integer.parseInt(input[0]), input[1], i));
        }
        memberList.sort((o1, o2) ->{
            if (o1.getAge() > o2.getAge()) return  1;
            else if (o1.getAge() < o2.getAge()) return -1;
            else {
            } if (o1.getRegister() > o2.getRegister()) return 1;
            else if (o1.getRegister() < o2.getRegister()) return -1;
            else return 0;

        });

        for (Member m: memberList
             ) {
            bw.write(m.age+" "+m.name);
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

    static class Member {
        int age;
        String name;
        int register;

        public Member(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getRegister() {
            return register;
        }

        public void setRegister(int register) {
            this.register = register;
        }

        public Member(int age, String name, int register) {
            this.age = age;
            this.name = name;
            this.register = register;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }
}
