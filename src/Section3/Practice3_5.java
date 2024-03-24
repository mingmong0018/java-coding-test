package Section3;

import java.util.Scanner;

public class Practice3_5 {
	public int solution(int n) {
		int answer = 0, sum = 0, p = 1;
		for (int i = 1; i<=(n/2) + 1; i++) {
			sum+=i;
			while (sum > n) {
				sum-= p;
				p++;
			}
			if (sum==n) answer++;
		}
		return answer;
	}
	public static void main(String[] args) {
		Practice3_5 p = new Practice3_5();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(p.solution(n));
	}
}
