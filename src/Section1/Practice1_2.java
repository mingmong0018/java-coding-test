package Section1;

import java.util.Scanner;

public class Practice1_2 {
    public String solution(String str) {
        String answer = "";
        for (char c: str.toCharArray()) {
            if (Character.isUpperCase(c)) answer+=Character.toLowerCase(c);
            else answer+=Character.toUpperCase(c);
        }
        return answer;
    }
    public static void main(String[] args) {
        Practice1_2 p = new Practice1_2();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(p.solution(str));
    }
}
