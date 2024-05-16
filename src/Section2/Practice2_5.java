package Section2;

import java.util.Scanner;

public class Practice2_5 {
    public int solution(int num) {
        int answer = 0;
        int[] arr = new int[num+1];
        for (int i = 2; i<=num; i++) {
            for (int j = i; j<=num; j+=i) {
                if (i==j) continue;
                arr[j] = 1;
            }
        }
        for (int i = 2; i<=num; i++) {
            if (arr[i] == 0) {
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Practice2_5 p = new Practice2_5();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(p.solution(num));
    }
}
