package Section6;

import java.util.Arrays;
import java.util.Scanner;

public class Practice6_5 {
	public static char solution(int[] arr, int n) {
		char answer = 'U';
		Arrays.sort(arr);
		for (int i = 0; i<arr.length-1; i++) {
			if (arr[i] == arr[i+1]) answer = 'D';
		}
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(solution(arr, n));
	}
}
