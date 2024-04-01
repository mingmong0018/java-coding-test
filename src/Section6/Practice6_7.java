package Section6;

import java.util.Scanner;

public class Practice6_7 {
	public static int[][] solution(int[][] arr) {
		return arr;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[][] arr = new int[num][2];
		for (int i = 0; i<num; i++) {
			for (int j = 0; j<2; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		solution(arr);
		for (int[] arr2 : arr) {
			System.out.println(arr2[0] + " " + arr2[1]);
		}

	}
}
