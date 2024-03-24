package Section5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class Person {
	int id;
	int score;
	public Person(int id, int score) {
		this.id = id;
		this.score = score;
	}
}
public class Practice5_8 {
	public int solution(int[] arr, int m) {
		int answer = 1;
		Queue<Person> queue = new LinkedList<>();
		for (int i = 0; i<arr.length; i++) {
			queue.offer(new Person(i, arr[i]));
		}
		while(!queue.isEmpty()) {
			Person tmp = queue.poll();
			for (Person x: queue) {
				if (tmp.score<x.score) {
					queue.offer(tmp);
					tmp = null;
					break;
				}
			}
			if (tmp != null) {
				if (tmp.id == m) return answer;
				else answer++;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Practice5_8 p = new Practice5_8();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0 ; i< n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(p.solution(arr, m));
	}
}
