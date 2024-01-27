package 메서드_개념;

class Test03 {
	int num1;
	int num2;
	
	void setNums(int a, int b) {
		this.num1 = a;
		this.num2 = b;
	}
	void printNums() {
		System.out.println(this.num1 + this.num2);
	}
}

public class 메서드1_개념03_기본이론3 {
	public static void main(String[] args) {
		Test03 test1 = new Test03();
		test1.setNums(1, 2);
		test1.printNums();
	}
}
