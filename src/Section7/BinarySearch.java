package Section7;

import java.util.Scanner;

// 재귀함수 : 반복적으로 자기자신을 호출하는 함수
public class BinarySearch {
	public static int binarySearch(int[] arr, int left, int right, int target) {
		if (left > right) return -1;
		int mid = (left + right) / 2;
		if (arr[mid] == target) return mid;
		else if (arr[mid] > target) return binarySearch(arr, left, mid - 1, target);
		else return binarySearch(arr, mid + 1, right, target);
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int index;
		index = binarySearch(arr, 0, 9, 5);
		if (index == -1) {
			System.out.println("찾는 값 없음");
		} else System.out.printf("arr[%d]에 찾는 값 있음\n", index);
	}
}
