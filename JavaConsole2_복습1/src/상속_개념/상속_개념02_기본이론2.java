package 상속_개념;

class A1  {
	int a;
	int b;
}

class B1 {
	A1 A = new A1();
	int c;
	int d;
}

class C1 extends A1 {
	int e;
	int f;
}
/*
 * 상속 : 자식클래스 extends(키워드) 부모클래스 {}
 * 상속을 받게되면 마치 자기클래스안의 변수처럼 자유롭게 사용할수있다. 
 * 상속은 한번만 받을수있다. 
 */
public class 상속_개념02_기본이론2 {

	public static void main(String[] args) {
		A1 A = new A1();
		B1 B = new B1();
		B.A.a = 10;
		
		C1 C = new C1();
		C.b = 10;
	}

}
