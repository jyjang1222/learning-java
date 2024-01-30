package 캡슐화_개념;
/*
접근제어자
1. public 프로젝트내 모든 클래스 사용가능
2. protected 같은패키지이거나 자식클래스만 public, 패키지다르면 private
3. default 같은패키지 public, 다른패키지면 private
4. private 내부클래스에서만 사용가능
*/
public class 접근제어자_개념02_기본이론2 {

	public static void main(String[] args) {
		접근제어자_개념01_기본이론1 t = new 접근제어자_개념01_기본이론1();
		t.a = 10;
		t.b = 20;
		t.c = 30;
//		t.d = 40;
	}

}
