package Section5;

import java.util.Scanner;
import java.util.Stack;
//352+*9-
//12
public class Practice5_4 {
	public int solution(String str) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		for(char c: str.toCharArray()) {
			if (Character.isDigit(c)) {
				stack.push(Integer.parseInt(String.valueOf(c)));
			} else {
				int right = stack.pop();
				int left = stack.pop();
				int result = 0;
				switch (c) {
					case '+' : result += left + right; break;
					case '-' : result += left - right; break;
					case '*' : result += left * right; break;
					case '/' : result += left / right; break;
				}
				stack.push(result);
			}
		}
		answer = stack.peek();
		return answer;
	}
	public static void main(String[] args) {
		Practice5_4 p = new Practice5_4();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(p.solution(str));
	}
}
