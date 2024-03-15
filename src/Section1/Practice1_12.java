package Section1;

import java.util.Scanner;

public class Practice1_12 {
    public String solution(String str, int count) {
		String answer= "";
        str = str.replace('#','1').replace('*','0');
        for (int i = 0; i<count; i++) {
            String tmp = str.substring(0,7);
            answer+=(char)Integer.parseInt(tmp,2);
            str = str.substring(7);
        }
		return answer;
    }
    public static void main(String[] args) {
        Practice1_12 p = new Practice1_12();
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String str = sc.next();
        System.out.println(p.solution(str, count));

    }
}
