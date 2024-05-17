package Section3;

import java.util.Scanner;

public class Practice3_3 {
	public int solution(int[] arr, int k) {
		int answer = 0;
		int sum = 0;
		for (int i = 0; i<k; i++) {
			sum+=arr[i];
		}
		answer = sum;
		for (int i = 0; i<arr.length-k-1; i++) {
			sum = sum - arr[i] + arr[i+k];
			answer = Integer.max(answer, sum);
		}
		return answer;
	}
	public static void main(String[] args) {
		Practice3_3 p = new Practice3_3();
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
