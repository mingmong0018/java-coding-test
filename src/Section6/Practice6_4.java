package Section6;

import java.util.Scanner;

public class Practice6_4 {
	public static int[] solution(int[] arr, int s, int n) {
		int[] temp = new int[1001];
		int[] answer = new int[s];
		int index = 0;
		for (int i = arr.length-1; i>=0; i--) {
			if (index == s) break;
			if (temp[arr[i]] == 1) continue;
			answer[index] = arr[i];
			index++;
			temp[arr[i]] = 1;
		}
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i : solution(arr, s, n)) {
			System.out.print(i + " ");
		}
	}
}
