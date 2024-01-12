package 상속_개념01_기본이론1;

class AAAAA {
	String x;
	String y;
}

class BBBBB {
	AAAAA a = new AAAAA();
}

class CCCCC {
	BBBBB b = new BBBBB();
}

class DDDDD {
	CCCCC c = new CCCCC();
}

class EE{
	int x;
	int y;
}

// 상속문법
// FF:자손클래스 EE:부모클래스
class FF extends EE {}
class GG extends FF {}
class KK extends GG {}

public class 상속_개념01_기본이론1 {

	public static void main(String[] args) {

		DDDDD d = new DDDDD();
		d.c.b.a.x = "10"; // 상속 문법을 쓰지않고 접근한 표현식
		
		KK k = new KK();
		k.x = 10;
	}

}
