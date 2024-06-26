package Section6;

import java.util.Arrays;
import java.util.Scanner;

public class Practice6_9 {
	static int count(int[] arr, int capacity) {
		int count = 1;
		int sum = 0;
		for (int i = 0; i<arr.length; i++) {
			sum += arr[i];
			if (sum>capacity) {
				sum = arr[i];
				count++;
			}
		}
		return count;
	}
	public static int solution(int[] arr, int n, int m) {
		int answer = 0;
		int lt = Arrays.stream(arr).max().getAsInt();
		int rt = Arrays.stream(arr).sum();
		while(lt<=rt) {
			int mid = (lt + rt) / 2;
			if (count(arr, mid)<=m) {
				answer = mid;
				rt = mid-1;
			} else lt = mid+1;
		}


		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(solution(arr, n, m));

	}
}
