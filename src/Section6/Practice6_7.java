package Section6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Practice6_7 {
	static class Point implements Comparable<Point>{
		int x;
		int y;
		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public int compareTo(Point o) {
			if (this.x == o.x) return this.y - o.y;
			else return this.x - o.x;
		}
	}
	public static Point[] solution(Point[] arr) {
		Arrays.sort(arr);
		return arr;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Point[] arr = new Point[num];
		for (int i = 0; i<num; i++) {
			arr[i] = new Point(sc.nextInt(), sc.nextInt());
		}
		for (Point point: solution(arr)) {
			System.out.println(point.x + " " + point.y);
		}

	}
}
