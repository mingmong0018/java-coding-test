package Section10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Brick implements Comparable<Brick> {
	int size;
	int height;
	int weight;
	public Brick(int size, int height, int weight) {
		this.size = size;
		this.height = height;
		this.weight = weight;
	}

	@Override
	public int compareTo(Brick o) {
		return o.size - this.size;
	}
}
public class Practice10_4 {
	static int[] dy;
	public static int solution(ArrayList<Brick> list, int num) {
		int answer = 0;
		Collections.sort(list);
		dy[0] = list.get(0).height;
		for (int i = 1; i<num; i++) {
			int max = 0;
			for (int j = i - 1; j>=0; j--) {
				if (list.get(i).weight < list.get(j).weight) {
					if (dy[j]>max) max = dy[j];
				}
			}
			dy[i] = max + list.get(i).height;
			answer = Math.max(answer, dy[i]);
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		ArrayList<Brick> list = new ArrayList<>();
		for (int i = 0; i<num; i++) {
			list.add(new Brick(sc.nextInt(), sc.nextInt(), sc.nextInt()));
		}
		dy = new int[num];
		System.out.println(solution(list, num));
	}
}
