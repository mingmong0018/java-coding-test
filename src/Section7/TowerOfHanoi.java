package Section7;

import java.util.Scanner;

// 재귀함수 : 반복적으로 자기자신을 호출하는 함수
public class TowerOfHanoi {
	public void hanoi(int num, char from, char temp, char to) {
		if (num == 1) {
			System.out.println(from + "->" + to);
			return ;
		}
		hanoi(num-1, from, to, temp);
		System.out.println(from + "->" + to);
		hanoi(num - 1, temp, from, to);
	}
	public static void main(String[] args) {
		TowerOfHanoi toh =  new TowerOfHanoi();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		toh.hanoi(num, 'A','B','C');
	}
}
