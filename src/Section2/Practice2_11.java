package Section2;

import java.util.Scanner;

public class Practice2_11 {
	private int solution(int[][] arr) {
		int answer = 0;
		int max = 0;
		for (int i = 1; i<=5; i++) {
			int cnt = 0;
			for (int j = 1; j<=5; j++) {
				for (int k = 1; k<=5; k++) {
					if (arr[i][k] == arr[j][k]){
						cnt++;
						break;
					}
				}
			}
			if (max<cnt) max = cnt;
		}
		answer = max;
		return answer;
	}
	public static void main(String[] args) {
		Practice2_11 p = new Practice2_11();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[][] arr = new int[num + 1][num + 1];
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= 5; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(p.solution(arr));

	}
}
