package 생성자_개념;

/*
 * # 생성자(constructor)
 * 1. 생성자는 반드시 클래스 이름과 같아야 한다.
 * 2. 생성자는 new 클래스명(); 이때 호출된다.
 * 3. 생성자는 인스턴스 변수를 초기화 시킬 목적으로 사용한다.
 * 4. 생성자를 정의하지 않으면, 자바 컴파일러가 자동으로 기본 생성자를 만든다.
 * 5. 기본생성자란, 매개변수에 아무것도 없는 생성자를 의미한다.
 * 6. 생성자는 리턴타입을 가지지 않고 return도 사용하지 않는다.(메서드와의 차이점)
 * 7. 생성자를 재정의하면 기본 생성자는 자동으로 만들어지지 않는다. 
*/

class Test01 {
	int a;	// 인스턴스 변수
	int b;
	int c;
	
	void init() {
		a = 10;
		b = 20;
		c = 30;
		System.out.println("init()");
	}
	
//	Test01() {
//		a = 10;
//		b = 20;
//		c = 30;
//		System.out.println("생성자 호출");
//	}
	
	Test01(int a , int b , int c){
		this.a = a;
		this.b = b;
		this.c = c;
		System.out.println("생성자 오버로드");
	}
	Test01(){}
	
}

public class 생성자_개념02_기본이론2 {

	public static void main(String[] args) {
		// 이때 기본 생성자가 실행된다.
		Test01 t1 = new Test01();
		// 생성자는 기본 값을 저장하고 싶을 때 사용한다.(특별히 필요하지는 않다.)
		Test01 t2 = new Test01(10,20,30);
	}

}
