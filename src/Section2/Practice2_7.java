package Section2;

import java.util.Scanner;

public class Practice2_7 {
    public int solution(int[] arr) {
        int answer = 0;
        int count=0;

        for (int i = 0; i<arr.length;i++) {
            if (arr[i] == 0) count = 0;
            else if (arr[i] == 1) {
                count++;
                answer += count;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Practice2_7 p = new Practice2_7();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(p.solution(arr));
    }
}

