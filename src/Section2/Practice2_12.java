package Section2;

import java.util.Scanner;
// 한번 더 !!!!!!!!!!!!!!
public class Practice2_12 {
	private int solution(int n, int m, int[][] arr) {
		int answer = 0;
		for (int i = 1; i<=n; i++) {
			for (int j = 1; j<=n;j++) {
				int cnt = 0;
				for (int k = 0; k<m; k++) {
					int pi = 0;
					int pj = 0;
					for (int s = 0; s<n; s++) {
						if (arr[k][s] == i) pi = s;
						if (arr[k][s] == j) pj = s;
					}
					if (pi>pj) cnt++;
				}
				if (cnt == m) answer++;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Practice2_12 p = new Practice2_12();
		Scanner sc = new Scanner(System.in);
		int col = sc.nextInt();
		int row = sc.nextInt();
		int[][] arr = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(p.solution(col, row, arr));


	}
}
