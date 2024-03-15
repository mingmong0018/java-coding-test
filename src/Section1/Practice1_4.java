package Section1;

import java.util.Scanner;

public class Practice1_4 {
    public String solution(String str) {
		String answer = "";
		int lt = 0;
		int rt = str.length() - 1;
		char[] s = str.toCharArray();
		while (lt < rt) {
			char tmp = s[lt];
			s[lt] = s[rt];
			s[rt] = tmp;
			lt++;
			rt--;
		}
		answer = String.valueOf(s);
		return answer;
    }
    public static void main(String[] args) {
        Practice1_4 p = new Practice1_4();
        Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String[] arr = new String[num];
		for (int i = 0; i < num; i++) {
			arr[i] = sc.next();
		}
		for (String str : arr) {
			System.out.println(p.solution(str));
		}
    }
}
