package 상속_개념;

class Test05_1 {}
class Test05_2 /*extends Object*/ {
	int a;
	int b;
	
	// @(어노테이션) 키워드
	// 기능을 가진 주석
	
	// @Override
	// 작성시 부모의 선언부와 동일하게 작성해야 문법 오류가 나지 않는다.
	// 생략가능하지만 작성함으로써 엄격함 유지
	
	@Override
	public String toString() {
		return a + ", " + b;
	}
}

public class 상속_개념08_toString1 {

	public static void main(String[] args) {
		Test05_1 t1 = new Test05_1();
		System.out.println(t1);
		System.out.println(t1.toString());
		
		// 부모 Object 클래스에 있는 toString() 메서드를 
		// 자식이 재활용해서 사용할수있다.
		Test05_2 t2 = new Test05_2();
		System.out.println(t2);
		System.out.println(t2.toString()); 
	}

}
