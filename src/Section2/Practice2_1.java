package Section2;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice2_1 {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] < arr[i]) answer.add(arr[i]);
        }
        return answer;
    }
    public static void main(String[] args) {
        Practice2_1 p = new Practice2_1();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i< num; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i: p.solution(arr)) {
            System.out.print(i+" ");
        }
    }
}
