package 콜렉션_개념;

import java.util.ArrayList;

public class 콜렉션종류_기본이론1_어레이리스트1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// 1. add(value) : ArrayList의 맨 뒤에 value를 추가한다.
		list.add(1);
		list.add(2);
		// 2. remove(index) : ArrayList의 index번째 데이터를 제거한다.
		list.remove(0);
		// 3. size() : ArrayList에 저장된 데이터의 개수를 얻어온다.
		System.out.println(list.size());
		
		// 4. get() : ArrayList의 index번째의 value를 얻어온다.
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// 5. add(index, value) : ArrayList의 index번째 위치에 value를 삽입한다.
		list.add(0, 0);
		System.out.println(list); // [0, 2]
		
		// 6.set(index, value) : ArrayList의 index번째 위치에 value를 수정한다.
		list.set(1, 1);
		
		// 7. clear() : ArrayList의 모든 데이터를 제거한다.
		list.clear();
	}

}
