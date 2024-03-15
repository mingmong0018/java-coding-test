// package Structure;
// class Node<T> {
// 	T data;
// 	Node<T> next;
// 	public Node(T data) {
// 		this.data = data;
// 	}
// }
// public class Queue<T> {
// 	private Node<T> first;
// 	private Node<T> last;
// 	// 큐에 요소 추가 (enqueue)
// 	public void enqueue(T data) {
// 		Node<T> node = new Node<>(data);
// 		if (last != null) {
// 			last.next = node;
// 		}
// 		last = node;
// 		if (first == null) {
// 			first = last;
// 		}
// 	}
// 	// 큐에서 요소 삭제하고 반환 (dequeue)
// 	public T dequeue() {
// 		if (isEmpty()) {
// 			throw new IllegalArgumentException("비어있음");
// 		}
// 		T data = first.data;
// 		first = first.next;
// 		if (first == null) {
// 			last = null;
// 		}
// 		return data;
// 	}
// 	// 큐의 맨 앞 요소 반환 (peek)
// 	public T peek() {
// 		if (isEmpty()) {
// 			throw new IllegalArgumentException("비어있음");
// 		}
// 		return first.data;
// 	}
// 	// 큐가 비어있는지 여부 확인
// 	private boolean isEmpty() {
// 		return first == null;
// 	}
//
// }
// class MainByQueue {
// 	public static void main(String[] args) {
// 	}
// }
