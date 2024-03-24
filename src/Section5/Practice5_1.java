package Section5;

import java.util.Scanner;
import java.util.Stack;

public class Practice5_1 {
	public String solution(String str) {
		String answer = "YES";
		Stack<Character> stack = new Stack<>();
		for(char c: str.toCharArray()) {
			if (c == '(') stack.push('(');
			else {
				if (stack.isEmpty()) answer = "NO";
				stack.pop();
			}
		}
		if (!stack.isEmpty()) answer = "NO";
		return answer;
	}
	public static void main(String[] args) {
		Practice5_1 p = new Practice5_1();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(p.solution(str));
	}
}
