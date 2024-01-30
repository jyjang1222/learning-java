package 캡슐화_개념;

/*
접근제어자 종류
1. public : 프로젝트내 모든 클래스에서 사용가능
2. protected : 패키지가 같거나 자식클래스에서만 public 다르면 private
3. default : 패키지 같으면 public 다르면 private
4. private : 내부 클래스에서만 사용가능
*/

public class 접근제어자_개념01_기본이론1 {
	public int a;
	protected int b;
	int c;
	private int d;
}
