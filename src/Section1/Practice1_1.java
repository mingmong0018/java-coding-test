package Section1;

import java.util.Scanner;

public class Practice1_1 {
    public int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == t) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Practice1_1 p = new Practice1_1();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char t = sc.next().charAt(0);
        System.out.println(p.solution(str, t));
    }
}
