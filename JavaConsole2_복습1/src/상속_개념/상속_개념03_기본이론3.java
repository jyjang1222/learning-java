package 상속_개념;

class A {
	int aa;
}

class B extends A {
	int bb;
}

class C {
	A a = new A();
	int cc;
}

public class 상속_개념03_기본이론3 {

	public static void main(String[] args) {
		B b = new B(); // B는 A를 상속받았으므로  부모변수와 본인변수 aa , bb 둘다 사용가능
		b.aa = 100;
		b.bb = 200;
		
		// 상속받지않고 상속같은 관계만들기
		// C는 A를 상속받지않았지만 내부에 변수를 따로 만들어서 상속받은것과 같은상황이나
		// .을 2번 찍어야한다.
		C c = new C();
		c.a.aa = 100;
		c.cc = 200;
	}

}
