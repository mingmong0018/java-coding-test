package Section1;

import java.util.Scanner;

public class Practice1_9 {
    public int solution(String str) {
		int answer = 0;
		str = str.replaceAll("[^0-9]","");
		answer = Integer.valueOf(str);
		return answer;
    }

    public static void main(String[] args) {
        Practice1_9 p = new Practice1_9();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(p.solution(str));
    }
}
