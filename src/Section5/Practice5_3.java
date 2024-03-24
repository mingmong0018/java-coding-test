package Section5;

import java.util.Scanner;
import java.util.Stack;

public class Practice5_3 {
	public int solution(int[][] arr, int[] moves) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		for(int i = 0; i<moves.length; i++) {
			for (int j = 0; j<arr.length; j++) {
				if (arr[j][moves[i]-1] != 0) {
					stack.push(arr[j][moves[i]-1]);
					arr[j][moves[i]-1] = 0;
					if (stack.size()!=1) {
						if (stack.get(stack.size() - 1) == stack.get(stack.size()-2)) {
							answer+=2;
							stack.pop();
							stack.pop();
						}
					}
					break;
				}
			}

		}
		return answer;
	}
	public static void main(String[] args) {
		Practice5_3 p = new Practice5_3();
		Scanner sc = new Scanner(System.in);
		int boardNum = sc.nextInt();
		int[][] arr = new int[boardNum][boardNum];
		for (int i = 0; i<boardNum; i++) {
			for (int j = 0; j<boardNum; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int movesNum = sc.nextInt();
		int[] moves = new int[movesNum];
		for (int i = 0; i<movesNum; i++) {
			moves[i] = sc.nextInt();
		}
		System.out.println(p.solution(arr, moves));
	}
}
