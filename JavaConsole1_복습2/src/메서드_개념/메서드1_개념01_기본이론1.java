package 메서드_개념;

class Test01 {
	int x;
	void testPrint() {
		System.out.println("print");
	}
}

public class 메서드1_개념01_기본이론1 {

	public static void main(String[] args) {
		Test01 test = new Test01();
		test.x = 10;
		test.testPrint();
	}

}
