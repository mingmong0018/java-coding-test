package Section3;

import java.util.Scanner;
public class Practice3_1 {
	// 1 3 5
	// 2 3 6 7 9
	// 1 2 3 3 5 6 7 9
	public void solution(int[] arr1, int[] arr2) {
		int[] answer = new int[arr1.length + arr2.length];
		int p1 = 0, p2 = 0, index = 0;
		while(p1<arr1.length && p2<arr2.length) {
			if (arr1[p1] < arr2[p2]) answer[index++] = arr1[p1++];
			else answer[index++] = arr2[p2++];
		}
		while(p1<arr1.length) {
			answer[index++] = arr1[p1++];
		}
		while(p2<arr2.length) {
			answer[index++] = arr2[p2++];
		}
		for (int x: answer) {
			System.out.print(x + " ");
		}

	}
	public static void main(String[] args) {
		Practice3_1 p = new Practice3_1();
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int[] arr1 = new int[num1];
		for (int i = 0; i<num1; i++) {
			arr1[i] = sc.nextInt();
		}
		int num2 = sc.nextInt();
		int[] arr2 = new int[num2];
		for (int i = 0; i<num2; i++) {
			arr2[i] = sc.nextInt();
		}
		p.solution(arr1, arr2);
	}
}
