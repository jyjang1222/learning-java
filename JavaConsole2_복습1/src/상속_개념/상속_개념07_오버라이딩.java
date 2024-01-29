package 상속_개념;

class MethodOverriding {
	void test() {
		System.out.println("testParent");
	}
	void overridTest() {
		System.out.println("overridTestParent");
	}
}

class Child extends MethodOverriding {
	void overridTest() {
		System.out.println("overridTestChild");
	}
}

public class 상속_개념07_오버라이딩 {

	public static void main(String[] args) {
		// 1)메서드 오버로딩 		
		// 메서드 오버로딩은 같은 이름의 메서드를 사용할 수 있는 기능이다. 
		
		// 2)메서드 오버라이딩 (*상속 관계에서 적용) = 메서드 재정의
		// 메서드 오버라이딩은 부모 클래스에 있는 메서드를 
		// 자식 클래스가 같은 이름으로 메서드를 만들어서 사용하는 것이다.
		Child c = new Child();
		c.test();
		c.overridTest();
	}

}
