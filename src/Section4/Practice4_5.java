package Section4;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Practice4_5 {
	public int solution(int[] arr, int k) {
		int answer = -1;
		TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
		for (int i = 0; i<arr.length-2; i++) {
			for (int j = i+1; j<arr.length-1; j++) {
				for (int m = j+1; m<arr.length; m++) {
					set.add(arr[i]+arr[j]+arr[m]);
				}
			}
		}
		int cnt = 0;
		for (int x: set) {
			cnt++;
			if (cnt == k) return x;
		}
		return answer;
	}
	public static void main(String[] args) {
		Practice4_5 p = new Practice4_5();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(p.solution(arr, k));
	}
}
