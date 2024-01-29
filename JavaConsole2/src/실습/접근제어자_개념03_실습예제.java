package 실습;

import 캡슐화_개념.접근제어자_개념01_기본이론1;

//a 는 private 이므로 사용불가
//b 는 public 이므로 어느클래스에서나 사용가능
//c 는 protected 이므로 자식클래스인 Test클래스 내부에서만 사용가능 
//d 는 default 는 패키지가 달라지면 private 이므로 사용불가 (사용하지않는것이 좋다)

class L2_Child extends 접근제어자_개념01_기본이론1 {
	public L2_Child() {
		//a = 10; //private이라 접근 불가
		b = 20; //public
		c = 30; //protected 서로다른 패키지이지만 상속받은 자식클래스 내에서는 public
		//d = 40; //default라 private
	}
}

public class 접근제어자_개념03_실습예제 {

	public static void main(String[] args) {
		L2_Child child1 = new L2_Child();
		child1.b = 10;
//		child1.c = 20; 접근불가
	}

}
