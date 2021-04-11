package kakao2020;

public class StringZip {
    public static void main(String[] args) {
        StringZip test = new StringZip();
        test.solution("aabbaccc");
    }

    public int solution(String s) {
        int answer = s.length();
        for (int i = 1; i < s.length()/2; i++) {
            int pos = 0;
            int len = s.length();
            System.out.println("loof stage = " + i);
            System.out.println("answer = " + answer);
            System.out.println("s = " + s);
            for (; pos + i <= s.length(); ) {
                String unit = s.substring(pos,pos+i);
                pos += i;
                int cnt = 0;
                for (; pos + i <= s.length(); ) {
                    System.out.println("cnt = " + cnt);
                    if (unit.equals(s.substring(pos,pos+i))) {
                        System.out.println("equals unit = " + s.charAt(pos));
                        ++cnt;
                        pos += i;
                    } else {
                        break;
                    }
                }
                if (cnt > 0 ){
                    System.out.println("len = " + len);
                    len -= i*cnt;
                    if (cnt < 9 ) len += 1;
                    else if (cnt < 99) len+=2;
                    else if (cnt < 999) len+=3;
                    else len+=4;
                }
            }
            answer = Math.min(answer,len);
        }
        System.out.println("answer = " + answer);
        return answer;
    }
}
