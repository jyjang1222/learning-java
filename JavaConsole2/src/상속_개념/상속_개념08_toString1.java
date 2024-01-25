package 상속_개념;

class Test05_1{	}

class Test05_2 /*extends Object*/ {	
	
	int a;
	int b;
	
	// @(어노테이션) 키워드
	// 기능을 가진 주석
	
	// @Override (기능을 가진 주석)
	// 작성시 부모의 선언부와 동일하게 작성해야 문법 오류가 나지 않는다.
	// 생략가능하지만 작성함으로써 엄격함 유지
	
	@Override
	public String toString()
	{
		return a + ", " + b;
	}
	
	// 기존 출력법
	public void print() {
		System.out.println(a + " , " + b);
	}
	
//	부모에 없는 메소드 위에 붙여보면 에러가난다.
//	@Override 
//	void test() {}
	
}

public class 상속_개념08_toString1 {

	public static void main(String[] args) {
		//[오버라이드]		
		// 클래스 객체의 변수를 출력 하면 주소가 출력된다.
		// 원형은 변수.toString() 이지만 
		// 변수만 쓸수있게 축약형을 제공한것이다.
		
		// toString() 은  Object 클래스에서 제공하는 함수로,
		// 주소를 출력해준다. 
		Test05_1 t1 = new Test05_1();		
		System.out.println(t1);
		System.out.println(t1.toString());
		// t1.toString()시 t1인스턴스 주소가 출력됨.
		// 주소를 출력하는 toString메서드를 재활용하여 사용하면 편리
				
		System.out.println("--------------------");
				
		// 부모 Object 클래스에 있는 toString() 메서드를 
		// 자식이 재활용해서 사용할수있다.
		Test05_2 t2 = new Test05_2();		
		System.out.println(t2);
		System.out.println(t2.toString());
	}

}
