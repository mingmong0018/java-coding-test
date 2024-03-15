package Section6;

import java.util.Scanner;

public class Practice6_8 {
	public static int solution(int[] arr, int start, int end, int target) {
		if (start>end) return -1;
		int mid = (start+end)/2;
		if (arr[mid] == target) return mid;
		else if (arr[mid]>target) return solution(arr, start, mid-1, target);
		else return solution(arr, mid+1, end, target);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int target = sc.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i<num; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(solution(arr, 0, num-1, target));

	}
}
