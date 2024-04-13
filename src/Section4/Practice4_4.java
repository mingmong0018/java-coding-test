package Section4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Practice4_4 {
	public int solution(String str1, String str2) {
		int answer = 0;
		Map<Character, Integer> map = new HashMap<>();
		Map<Character, Integer> map2 = new HashMap<>();
		int lt = 0;
		int rt = str2.length() - 1;
		for (int i = 0; i<rt; i++) {
			map.put(str1.charAt(i), map.getOrDefault(str1.charAt(i), 0)+1);
		}
		for (int i = 0; i<=rt; i++) {
			map2.put(str2.charAt(i), map2.getOrDefault(str2.charAt(i), 0)+1);
		}
		while(rt<str1.length()) {
			map.put(str1.charAt(rt), map.getOrDefault(str1.charAt(rt), 0)+1);
			boolean isEquals = true;
			for (char c: map2.keySet()) {
				if (map.get(c) != map2.get(c)) isEquals = false;
			}
			if (isEquals) answer++;
			map.put(str1.charAt(lt), map.get(str1.charAt(lt)) - 1);
			if (map.get(str1.charAt(lt)) == 0) map.remove(str1.charAt(lt));
			lt++;
			rt++;
		}
		return answer;
	}
	public static void main(String[] args) {
		Practice4_4 p = new Practice4_4();
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		System.out.println(p.solution(str1, str2));
	}
}
