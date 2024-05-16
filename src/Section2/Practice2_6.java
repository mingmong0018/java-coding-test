package Section2;

import java.util.ArrayList;
import java.util.Scanner;

// 뒤집은 소수
public class Practice2_6 {
    private boolean isPrime (int num) {
        if (num == 1) return false;
        if (num == 2) return true;
        for (int i = 2; i<num; i++) {
            if (num%i==0) return false;
        }
        return true;
    }
    public ArrayList<Integer> solution (int num, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i<num; i++) {
            int sum = 0;
            int tmp = arr[i];
            while(tmp!=0) {
                sum = sum * 10 + (tmp%10);
                tmp /= 10;
            }
            arr[i] = sum;
            if (isPrime(arr[i])) answer.add(arr[i]);
        }
        return answer;
    }
    public static void main(String[] args) {
        Practice2_6 p = new Practice2_6();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i<num; i++) {
            arr[i] = sc.nextInt();
        }
        for (int k: p.solution(num, arr)) {
            System.out.print(k + " ");
        }

    }
}
