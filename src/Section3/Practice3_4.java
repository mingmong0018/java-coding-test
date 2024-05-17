package Section3;

import java.util.Scanner;

public class Practice3_4 {
	public int solution(int[] arr, int m) {
		int answer = 0;
		int sum = 0;
		int lt = 0;
		for (int rt = 0; rt<arr.length; rt++) {
			sum += arr[rt];
			if (sum == m) answer ++;
			else if (sum > m) {
				while(lt<rt) {
					sum -= arr[lt];
					lt++;
					if (sum == m) answer++;
					else if (sum < m) break;
				}
			}


		}
		return answer;
	}
	public static void main(String[] args) {
		Practice3_4 p = new Practice3_4();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(p.solution(arr, m));
	}
}
