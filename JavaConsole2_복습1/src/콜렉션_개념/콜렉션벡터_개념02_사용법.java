package 콜렉션_개념;

import java.util.Vector;
/*
# 배열의 한계
	. 배열은 한번 선언하면 프로그램에서 그 크기를 바꿀 수 없다.
	. 가변배열을 직접 만들어서 사용했지만,
	  자바에서는 Vector 클래스를 통해 가변배열을 제공한다.
# 특징
	. 특이하게 <>꺽쇠를 사용하는데 이를 제네릭(generic)이라고 부른다.
	. 저장할 수 있는 데이터의 타입은 *클래스 타입* 만 가능하다.
	. int, double 이와 같은 기본 자료형을 저장할 수 없기 때문에
	  Integer, Double 과 같은 래퍼 클래스를 이용해야 한다.
# 선언하는 방법
	Vector<Integer> vector = new Vector<Integer>();
	
# 주요 기능
	1. 추가 		: add
	2. 삭제 		: remove
	3. 전부 삭제 	: clear
	4. 개수		: size
	5. 값 읽기	: get (* 배열의 []에 해당)
	6. 값 수정	: set
*/

public class 콜렉션벡터_개념02_사용법 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(100);
		System.out.println(v); // [100]
		System.out.println(v.get(0)); //100
		v.set(0, 200);
		v.size(); // 1
		v.remove(0);
		v.clear();
	}

}
