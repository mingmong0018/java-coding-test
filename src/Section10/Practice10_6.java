package Section10;

import java.util.Scanner;

public class Practice10_6 {
	static int[] dy;
	public static int solution(int[][] arr, int n, int m) {
		for (int i = 0; i<n; i++) {
			for (int j = m; j>=arr[i][1]; j--) {
				dy[j] = Math.max(dy[j],dy[j-arr[i][1]]+arr[i][0]);
 			}
		}
		return dy[m];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][2];
		for (int i = 0 ;i <n; i++) {
			for (int j = 0; j<2; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		dy = new int[m+1];
		System.out.println(solution(arr, n, m));
	}
}
