package Sorting;

import java.util.Scanner;
// 정렬하고자 하는 배열의 숫자 전체 범위를 알고 있을 떄 사용하는 정렬 방법
// 전체 범위를 여러 버킷으로 나누고, 배열을 읽어가며 숫자들을 해당 버킷에 넣는다
// 버킷들을 독립적으로 정렬하여 순서대로 모으면 정렬이 완료
public class Bucket {
	public int[] solution(int[] arr) {
		int[] count = new int[6];
		for (int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}
		int num = 0;
		for (int i = 1; i < count.length; i++) {
			for (int j = 1; j<=count[i]; j++) {
				arr[num++] = i;
			}

		}
		return arr;
	}
	public static void main(String[] args) {
		Bucket b = new Bucket();
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		for (int x : b.solution(arr)) System.out.print(x + " ");
	}
}
