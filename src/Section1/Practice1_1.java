package Section1;

import java.util.Scanner;

public class Practice1_1 {
    public int solution(String str, char c) {
        int answer = 0;
        str = str.toLowerCase();
        c = Character.toLowerCase(c);
        for (char a: str.toCharArray()) {
            if (a==c) answer++;
        }

        return answer;
    }
    public static void main(String[] args) {
        Practice1_1 p = new Practice1_1();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        System.out.println(p.solution(str, c));
    }
}
