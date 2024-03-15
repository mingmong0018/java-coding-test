package Section6;

import java.util.Scanner;

public class Practice6_1 {
	public static int[] solution(int[] arr, int num) {
		for (int i = 0; i<num; i++) {
			int minIndex = i;
			for (int j = i; j<num; j++) {
				if (arr[minIndex]>arr[j]) minIndex = j;
			}
			int tmp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = tmp;
		}
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
