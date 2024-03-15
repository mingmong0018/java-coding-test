package Structure;
class Node<T> {
	T data;
	Node<T> next;
	public Node(T data) {
		this.data = data;
	}
}
public class LinkedList<T> {
	private Node<T> head;
	public void add (T data) {
		Node<T> node = new Node<>(data);
		if (head == null) {
			head = node;
			return;
		}
		Node<T> current = head;
		while(current.next!=null) {
			current = current.next;
		}
		current.next = node;
	}
	public boolean isEmpty() {
		return head == null;
	}
	public void delete(T data) {
		if (isEmpty()) {
			return ;
		}
		if (head.data.equals(data)) {
			head = null;
		}
		Node<T> current = head;
		while(current.next!=null) {
			if (current.next.data.equals(data)) {
				current.next = current.next.next;
				return;
			} else {
				current = current.next;
			}

		}
	}
	public void display() {
		Node<T> current = head;
		while(current!=null) {
			System.out.print(current.data);
			current = current.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.display();
		list.delete(3);
		list.display();
		list.delete(1);
		list.display();
	}
}
