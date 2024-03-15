package Section10;

import java.util.Scanner;

public class Practice10_1 {
	static int[] dy;
	public static int solution(int num) {
		for (int i = 3; i <= num; i++) {
			dy[i] = dy[i-1] + dy[i-2];
		}
		return dy[num];

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		dy = new int[num+1];
		dy[1] = 1;
		dy[2] = 2;
		System.out.println(solution(num));
	}
}
