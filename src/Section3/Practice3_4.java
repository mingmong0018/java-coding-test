package Section3;

import java.util.Scanner;

public class Practice3_4 {
	public int solution(int[] arr, int m) {
		int answer = 0, sum = 0, p=0;
		for (int i = 0; i<arr.length; i++) {
			sum+=arr[i];
			while (sum>m) {
				sum = sum - arr[p++];
			}
			if (sum==m) {
				answer++;
			}

		}


		return answer;
	}
	public static void main(String[] args) {
		Practice3_4 p = new Practice3_4();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(p.solution(arr, m));
	}
}
