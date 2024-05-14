package Section1;

import java.util.Scanner;

public class Practice1_10 {
	public int[] solution(String str, char c) {
		int[] answer = new int[str.length()];
		int p = 1001;
		for (int i = 0; i<str.length(); i++) {
			if (str.charAt(i) == c) p = i;
			answer[i] = Math.abs(p-i);
		}
		for (int i = str.length() - 1; i>=0; i--) {
			if (str.charAt(i) == c) p = i;
			if (Math.abs(p-i)<answer[i]) answer[i] = Math.abs(p-i);
		}
		return answer;
    }

    public static void main(String[] args) {
        Practice1_10 p = new Practice1_10();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
		char c = sc.next().charAt(0);
		for (int i: p.solution(str,c)) {
			System.out.print(i+" ");
		}
    }


}
