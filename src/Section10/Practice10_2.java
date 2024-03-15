package Section10;

import java.util.Scanner;

public class Practice10_2 {
	static int[] dy;
	public static int solution(int num) {
		for (int i = 3; i <= num+1; i++) {
			dy[i] = dy[i-1] + dy[i-2];
		}
		return dy[num+1];

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		dy = new int[num+2];
		dy[1] = 1;
		dy[2] = 2;
		System.out.println(solution(num));
	}
}
