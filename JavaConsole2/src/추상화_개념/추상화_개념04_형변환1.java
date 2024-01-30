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
		
//		a	=	a, b
		Parent1 p2 = new Child1(); // 부모타입으로 자식 인스턴스 생성.
//      p2.a 실제 인스턴스는 자식이라 인스턴스변수 a,b가 생성되며, a는 부모자식 모두 가지고있기 떄문에 접근가능.
//		p2.b 타입이 부모이기 때문에 자식이 가진 인스턴스 변수b 에는 접근불가
		
		Child1 c2 = (Child1)p2;
//		c2.b 타입을 다시 자식으로 바꾸어주면 b접근가능
		
//		a, b	=	a (멤버b는 비게돼서 생성불가)
//		Child1 c3 = new Parent1(); // 자식타입으로 부모 인스턴스 생성. 당연히 안된다. 
//      부모클래스에는 인스턴스 변수 b가 없기 때문에 자식타입으로 부모인스턴스 선언 불가
//		자식 타입으로 생성하려고 하는데 부모 생성자를 사용하면 해당 자식 타입에 선언된 멤버b는 비게됨
	}
}
