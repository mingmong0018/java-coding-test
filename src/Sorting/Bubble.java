package Sorting;

import java.util.Scanner;

// 공부 방법 : 1. 설명 2. 먼저 구현 3. 다시 설명
// 설명 : 앞에서부터 2개씩 바로 옆에 있는 수와 비교해서 작은 값을 앞으로 큰 값을 뒤로 바꾸면서 배열의 끝까지 반복해서 정렬하는 방법
public class Bubble {
	public int[] solution(int[] arr) {
		for (int i = 0; i<arr.length-1; i++) {
			for (int j = 0; j<arr.length - 1 - i; j++) {
				if (arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		Bubble b = new Bubble();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		for (int x : b.solution(arr)) System.out.print(x + " ");
	}
}
