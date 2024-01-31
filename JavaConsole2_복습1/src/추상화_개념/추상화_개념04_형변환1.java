package 추상화_개념;

class Parent1 {
	int a;
}
class Child1 extends Parent1 {
	int b;
}

public class 추상화_개념04_형변환1 {

	public static void main(String[] args) {
		Parent1 p = new Parent1();
		Child1 c = new Child1();
		
		Parent1 p2 = new Child1();
		p2.a = 10;
		
//		Child1 c2 = new Parent1();
	}

}
