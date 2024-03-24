package Section6;

import java.util.Scanner;

public class Practice6_3 {
	public static int[] solution(int[] arr, int num) {

		return arr;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i<num; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i: solution(arr,num)) {
			System.out.print(i+" ");
		}

	}
}
