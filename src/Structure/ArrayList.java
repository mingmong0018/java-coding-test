package Structure;
































// public class ArrayList {
// 	private Object[] data;
// 	private int size;
// 	private int index;
// 	public ArrayList() {
// 		size = 1;
// 		data = new Object[size];
// 		index = 0;
// 	}
// 	public void add(Object data) {
// 		if (this.index == this.size-1) {
// 			doubling();
// 		}
// 		this.data[index] = data;
// 		index++;
// 	}
// 	private void doubling() {
// 		this.size *= 2;
// 		Object[] newData = new Object[this.size];
// 		for (int i = 0; i<this.data.length-1; i++) {
// 			newData[i] = this.data[i];
// 		}
// 		this.data = newData;
// 	}
// 	public Object get(int index) throws Exception{
// 		if (index > this.index-1) {
// 			throw new Exception("ArrayIndexOutBounding");
// 		} else if (index < 0) {
// 			throw new Exception("음수");
// 		}
// 		return this.data[index];
// 	}
// 	public void remove(int index) throws Exception{
// 		if (index > this.index-1) {
// 			throw new Exception("ArrayIndexOutBounding");
// 		} else if (index < 0) {
// 			throw new Exception("음수");
// 		}
// 		for (int i = index; i<this.data.length-1; i++) {
// 			this.data[i] = this.data[i+1];
// 		}
// 		this.index--;
// 	}
// }
// class MainByArrayList {
// 	public static void main(String[] args) throws Exception{
// 		ArrayList list = new ArrayList();
// 		list.add(0);
// 		list.add(1);
// 		list.add(2);
// 		list.add(3);
// 		list.add(4);
// 		list.add(5);
// 		list.add(6);
// 		list.add(7);
// 		list.remove(3);
// 		System.out.println(list.get(3));
//
// 	}
// }
