package Section6;

import java.util.Scanner;

public class Practice6_2 {
	public static int[] solution(int[] arr, int num) {
		for (int i = 0; i<num-1; i++) {
			for (int j = 0; j<num-1-i; j++) {
				if (arr[j]>arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
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
