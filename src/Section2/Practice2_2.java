package Section2;

import java.util.Scanner;

public class Practice2_2 {
    public int solution(int[] arr) {
        int answer = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i<arr.length; i++) {
            if (max<arr[i]) {
                max = arr[i];
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Practice2_2 p = new Practice2_2();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i<num; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(p.solution(arr));
    }
}
