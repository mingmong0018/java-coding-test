package Section6;

import java.util.Arrays;
import java.util.Scanner;

public class Practice6_10 {
	public static int count(int[] arr, int range) {
		int count = 1;
		int target = arr[0];
		for (int i = 1; i<arr.length; i++) {
			if (arr[i] - target >= range) {
				target = arr[i];
				count++;
			}
		}
		return count;
	}
	public static int solution(int[] arr, int n, int m) {
		int answer = 0;
		Arrays.sort(arr);
		int lt = 1, rt = arr[arr.length-1] - arr[0];
		while(lt<=rt) {
			int mid = (lt+rt)/2;
			if (count(arr, mid)>=m) {
				answer = mid;
				lt = mid+1;
			} else rt = mid - 1;
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
