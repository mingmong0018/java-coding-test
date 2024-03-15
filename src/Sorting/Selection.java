package Sorting;

import java.util.Scanner;

// 공부 방법 : 1. 설명 2. 먼저 구현 3. 다시 설명
// 설명 : 배열을 돌면서 가장 작 값부터 하나씩 앞으로 차곡차곡 옮기는 겁니다
// 작은 값을 앞으로 옮기기 위해서는 우선 가장 작은 값을 찾아야 합니다
// 배열을 돌면서 찾아낸 가장 작은 값을 저장할 변수를 하나 선언하고 현재로써 가장 작은 값을 모르니까 시작값으로 초기화 합니다
// 이제 배열 방을 돌면서 가장 작은 값을 찾습니다
// 다 돌고 값을 찾으면 정렬이 안된 가장 첫번 째 값을 가장 작은 값과 교체합니다 이런식으로 반복하여 정렬..
public class Selection {
	public int[] solution(int[] arr) {
		for (int i = 0; i<arr.length; i++) {
			int minIndex = i;
			for (int j = i; j<arr.length; j++) {
				if (arr[minIndex]>arr[j]) {
					minIndex = j;
				}
			}
			int tmp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = tmp;
		}
		return arr;
	}
	public static void main(String[] args) {
		Selection b = new Selection();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		for (int x : b.solution(arr)) System.out.print(x + " ");
	}
}
