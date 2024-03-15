package Structure;































// class Node<T> {
// 	T data;
// 	Node<T> next;
// 	public Node(T obj) {
// 		data = obj;
// 	}
// }
// public class LinkedList<T> {
// 	private Node<T> head;
// 	public void add (T data) {
// 		if (head == null) {
// 			head = new Node<>(data);
// 			return;
// 		}
// 		Node current = head;
// 		while (current.next != null) {
// 			current = current.next;
// 		}
// 		current.next = new Node<>(data);
// 	}
// 	public void delete (T data) {
// 		if (head == null) {
// 			return ;
// 		}
// 		if (head.data.equals(data)) {
// 			head = head.next;
// 		}
// 		Node current = head;
// 		while (current.next != null) {
// 			if (current.next.data.equals(data)) {
// 				current.next = current.next.next;
// 			} else {
// 				current = current.next;
// 			}
// 		}
// 	}
// 	public void display() {
// 		Node<T> current = head;
// 		while (current != null) {
// 			System.out.println(current.data + " ");
// 			current = current.next;
// 		}
// 	}
// }
// class MainByLinkedList {
// 	public static void main(String[] args) throws Exception{
// 		LinkedList<Integer> list = new LinkedList();
// 		list.add(1);
// 		list.add(2);
// 		list.add(3);
// 		list.add(4);
// 		list.add(5);
// 		list.display();
// 		list.delete(3);
// 		list.display();
// 	}
// }
