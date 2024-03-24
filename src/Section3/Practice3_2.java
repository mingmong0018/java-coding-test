package Section3;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Practice3_2 {
	public void solution(int[] arr1, int[] arr2) {
		ArrayList<Integer> answer = new ArrayList<>();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int p1=0,p2=0;
		while(p1<arr1.length && p2<arr2.length) {
			if (arr1[p1]<arr2[p2]) p1++;
			else if (arr1[p1]>arr2[p2]) p2++;
			else {
				answer.add(arr1[p1]);
				p1++;
				p2++;
			}
		}
 		for (int i : answer) {
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		Practice3_2 p = new Practice3_2();
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int[] arr1 = new int[num1];
		for (int i = 0; i < num1; i++) {
			arr1[i] = sc.nextInt();
		}
		int num2 = sc.nextInt();
		int[] arr2 = new int[num2];
		for (int i = 0; i < num2; i++) {
			arr2[i] = sc.nextInt();
		}
		p.solution(arr1, arr2);
	}
}
