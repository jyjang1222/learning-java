package 인터페이스_개념;

abstract class AA {
	public abstract void test1(); 	// 추상화 클래스는 abstract 를 붙인것과 
	public void test2() {}		 	// 안붙인 메서드를 섞어서 만들수있다.
}
class BB extends AA {
	public void test1() {}	  		// 자식클래스에서는 abstract 가붙어있는 메서드만은  강제구현해야한다.
}

interface EE {
	public void test3();
}
interface CC {
	public void test1();
	public void test2();
}
class DD implements CC, EE { 	// interface 는 다중상속이 된다. 
	public void test1() {}  	// interface 를 상속하면 메서드를 무조건 강제구현한다.
	public void test2() {}
	public void test3() {}
}

// 인터페이스(Interface) 클래스
// 1. 부모 클래스앞에 interface 를 붙인다.
// 2. interface 상속은 extends 대신 implements 를 붙인다. 
// 3. interface 는 다중상속이 가능하여, 여러 interface를 상속할 수 있다.
// 4. 추후에 웹에서 실습한다. 

// 인터페이스는 추상클래스보다 더 추상화된 클래스 (전부 강제)
// 1. 실제 구현된 것이 전혀없는 기본 설계도.
// 2. 상수와 추상 메서드만 멤버로 갖는다.
// 3. 인스턴스를 생성할 수 없고, 클래스 작성에 도움을 줄목적으로 사용되는 클래스
// 4. 다중상속이 가능하다.

public class 인터페이스_개념02_기본이론2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
