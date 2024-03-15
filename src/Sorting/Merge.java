package Sorting;

import java.util.Scanner;

// 공부 방법 : 1. 설명 2. 먼저 구현 3. 다시 설명
// 설명 : 함수가 호출될 때마다 절반씩 잘라서 재귀적으로 함수를 호출하고
// 맨끝에 제일 작은 조각부터 2개씩 병합해서 정렬된 배열을 머지 해나가는 방법

public class Merge {
	public int[] mergeSort(int[] arr, int start, int end) {
		int mid = (start+end)/2;
		if (start<end) {
			mergeSort(arr,start,mid);
			mergeSort(arr,mid+1, end);
		}
		int[] tmpArr = new int[end-start+1];
		int tmpIndex = 0;
		int p1 = start;
		int p2 = mid+1;
		while (p1<=mid && p2<=end) {
			if (arr[p1]>arr[p2]) tmpArr[tmpIndex++] = arr[p2++];
			else tmpArr[tmpIndex++] = arr[p1++];
		}
		while (p1<=mid) tmpArr[tmpIndex++] = arr[p1++];
		while (p2<=end) tmpArr[tmpIndex++] = arr[p2++];

		for (int i = start; i<=end; i++) {
			arr[i] = tmpArr[i-start];
		}
		return arr;
	}
	public static void main(String[] args) {
		Merge b = new Merge();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		for (int x : b.mergeSort(arr, 0, arr.length - 1)) System.out.print(x + " ");
	}
}
