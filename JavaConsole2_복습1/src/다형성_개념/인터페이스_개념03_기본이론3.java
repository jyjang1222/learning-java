package 다형성_개념;

import java.util.Scanner;

interface Shape2 {
	public void draw();
}
class Point2 implements Shape2 {
	@Override
	public void draw() {
		System.out.println("점을 찍는다.");
	}
}
class Line2 implements Shape2 {
	@Override
	public void draw() {
		System.out.println("선을 그린다.");
	}
}

public class 인터페이스_개념03_기본이론3 {

	public static void main(String[] args) {
		// === 다형성 === 
		// 서로 다른 클래스는 배열에 저장불가능하기때문에
		// 공통부모를 상속받고
		// 부모의 클래스로 배열을 만들면 한배열에 서로다른클래스들을 저장할수있다.
		Shape2[] shapeList = {new Point2(), new Line2()};
	}

}
