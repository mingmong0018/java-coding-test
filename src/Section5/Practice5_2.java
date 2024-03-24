package Section5;

import java.util.Scanner;
import java.util.Stack;

public class Practice5_2 {
	public String solution(String str) {
		String answer = "";
		Stack<Character> stack = new Stack<>();
		for (char c: str.toCharArray()) {
			if (c!=')') stack.push(c);
			else {
				int size = stack.size();
				for (int i = 0; i<size; i++) {
					char top = stack.pop();
					if (top=='(') break;
				}
			}
		}
		int size = stack.size();
		for(int i = 0; i<size; i++) {
			answer = stack.pop() + answer;
		}
		return answer;
	}
	public static void main(String[] args) {
		Practice5_2 p = new Practice5_2();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(p.solution(str));
	}
}
