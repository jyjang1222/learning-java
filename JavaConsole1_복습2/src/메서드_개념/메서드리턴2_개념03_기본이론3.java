package 메서드_개념;

class TestReturn2 {
	int num;
	
	void setNum(int num) {
		this.num = num;
	}
	int getNum() {
		return num;
	}
}
class TestPattern {
	String name;
	
	void setName(String name) {
		this.name = name;
	}
	String getName() {
		return name;
	}
}

public class 메서드리턴2_개념03_기본이론3 {
	public static void main(String[] args) {
		TestReturn2 test1 = new TestReturn2();
		test1.setNum(1);
		int num1 = test1.getNum();
		System.out.println(num1);
		
		TestPattern test2 = new TestPattern();
		test2.setName("jun");
		String name1 = test2.getName();
		System.out.println(name1);
	}
}
