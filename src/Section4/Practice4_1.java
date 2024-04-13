package Section4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Practice4_1 {
	public char solution(String str) {
		char answer = ' ';
		Map<Character, Integer> map = new HashMap<>();
		for (char c: str.toCharArray()) {
			map.put(c, map.getOrDefault(c,0)+1);
		}
		int max = 0;
		for (char x : map.keySet()) {
			if (max<map.get(x)) {
				max = map.get(x);
				answer = x;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Practice4_1 p = new Practice4_1();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String str = sc.next();
		System.out.println(p.solution(str));
	}
}
