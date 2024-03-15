package Structure;
public class Stack<T>{
	private Object[] data;
	private int top;
	private int size;
	public Stack(){
		size = 1;
		data = new Object[size];
		top = -1;
	}
	public void push(T data) {
		top++;
		if (top == this.size-1) {
			doubling();
		}
		this.data[top] = data;
	}
	private void doubling() {
		this.size *= 2;
		Object[] newData = new Object[this.size];
		for (int i = 0; i<this.data.length; i++) {
			newData[i] = this.data[i];
		}
		this.data = newData;
	}
	public T pop() {
		if (isEmpty()) {
			throw new IllegalArgumentException("비어있음");
		}
		return (T)this.data[top--];
	}
	public T peek() {
		if (isEmpty()) {
			throw new IllegalArgumentException("비어있음");
		}
		return (T)this.data[top];
	}
	private boolean isEmpty() {
		return top == -1;
	}

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
	}
}
