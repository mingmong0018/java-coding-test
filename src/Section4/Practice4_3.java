package Section4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Practice4_3 {
	public int[] solution(int[] arr, int num) {
		int[] answer = new int[num];
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i<num; i++) {
			for (int j = i; j<num+i; j++) {
				set.add(arr[j]);
			}
			answer[i] = set.size();
			set.clear();
		}
		return answer;
	}
	public static void main(String[] args) {
		Practice4_3 p = new Practice4_3();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int x: p.solution(arr, k)) {
			System.out.print(x + " ");
		}
	}
}
