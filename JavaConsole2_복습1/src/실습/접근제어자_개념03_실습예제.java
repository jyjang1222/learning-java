package 실습;

import 캡슐화_개념.접근제어자_개념01_기본이론1;

class Child extends 접근제어자_개념01_기본이론1 {
	Child() {
		a = 10;
		b = 20; // protected 자식클래스내에서만 public
//		c = 30; default
//		d = 40; private
	}
}

public class 접근제어자_개념03_실습예제 {

	public static void main(String[] args) {
		접근제어자_개념01_기본이론1 t = new 접근제어자_개념01_기본이론1();
//		t.b = 20; protected

	}

}
