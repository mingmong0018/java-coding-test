package Section2;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice2_3 {
    public ArrayList<String> solution(int[] arrA, int[] arrB) {
        ArrayList<String> answer = new ArrayList<>();
        for (int i = 0; i<arrA.length; i++) {
            if (arrA[i]-arrB[i] == 1 || arrA[i] - arrB[i] == -2) answer.add("A");
            else if (arrA[i] == arrB[i]) answer.add("D");
            else answer.add("B");
        }
        return answer;
    }
    public static void main(String[] args) {
        Practice2_3 p = new Practice2_3();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i<n;i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i<n;i++) {
            arr2[i] = sc.nextInt();
        }
        for (String s:p.solution(arr1,arr2)) {
            System.out.println(s);
        }
    }
}
