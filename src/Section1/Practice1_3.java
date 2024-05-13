package Section1;

import java.util.Scanner;

public class Practice1_3 {
    public String solution(String str) {
        String answer = "";
        String[] arr = str.split(" ");
        int lt = 0, rt = arr.length - 1;
        while(lt<rt) {
            if (arr[lt].length()<arr[rt].length()) lt++;
            else rt--;
        }
        answer = arr[lt];
        return answer;
    }
    public static void main(String[] args) {
        Practice1_3 p = new Practice1_3();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(p.solution(str));

    }
}
