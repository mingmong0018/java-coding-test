package Section1;

import java.util.Locale;
import java.util.Scanner;

public class Practice1_7 {
    public String solution(String str) {
      String answer="YES";
      str = str.toUpperCase();
      for (int i = 0; i<str.length()/2; i++) {
          if (str.charAt(i) != str.charAt(str.length()-1-i)) {
              answer = "NO";
              break;
          }
      }
      return answer;
    }

    public static void main(String[] args) {
        Practice1_7 p = new Practice1_7();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(p.solution(str));
    }
}
