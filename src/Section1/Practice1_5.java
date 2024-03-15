package Section1;

import java.util.Scanner;

public class Practice1_5 {
    public String solution(String str) {
       String answer = "";
       int lt = 0, rt = str.length() - 1;
       char[] c = str.toCharArray();
       while (lt < rt) {
           if (!Character.isAlphabetic(c[lt])) lt++;
           else if (!Character.isAlphabetic(c[rt])) rt--;
           else if (Character.isAlphabetic(c[lt]) && Character.isAlphabetic(c[rt])) {
               char tmp = c[lt];
               c[lt] = c[rt];
               c[rt] = tmp;
               lt++;
               rt--;
           }
       }
       answer = String.valueOf(c);


       return answer;
    }
    public static void main(String[] args) {
        Practice1_5 p = new Practice1_5();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(p.solution(str));
    }
}
