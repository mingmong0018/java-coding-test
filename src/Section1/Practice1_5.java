package Section1;

import java.util.Scanner;

public class Practice1_5 {
    public String solution(String str) {
        String answer = "";
        char[] arr = str.toCharArray();
        int lt = 0, rt = str.length()-1;
        while(lt<rt) {
            while (!Character.isAlphabetic(arr[lt])) lt++;
            while (!Character.isAlphabetic(arr[rt])) rt--;
            if (lt<rt) {
                char tmp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = tmp;
                lt++;
                rt--;
            } else break;
        }
        for(char c: arr) {
            answer+=c;
        }
        return answer;
    }
    public static void main(String[] args) {
        Practice1_5 p = new Practice1_5();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(p.solution(str));

    }
}
