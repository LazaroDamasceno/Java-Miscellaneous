
public class ArrayImpl implements Array {
	
	private Object[] array = new Object[0];

	@Override
	public void push(Object object) {
		int size = this.array.length+1;
		Object[] array = new Object[size];
		for (int i = 0; i < this.array.length; i++) {
			array[i] = this.array[i];
		}
		int lastIndex = array.length-1;
		array[lastIndex] = object;
		this.array = array;
	}

	@Override
	public void pop() {
		int size = this.array.length-1;
		Object[] array = new Object[size];
		for (int i = 0; i < this.array.length-1; i++) {
			array[i] = this.array[i];
		}
		this.array = array;
	}
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("[");
		for (int i = 0; i < array.length-1; i++) {
			stringBuilder.append(array[i] + ", ");
		}
		int lastIndex = array.length-1;
		stringBuilder.append(array[lastIndex]);
		stringBuilder.append("]");
		return stringBuilder.toString();
	}
	
}
