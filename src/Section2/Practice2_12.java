package Section2;

import java.util.Scanner;
public class Practice2_12 {
	public int solution(int[][] arr, int n, int m) {
		int answer = 0;
		for (int i = 0; i<n; i++) {
			for (int j = 0; j<n; j++) {
				int cnt = 0;
				for (int k = 0; k<m; k++) {
					int pi = -1;
					int pj = -1;
					for (int l = 0; l<n; l++) {
						if (arr[k][l] == i+1) pi = l;
						if (arr[k][l] == j+1) pj = l;
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
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[m][n];
		for (int i = 0; i<m; i++) {
			for (int j = 0; j<n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(p.solution(arr, n, m));



	}
}
