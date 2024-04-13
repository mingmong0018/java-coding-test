package Section4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Practice4_2 {
	public String solution(String str1, String str2) {
		String answer = "YES";
		Map<Character, Integer> map1 = new HashMap<>();
		Map<Character, Integer> map2 = new HashMap<>();
		for(int i = 0; i<str1.length(); i++) {
			map1.put(str1.charAt(i), map1.getOrDefault(str1.charAt(i), 0) + 1);
			map2.put(str2.charAt(i), map2.getOrDefault(str2.charAt(i), 0) + 1);
		}
		for(char c: map1.keySet()) {
			if (map1.get(c) != map2.get(c)) answer = "NO";
		}
		return answer;
	}
	public static void main(String[] args) {
		Practice4_2 p = new Practice4_2();
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		System.out.println(p.solution(str1, str2));
	}
}
