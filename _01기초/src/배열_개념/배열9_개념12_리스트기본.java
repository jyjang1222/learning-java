package 배열_개념;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
/*
	# 어레이리스트 	 			 	
 	[1] 기본 배열은 max 값을 정해놓고 그이상은 저장할수가 없었다. 
 	[2] 어레이리스트는 가변배열로 무한대로 저장이 가능하다. 
	
	# 사용법 
 	[1-1] 랜덤과 마찬가지로 임포트 해야한다. 
 	[1-2] import java.util.ArrayList;
 	
 	[2-1] 변수 선언의 모습이 특이하다. <> 를 이용한다. 
 	[2-2] ArrayList<String> list = new ArrayList<String>();
*/
public class 배열9_개념12_리스트기본 {

	public static void main(String[] args) {
		int[] arr = new int[3];
		System.out.println(Arrays.toString(arr));
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		// 1. 값 추가하기 : add()
		list.add(10);
		list.add(20);
		
		// 2. 출력
		System.out.println(list);
		
		// 3. 길이 : size()
		System.out.println(list.size());
		
		// 4. 값 추출 : get(index)
		System.out.println(list.get(0));
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// 5. 값 수정 : set(인덱스, 변경할 값)
		list.set(1, 30);
		System.out.println(list.get(1));
		
		// 6. 값 삭제 : remove(인덱스)
		list.remove(1);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
