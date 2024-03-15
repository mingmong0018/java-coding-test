package Section2;

import java.util.Scanner;

public class Practice2_9 {
    public int solution(int[][] arr) {
		int answer = 0;
		int colSum = 0;
		int rowSum = 0;
		int leftDiagonal = 0;
		int rightDiagonal = 0;
		int diagonalMax = 0;
		int max = 0;
		for (int i = 0; i<arr.length; i++) {
			for (int j = 0; j<arr.length; j++) {
				colSum += arr[i][j];
				rowSum += arr[j][i];
				if (i == j) leftDiagonal += arr[i][j];
				if (i+j==arr.length-1) rightDiagonal += arr[i][j];
			}
			if (max < colSum) max = colSum;
			if (max < rowSum) max = rowSum;
			colSum = 0;
			rowSum = 0;
			diagonalMax = Math.max(rightDiagonal, leftDiagonal);
		}
		if (max < diagonalMax) max = diagonalMax;
		answer = max;
		return answer;
    }
    public static void main(String[] args) {
        Practice2_9 p = new Practice2_9();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int[][] arr = new int[n][n];
 		for (int i = 0; i<n; i++) {
			for (int j = 0; j<n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		 System.out.println(p.solution(arr));
    }
}
