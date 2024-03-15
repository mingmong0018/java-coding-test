package Section1;

import java.util.Scanner;

public class Practice1_2 {
    public String solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) answer += Character.toUpperCase(str.charAt(i));
            else answer += Character.toLowerCase(str.charAt(i));
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
