package 상속_개념;

class AAA {
	String x;
	String y;
}

class BBB {
	AAA a = new AAA();
}

class CCC {
	BBB b = new BBB();
}

class DDD {
	CCC c = new CCC();
}

class EE {
	int x;
	int y;
}

//상속문법
//FF:자식클래스 EE:부모클래스
class FF extends EE {}
class GG extends FF {}
class HH extends GG {}

public class 상속_개념01_기본이론1 {

	public static void main(String[] args) {
		DDD d = new DDD();
		d.c.b.a.x = "10"; // 상속 문법을 쓰지않고 접근한 표현식
		
		HH h = new HH();
		h.x = 10;
	}

}
