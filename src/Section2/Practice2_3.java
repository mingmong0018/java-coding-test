package Section2;

import java.util.Scanner;

public class Practice2_3 {
    public char[] solution(int[] arr1, int[] arr2, int n) {
        char[] answer = new char[n];
        for (int i = 0; i<n; i++) {
            if ((arr1[i]==2 && arr2[i] == 1) || (arr1[i]==3 && arr2[i]==2) || (arr1[i]==1 && arr2[i]==3)) answer[i] = 'A';
            else if (arr1[i] == arr2[i]) answer[i] = 'D';
            else answer[i] = 'B';
        }
        return answer;
    }

    public static void main(String[] args) {
        Practice2_3 p = new Practice2_3();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i<n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i<n; i++) {
            arr2[i] = sc.nextInt();
        }
        for (char k: p.solution(arr1, arr2, n)) {
            System.out.println(k);
        }
    }
}
