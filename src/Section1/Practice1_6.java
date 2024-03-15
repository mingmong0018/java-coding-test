package Section1;

import java.util.Scanner;

public class Practice1_6 {
    public String solution(String str) {
        String answer = "";
        for (int i = 0; i<str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Practice1_6 p = new Practice1_6();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(p.solution(str));
    }
}
