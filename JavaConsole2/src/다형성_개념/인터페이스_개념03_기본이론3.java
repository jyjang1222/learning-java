package 다형성_개념;

import java.util.Scanner;

interface Shape2 {
	public void draw();
}

//Shape 클래스를 상속받아 Point 클래스를 만든다.
class Point2 implements Shape2 {
@Override
public void draw() {
	System.out.println("점을 찍는다.");
}
}

//Shape 클래스를 상속받아 Line 클래스를 만든다.
class Line2 implements Shape2 {
@Override
public void draw() {
	System.out.println("선을 그린다.");
}
}

//Shape 클래스를 상속받아 Circle 클래스를 만든다.
class Circle2 implements Shape2 {
@Override
public void draw() {
	System.out.println("원을 그린다.");
}
}

//Shape 클래스를 상속받아 Rect 클래스를 만든다.
class Rect2 implements Shape2 {
@Override
public void draw() {
	System.out.println("사각형을 그린다.");
}
}

//Shape 클래스를 상속받아 TriAngle 클래스를 만든다.
class TriAngle2 implements Shape2 {
@Override
public void draw() {
	System.out.println("삼각형을 그린다.");
}
}

public class 인터페이스_개념03_기본이론3 {

	public static void main(String[] args) {
		// === 다형성 === 
		// 서로 다른 클래스는 배열에 저장불가능하기때문에
		// 공통부모를 상속받고
		// 부모의 클래스로 배열을 만들면 한배열에 서로다른클래스들을 저장할수있다.
		/*
		 * # 다형성
		 * 1. 서로 다른 클래스는 배열에 저장이 불가능하기 때문에
		 * 2. 공통 부모를 상속받아
		 * 3. 부모 클래스로 배열을 만들면 한 배열에 서로 다른 클래스들을 저장할 수 있다.
		 */
		// 다형성이란, 여러 타입의 클래스 자료형을 부모클래스 이름으로 통합해서 배열에 저장할 수 있다.
		Shape2[] shapes = {new Point2(), new Line2(), new Circle2(), new Rect2(), new TriAngle2()};
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 작업을 선택하세요 : ");
		int menu = sc.nextInt();
		
		shapes[menu - 1].draw();
	}

}
