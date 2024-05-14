package Section1;

import java.util.Scanner;

public class Practice1_9 {
    public int solution(String str) {
		str = str.toLowerCase().replaceAll("^[a-z]", "");
		System.out.println(str);
		int answer = Integer.parseInt(str);
		return answer;
    }

    public static void main(String[] args) {
        Practice1_9 p = new Practice1_9();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(p.solution(str));
    }
}
