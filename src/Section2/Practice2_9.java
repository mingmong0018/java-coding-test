package Section2;

import java.util.Scanner;

public class Practice2_9 {
    public int solution(int[][] arr, int num) {
        int answer = 0;
        int daeL = 0;
        int daeR = 0;
        int daeMax = 0;
        for (int i = 0; i<num; i++) {
            daeL += arr[i][i];
        }
        for (int i = 0, j = num-1; i<num; i++,j--) {
            daeR += arr[i][j];
        }
        daeMax = Integer.max(daeL, daeR);
        int sum = 0;
        for (int i = 0; i<num; i++) {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j<num; j++) {
                colSum += arr[i][j];
                rowSum += arr[j][i];
            }
            sum = Integer.max(colSum, rowSum);
        }
        answer = Integer.max(daeMax, sum);
        return answer;
    }
    public static void main(String[] args) {
        Practice2_9 p = new Practice2_9();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[num][num];
        for (int i = 0; i<num; i++) {
            for (int j = 0; j<num; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(p.solution(arr, num));
    }
}
