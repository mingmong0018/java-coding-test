package Section10;

import java.util.Arrays;
import java.util.Scanner;

public class Practice10_5 {
	static int[] dy;
	public static int solution(int num, int[] arr, int total) {
		Arrays.fill(dy, Integer.MAX_VALUE);
		dy[0] = 0;
		for (int i = 0; i<num; i++) {
			for (int j = arr[i]; j<dy.length; j++) {
				if (dy[j]>dy[j-arr[i]] + 1) dy[j] = dy[j-arr[i]] + 1;
			}
		}

		return dy[total];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i<num; i++) {
			arr[i] = sc.nextInt();
		}
		int total = sc.nextInt();
		dy = new int[total+1];
		System.out.println(solution(num, arr, total));
	}
}
