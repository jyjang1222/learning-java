package 추상화_개념;

class Parent {
	public int a;
}

class Child extends Parent {
	public int b;
}

public class 추상화_개념05_형변환2 {

	public static void main(String[] args) {
		Parent p1 = new Parent();
		Parent p2 = new Child();
		
		Child c1 = new Child();
		Parent p3 = (Parent)c1;
		
		// instanceof 키워드를 사용하면 좀더 확실히 예외처리 할수있다.
		
		if (p1 instanceof Child) {
			Child ch = (Child)p1;
			System.out.println("형변환 성공1");
		} else {
			System.out.println("형변환 불가1");
		}
		
		if (p2 instanceof Child) {
			Child ch = (Child)p2;
			System.out.println("형변환 성공2");
		} else {
			System.out.println("형변환 불가2");
		}
		
	}

}
