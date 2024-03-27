package Section3;

import java.util.Scanner;

public class Practice3_6 {
	public int solution(int[] arr, int k) {
		int answer = 0, count = 0, p = 0;
		for (int i = 0; i<arr.length; i++) {
			if (arr[i] == 0) count++;
			while(count>k) {
				if (arr[p]==0) count--;
				p++;
			}
			answer = Integer.max(answer, i-p+1);
		}

		return answer;
	}
	public static void main(String[] args) {
		Practice3_6 p = new Practice3_6();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(p.solution(arr, k));
	}
}
