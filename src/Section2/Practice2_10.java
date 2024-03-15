package Section2;

import java.util.Scanner;

public class Practice2_10 {
	public int solution(int[][] arr) {
		int answer = 0;
		for (int i = 1; i<arr.length - 1; i++) {
			for (int j = 1; j<arr.length-1; j++) {
				int max = 0;
				if (max<arr[i-1][j]) max = arr[i-1][j];
				if (max<arr[i][j+1]) max = arr[i][j+1];
				if (max<arr[i][j-1]) max = arr[i][j-1];
				if (max<arr[i+1][j]) max = arr[i+1][j];
				if (max<arr[i][j]) answer++;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Practice2_10 p = new Practice2_10();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[][] arr = new int[num + 2][num + 2];
		for (int i = 1; i < arr.length - 1; i++) {
			for (int j = 1; j < arr.length - 1; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(p.solution(arr));

	}
}
