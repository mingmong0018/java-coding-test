package Section1;

import java.util.Scanner;

public class Practice1_8 {
    public String solution(String str) {
        String answer = "YES";
        str = str.toLowerCase();
        int lt = 0, rt = str.length()-1;
        while(lt<rt) {
            while(!Character.isAlphabetic(str.charAt(lt))) lt++;
            while(!Character.isAlphabetic(str.charAt(rt))) rt--;
            if (lt<rt) {
                if (str.charAt(lt)!=str.charAt(rt)) answer = "NO";
                lt++;
                rt--;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Practice1_8 p = new Practice1_8();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(p.solution(str));
    }
}
