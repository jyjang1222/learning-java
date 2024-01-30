package 추상화_개념;

import java.util.Scanner;

abstract class Shape {
	public abstract void draw();
}

//	Shape 클래스를 상속받아 Point 클래스를 만든다.
class Point extends Shape {
	@Override
	public void draw() {
		System.out.println("점을 찍는다.");
	}
}

//	Shape 클래스를 상속받아 Line 클래스를 만든다.
class Line extends Shape {
	@Override
	public void draw() {
		System.out.println("선을 그린다.");
	}
}

//	Shape 클래스를 상속받아 Circle 클래스를 만든다.
class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("원을 그린다.");
	}
}

//	Shape 클래스를 상속받아 Rect 클래스를 만든다.
class Rect extends Shape {
	@Override
	public void draw() {
		System.out.println("사각형을 그린다.");
	}
}

//	Shape 클래스를 상속받아 TriAngle 클래스를 만든다.
class TriAngle extends Shape {
	@Override
	public void draw() {
		System.out.println("삼각형을 그린다.");
	}
}

public class 추상화_개념06_다형성그리기 {
	public static void main(String[] args) {
		// === 다형성 === 
		// 서로 다른클래스는 배열에 저장불가능하기때문에
		// 공통부모를 상속받고
		// 부모의 클래스로 배열을 만들면 한배열에 서로다른클래스들을 저장할수있다.
		Shape[] shapes = {new Point(), new Line(), new Circle(), new Rect(), new TriAngle()};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 작업을 선택하세요 : ");
		int menu = sc.nextInt();
		
		shapes[menu - 1].draw();

	}
}