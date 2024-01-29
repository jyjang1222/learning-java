package 상속_개념;

class Super1 {
	int s;
}
class Child1 extends Super1 {
	int a;
	
	Child1 (int s, int a) {
		this.s = s;
		this.a = a;
	}
	
	void test (int a, int s) {
		this.a = 10; //클래스영역에 있는 인스턴스 변수 사용시 this키워드
		a = 10;
		s = 10;
		super.s = 20; //부모클래스에 있는 인스턴스 변수 사용시 super키워드
		System.out.println("부모메서드");
	}
}
class Child2 extends Child1 {
	int c;
	
	Child2 (int s, int a, int c) {
		super(s, a);  // 부모의 생성자호출하는법 ()만붙여주면된다.
		this.c = c;
	}
	
	void test() {
		System.out.println("자식메서드");
	}
	void play() {
		test(); // 자식의 test()를 실행함.
		super.test(20, 20); // 부모의 test()를 실행함.
	}
	
	@Override
	public String toString() {
		return s + ", " + a + ", " + c;
	}
}

public class 상속_개념09_super1 {
	public static void main(String[] args) {
		Child2 test = new Child2(10, 20, 30);
		test.play();
		System.out.println(test.toString());
	}
}
