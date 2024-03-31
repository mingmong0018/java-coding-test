package Section6;

import java.util.Arrays;
import java.util.Scanner;

public class Practice6_8_2 {
	public static int solution(int[] arr, int target) {
		int answer = -1;
		int start = 0, end = arr.length-1, mid = 0;
		Arrays.sort(arr);
		while(start<=end) {
			mid = (start + end)/2;
			if (arr[mid] == target) {
				answer = mid+1;
				break;
			}
			if (arr[mid]>target) end = mid-1;
			else start = mid+1;
		}
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int target = sc.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i<num; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(solution(arr, target));

	}
}
