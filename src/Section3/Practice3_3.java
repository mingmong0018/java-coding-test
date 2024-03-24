package Section3;

import java.util.Scanner;

public class Practice3_3 {
	public int solution(int[] arr, int k) {
		int answer = 0, sum = 0;
		for (int i = 0; i<k; i++) sum += arr[i];
		answer = sum;
		for (int i = k; i<arr.length; i++) {
			sum+=arr[i]-arr[i-k];
			if(answer<sum) answer = sum;
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
