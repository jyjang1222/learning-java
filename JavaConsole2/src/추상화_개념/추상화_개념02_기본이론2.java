package 추상화_개념;

/*
* # 추상화(abstract) // 이름만 만들어놓기 (내용은 x)
	 부모클래스에서는 메서드 이름만 만들고 
	 구체적인 내용은 자식메서드에서 구현하도록 하는 것 
	  - 활용법은 웹에 가서 실습할예정 
	 
    1) 부모클래스 앞에 abstract 를 붙여준다.
    2) 자식클래스에서 구현시킬 메서드명 앞에 abstract 를 붙여준다.
    3) 원래메서드는{} 를 사용하여 내용을 구현하는데  {}를 생략하고 ; 을 붙여준다. 
*/

//1) 클래스 앞에 abstract를 붙여줌
abstract class A {
	// 2) 메서드 앞에 abstract를 붙여줌
	abstract void test();  //구현을 하지않는다는 표현으로 {}를 없애고 ';' 을 붙임 
	
	void test2() {} // abstract 가 붙지않은 메서드도 만들수있다. 
}

//3) 클래스 A를 상속받자마자 오류가 발생함
class B extends A {
	// 4) 강제로 만들어야하는 메서드
	void test() {
		
	}
}
public class 추상화_개념02_기본이론2 {
	public static void main(String[] args) {
		
	}
}