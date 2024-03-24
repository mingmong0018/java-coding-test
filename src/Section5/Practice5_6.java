package Section5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Practice5_6 {
	public int solution(int n, int k) {
		int answer = 0;
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 1; i<=n; i++) {
			queue.offer(i);
		}
		while(!queue.isEmpty()) {
			for (int i = 1; i<k; i++) {
				queue.add(queue.poll());
			}
			queue.poll();
			if (queue.size() == 1) answer = queue.peek();
		}
		return answer;
	}
	public static void main(String[] args) {
		Practice5_6 p = new Practice5_6();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		System.out.println(p.solution(n,k));
	}
}
