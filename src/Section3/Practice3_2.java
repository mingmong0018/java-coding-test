package Section3;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice3_2 {
	public ArrayList<Integer> solution(int[] arr1, int[] arr2) {
		ArrayList<Integer> answer = new ArrayList<>();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					answer.add(arr1[i]);
					break;
				}
			}
		}
		// 8 6 5 2 3 4
		// 6 8 5 2 3 4
		//
		for (int i = 0; i < answer.size(); i++) {
			for (int j = 0; j < answer.size()- 1 - i; j++) {
				if (answer.get(j) > answer.get(j + 1)) {
					int tmp = answer.get(j);
					answer.set(j + 1, answer.get(j));
					answer.set(j, tmp);
				}
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Practice3_2 p = new Practice3_2();
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int[] arr1 = new int[num1];
		for (int i = 0; i < num1; i++) {
			arr1[i] = sc.nextInt();
		}
		int num2 = sc.nextInt();
		int[] arr2 = new int[num2];
		for (int i = 0; i < num2; i++) {
			arr2[i] = sc.nextInt();
		}
		for(int x : p.solution(arr1, arr2)) System.out.print(x + " ");
	}
}
