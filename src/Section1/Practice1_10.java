package Section1;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Practice1_10 {
	public int[] solution(String str, char c) {
		int[] answer = new int[str.length()];
		ArrayList<Integer> tmp = new ArrayList<>();
		for (int i = 0;i<str.length();i++) {
			answer[i] = 100;
		}
		for (int i = 0 ; i<str.length(); i++ ) {
			if (str.charAt(i) == c) tmp.add(i);
		}
		for (int i = 0; i<tmp.size();i++) {
			for (int j = 0;j<str.length();j++) {
				if (answer[j]>Math.abs(tmp.get(i) - j)) {
					answer[j] = Math.abs(tmp.get(i) - j);
				}
			}
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
