package Section10;

import java.util.Scanner;

public class Practice10_3 {
	static int[] dy;
	public static int solution(int[] arr, int num) {
		dy[0] = 1;
		int answer = 0;
		for (int i = 1; i<num; i++) {
			int max = 0;
			for (int j = i - 1; j>=0; j--) {
				if (arr[i]>arr[j]) {
					if (dy[j]>max) max = dy[j];
				}
			}
			dy[i] = max + 1;
			answer = Math.max(answer, dy[i]);
		}
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		dy = new int[num];
		for (int i = 0; i<num; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(solution(arr,num));
	}
}
