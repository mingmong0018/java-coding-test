package Section5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Practice5_7 {
	public String solution(String k, String lesson) {
		String answer = "YES";
		Queue<Character> queue = new LinkedList<>();
		for (int i = 0; i<k.length(); i++) {
			queue.offer(k.charAt(i));
		}
		for (int i = 0; i<lesson.length(); i++) {
			if (queue.isEmpty()) break;
			if (queue.peek() == lesson.charAt(i)) queue.poll();
		}
		if (!queue.isEmpty()) answer = "NO";
		return answer;
	}
	public static void main(String[] args) {
		Practice5_7 p = new Practice5_7();
		Scanner sc = new Scanner(System.in);
		String k = sc.nextLine();
		String lesson = sc.nextLine();
		System.out.println(p.solution(k,lesson));
	}
}
