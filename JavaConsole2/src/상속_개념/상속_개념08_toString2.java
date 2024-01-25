package 상속_개념;

//class Object {
//	public String toString() {
//		return "주소";
//	}
//}

// 클래스의 최상위 부모는 Object

//class TestAA {}

class TestAA /* extends Object */{
	@Override
	public String toString()		// 선언부
	{
		// 구현부
		return "재정의";
	}
}

public class 상속_개념08_toString2 {

	public static void main(String[] args) {
		// 메서드 오버로드(overload)
		// 메서드를 같은 이름으로 만들어도 전달되는 값이 다르면 서로 다른 메서드로 인식하는 것
		// 메서드 오버라이드(override)
		// 부모클래스의 메서드를 자식클래스가 같은 이름의 메서드로 재정의하는 것
		
		TestAA a = new TestAA();
		
		System.out.println(a.toString()); // 메모리주소출력
		
		System.out.println(a); // toString() 은 생략가능 
	}

}
