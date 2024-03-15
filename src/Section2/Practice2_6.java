package Section2;

import java.util.ArrayList;
import java.util.Scanner;

// 뒤집은 소수
public class Practice2_6 {
    public boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i = 2; i<num; i++) {
            if (num%i ==0) return false;
        }
        return true;
    }
    public ArrayList<Integer> solution(int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0; i<arr.length; i++) {
            int tmp = arr[i];
            int sum = 0;
            while(tmp>0) {
                sum = (sum*10) + (tmp%10);
                tmp=tmp/10;
            }
            if (isPrime(sum)) answer.add(sum);
        }
        return answer;
    }
    public static void main(String[] args) {
        Practice2_6 p = new Practice2_6();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : p.solution(arr)) {
            System.out.print(x+" ");
        }

    }
}
