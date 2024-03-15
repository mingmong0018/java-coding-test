package Section2;

import java.util.Scanner;

public class Practice2_5 {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n+1];
        for(int i = 2; i<arr.length; i++) {
            if (arr[i] == 0) {
                answer++;
                for (int j = i; j<arr.length; j+=i) arr[j] = 1;
            }
            else continue;
        }












        return answer;
        // for (int i = 2; i<=n; i++) {
        //     for (int j = i-1; j>1; j--) {
        //         if (i%j==0) {
        //             answer++;
        //             break;
        //         }
        //     }
        // }
        // return n-answer;
    }
    public static void main(String[] args) {
        Practice2_5 p = new Practice2_5();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(p.solution(n));
    }
}
