package 콜렉션_개념;

import java.util.Vector;

class MyVector<T> {
	private Object[] arr;
	private int count;
	
	public void add(T data) {
		if (count == 0) {
			arr = new Object[1];
		} else if (count > 0) {
			Object[] temp = arr;
			arr = new Object[count + 1];
			
			for (int i = 0; i < temp.length; i++) {
				arr[i] = temp[i];
			}
			temp = null;
		}
		arr[count] = data;
		count += 1;
	}
	public T get(int index) {
		return (T)arr[index];
	}
	public void set(int index, T data) {
		arr[index] = data;
	}
	public int size() {
		return count;
	}
}

class User {
	public String name;
	
	public User() {}
	public User(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
class Tv {}

public class 제네릭_기본이론3_제네릭벡터 {

	public static void main(String[] args) {
		MyVector<User> list1 = new MyVector<User>();
		list1.add(new User("홍길동"));
		list1.add(new User("김민수"));
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		
		// <> 제네릭은 클래스를 지정해주는대로 사용가능하다. 
		MyVector<Tv> list2 = new MyVector<Tv>();
		
		Vector<User> list3 = new Vector<User>();
		list3.add(new User("홍길동"));
		User temp1 = new User("김소정");
		list3.add(temp1);
		
		list3.set(1, new User("최민정"));
		
		for (User user : list3) {
			System.out.println(user.toString());
		}
	}

}
