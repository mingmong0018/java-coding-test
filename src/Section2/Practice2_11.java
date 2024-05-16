package Section2;

import java.util.Scanner;

public class Practice2_11 {
	public int solution(int[][] arr, int num) {
		int answer = 0;
		int max = 0;
		for (int i = 0; i<num; i++) {
			int cnt = 0;
			for (int j = 0; j<num; j++) {
				for (int k = 0; k<5; k++) {
					if (arr[i][k] == arr[j][k]) {
						cnt++;
						break;
					}
				}
			}
			if (max<cnt) {
				max = cnt;
				answer = i;
			}

		}
		return answer + 1;
	}

	public static void main(String[] args) {
		Practice2_11 p = new Practice2_11();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[][] arr = new int[num][5];
		for (int i = 0; i<num; i++) {
			for (int j = 0; j<5; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(p.solution(arr, num));


	}
}
