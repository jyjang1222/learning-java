package 메서드_개념;

class Test05 {
	void setValue(int a) {
		System.out.println(a);
		a = 100;
		System.out.println(a);
	}
}

public class 메서드1_개념05_기본이론5 {

	public static void main(String[] args) {
		int a = 5;
		Test05 test = new Test05();
		
		test.setValue(a);
		System.out.println(a);
	}

}
