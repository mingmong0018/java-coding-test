package Structure;
public class Stack<T> {
	int top;
	int size;
	Object[] data;
	public Stack() {
		top = -1;
		size = 1;
		data = new Object[size];
	}
	// 스택에 요소 추가 (push)
	public void push (T obj) {
		++top;
		if (top == this.size - 1) {
			doubling();
		}
		data[top] = obj;
	}
	// 스택 용량 확장
	private void doubling() {
		this.size *= 2;
		Object[] newData = new Object[this.size];
		for (int i = 0; i<this.data.length; i++) {
			newData[i] = this.data[i];
		}
		this.data = newData;
	}
	// 스택에서 요소 삭제하고 반환 (pop)
	public T pop() {
		return (T)this.data[top--];
	}
	// 스택에서 맨 위 요소 반환 (peek)
	public T peek() {
		return (T)this.data[top];
	}

}
class MainByStack {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.peek());

	}
}
