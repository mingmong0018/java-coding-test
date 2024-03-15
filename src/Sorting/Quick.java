package Sorting;

//퀵정렬 = 분할정복방법론
// pivot point라고 기준이 되는 값을 하나 설정하는데, 이 값을 기준으로 작은 값은 왼쪽, 큰 값은 오른쪽으로 옮기는 방식으로 정렬을 진행한다
// 이를 반복하여 분할된 배열의 크기가 1이되면 배열이 모두 정렬된 것이다.
public class Quick {
	public int[] quick(int[] arr, int start, int end) {
		int pivot = arr[(start+end)/2];
		int pl = start;
		int pr = end;
		while(pl<=pr) {
			while(arr[pl]<pivot) pl++;
			while(pivot<arr[pr]) pr--;
			if (pl<=pr) {
				int tmp = arr[pl];
				arr[pl] = arr[pr];
				arr[pr] = tmp;
				pl++;
				pr--;
			}
		}
		if (start<pr) return quick(arr, start, pr);
		if (pl<end) return quick(arr, pl, end);
		return arr;
	}
	public static void main(String[] args) {
		Quick q = new Quick();
		int[] arr = {3, 9, 4, 7, 0, 1, 5, 8, 6, 2};
		for (int x : q.quick(arr, 0, arr.length - 1))System.out.print(x + " ");
	}
}
