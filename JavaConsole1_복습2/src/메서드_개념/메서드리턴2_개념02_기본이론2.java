package 메서드_개념;

class TestReturn {
	int plus(int a, int b) {
		return a + b;
	}
}

public class 메서드리턴2_개념02_기본이론2 {

	public static void main(String[] args) {
		TestReturn test1 = new TestReturn();
		System.out.println(test1.plus(2, 3));
	}

}
