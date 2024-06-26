package Section6;

import java.util.Scanner;

public class Practice6_3 {
	public static int[] solution(int[] arr, int num) {
		for (int i = 1; i<num; i++) {
			int index = i;
			for (int j = i - 1; j>=0; j--) {
				if (arr[j]<arr[index]) break;
				else {
					int tmp = arr[j];
					arr[j] = arr[index];
					arr[index] = tmp;
					index--;
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
