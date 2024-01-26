package 배열_개념;

import java.util.ArrayList;

public class 배열9_개념12_리스트기본 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(4);
		
		System.out.println(list);
		System.out.println(list.size());
		
		for (int num : list) {
			System.out.println(num);
		}
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == 4) {
				list.set(i, 3);
			}
			System.out.println(list.get(i));
		}
		System.out.println(list);
	}

}
