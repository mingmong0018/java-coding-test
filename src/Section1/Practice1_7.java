package Section1;

import java.util.Scanner;

public class Practice1_7 {
    public String solution(String str) {
      String answer = "YES";
      String oldStr = str.toLowerCase();
      String newStr = new StringBuilder(oldStr).reverse().toString();
      if (!oldStr.equals(newStr)) answer = "NO";

      return answer;
    }

    public static void main(String[] args) {
        Practice1_7 p = new Practice1_7();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(p.solution(str));
    }
}
