package Section1;

import java.util.Scanner;

public class Practice1_4 {
    public String solution(String str) {
        String answer = "";
        char[] arr = str.toCharArray();
        int lt = 0, rt = str.length()-1;
        while(lt<rt) {
            char tmp = arr[lt];
            arr[lt] = arr[rt];
            arr[rt] = tmp;
            lt++;
            rt--;
        }
        for (char c: arr) {
            answer+=c;
        }
        return answer;
    }
    public static void main(String[] args) {
        Practice1_4 p = new Practice1_4();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] arr = new String[num];
        for (int i = 0; i<num; i++) {
            arr[i] = sc.next();
        }
        for (int i = 0; i<num; i++) {
            System.out.println(p.solution(arr[i]));
        }
    }
}
