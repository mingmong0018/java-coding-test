package Sorting;

import java.util.Scanner;

// 공부 방법 : 1. 설명 2. 먼저 구현 3. 다시 설명
// 설명 : 현재 위치에서, 그 이하의 배열들을 비교하여 자신이 들어갈 위치를 찾아, 그 위치에 삽입하는 배열 알고리즘
// 삽입 정렬은 두번째 인덱스부터 시작
// 삽입할 값의 앞에있는 값들은 이미 정렬이 되어있는 값들이라 시간복잡도가 버블, 선택 정렬에 비해 빠르다
public class Insertion {
	public int[] solution(int[] arr) {
		for (int i = 1; i<arr.length; i++) {
			int index = i;
			for (int j = i - 1; j>=0; j--) {
				if (arr[j]>arr[index]) {
					int tmp = arr[j];
					arr[j] = arr[index];
					arr[index] = tmp;
					index--;
				} else break;
			}
		}


		for (int i = 1; i<arr.length; i++) {
			int tmpIndex = i;
			for (int j = i-1; j>=0; j--) {
				if (arr[tmpIndex]<arr[j]) {
					int tmp = arr[j];
					arr[j] = arr[tmpIndex];
					arr[tmpIndex] = tmp;
					tmpIndex--;
				} else break;

			}
		}


		// for (int i = 1; i<arr.length; i++) {
		// 	int index = i;
		// 	for (int j = i - 1; j>=0; j--) {
		// 		if (arr[j]>arr[index]) {
		// 			int tmp = arr[j];
		// 			arr[j] = arr[index];
		// 			arr[index] = tmp;
		// 			index--;
		// 		} else break;
		// 	}
		// }
		return arr;
	}
	public static void main(String[] args) {
		Insertion b = new Insertion();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		for (int x : b.solution(arr)) System.out.print(x + " ");
	}
}
