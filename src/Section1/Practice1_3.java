package Section1;

import java.util.Scanner;

public class Practice1_3 {
    public String solution(String str) {
		String answer = "";
		String[] temp = str.split(" ");
		System.out.println(str);
		for (String s : temp) {
			System.out.println(s);
		}
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < temp.length; i++) {
			if (max < temp[i].length()) {
				max = temp[i].length();
				answer = temp[i];
			}
		}
		return answer;
    }
    public static void main(String[] args) {
        Practice1_3 p = new Practice1_3();
        Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(p.solution(str));

    }
}
