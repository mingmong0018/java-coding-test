package Structure;

public class ArrayList<T> {
	private Object[] data;
	private int index;
	private int size;
	public ArrayList() {
		size = 1;
		data = new Object[size];
		index = 0;
	}
	public void add(T data) {
		if (this.index == this.size - 1) {
			doubling();
		}
		this.data[this.index] = data;
		this.index++;
	}
	private void doubling() {
		this.size *= 2;
		Object[] newData = new Object[this.size];
		for (int i = 0 ;i<this.data.length; i++) {
			newData[i] = this.data[i];
		}
		this.data = newData;
	}
	public T get(int index) {
		if (this.index-1<index) {
			throw new IndexOutOfBoundsException("범위를 벗어남");
		} else if (index<0) {
			throw new IndexOutOfBoundsException("index가 음수임");
		}
		return (T)this.data[index];
	}
	public void remove(int index) {
		if (this.index-1<index) {
			throw new IndexOutOfBoundsException("범위를 벗어남");
		} else if (index<0) {
			throw new IndexOutOfBoundsException("index가 음수임");
		}
		for (int i = index; i<this.data.length - 1; i++) {
			this.data[i] = this.data[i+1];
		}
		this.data[this.data.length - 1] = null;
		this.index--;
		this.size--;
	}
	public void add(int index, T data) {
		if (this.index == this.size - 1) {
			doubling();
		}
		for (int i = index + 1; i<this.data.length; i++) {
			this.data[i] = this.data[i-1];
		}
		this.data[index] = data;
		this.index++;this.size++;
	}
	public void allPrint() {
		for(int i = 0; i<this.index; i++) {
			System.out.print(this.data[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.allPrint();
		list.get(2);
		list.remove(2);
		list.get(2);
		list.allPrint();
		list.add(2,7);
		list.allPrint();
	}
}
