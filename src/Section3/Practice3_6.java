package Section3;

import java.util.Scanner;

public class Practice3_6 {
	public int solution(int[] arr, int k) {
		int answer = 0, cnt = k, lt = 0;
		for(int rt = 0; rt<arr.length; rt++) {
			if (arr[rt] == 0) cnt--;
			while (cnt<0) {
				if (arr[lt] == 0) {
					cnt++;
				}
				lt++;
			}
			answer = Integer.max(answer, rt-lt+1);
		}
		return answer;
	}
	public static void main(String[] args) {
		Practice3_6 p = new Practice3_6();
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
