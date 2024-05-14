package Section1;

import java.util.Scanner;

public class Practice1_11 {
    public String solution(String str) {
		String answer = "";
		str = str + " ";
		int count = 1;
		for (int i = 0; i<str.length() - 1; i++) {
			if (str.charAt(i) == str.charAt(i+1)) count++;
			else {
				answer+=str.charAt(i);
				if (count!=1) answer+=count;
				count = 1;
			}
		}
		return answer;
    }
    public static void main(String[] args) {
        Practice1_11 p = new Practice1_11();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(p.solution(str));
    }
}
