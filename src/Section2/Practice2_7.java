package Section2;

import java.util.Scanner;

public class Practice2_7 {
    public int solution(int[] arr) {
        int answer = 0;
        int count = 0;
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                answer+=count;
            } else count = 0;
        }
        return answer;
    }

    public static void main(String[] args) {
        Practice2_7 p = new Practice2_7();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i<num; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(p.solution(arr));
    }
}

