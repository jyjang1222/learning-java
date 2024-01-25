package 상속_개념;

class Super1{
	int s;
}

class Child1 extends Super1 {
	int a;
	
	void test (int a, int s) {
		this.a = 10; //클래스영역에 있는 인스턴스 변수 사용시 this키워드
		a = 10;
		s = 10;
		super.s = 20; //부모클래스에 있는 인스턴스 변수 사용시 super키워드
	}
}

public class 상속_개념09_super1 {

	public static void main(String[] args) {

	}

}
