package Section2;

import java.util.Scanner;

public class Practice2_8 {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        for (int i = 0; i<arr.length; i++) {
            int count = 0;
            for (int j = 0; j<arr.length; j++) {
                if (arr[i]<arr[j]) count++;
            }
            answer[i] = count+1;
        }
        return answer;
    }
    public static void main(String[] args) {
        Practice2_8 p = new Practice2_8();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i<num; i++) {
            arr[i] = sc.nextInt();
        }
        for (int k: p.solution(arr)) {
            System.out.print(k+" ");
        }

    }
}
