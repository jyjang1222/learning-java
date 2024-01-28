package 캡슐화_개념;

class Test01 {
	// 접근제어자란 클래스, 변수, 메서드를 외부의 사용자가 접근할 때 제한을 두겠다는 의미
	// 접근제어자 : public(공공의), protected(추후 설명), default(접근제어자가 없는 상태), private(개인의)
	// (접근 가능 범위가 넓은 순)
	private int a;
	private int b;
	
	// 접근제어가 없는 것을 default 라고 부른다.
	// 지금까지는 접근제어자를 사용하지 않았지만, 정확하게 명시해주는 것이 좋다.
	// 이제부터 아무것도 안적는것은 권장하지않는다.
	int c;
	
	// public은 어느 클래스에서도 접근가능한 것
	// public을 사용하면 다른 패키지일지라도 클래스를 사용가능
	public int d;
	
	// 일반적으로 변수를 선언할 때에는 변수에는 private을 작성하고
	// 메서드에는 public 키워드를 작성한다
}

public class 캡슐화_개념01_기본이론1 {

	public static void main(String[] args) {
		Test01 t = new Test01();
		// 1. private을 붙인 변수는 클래스 내부에서만 사용이 가능하다.
		// 2. 다른 클래스에서는 사용할 수 없다.
		// The field Test01.a is not visible (field는 변수)
		// t.a = 10;	// 에러
		// t.b = 20;	// 에러
		
		t.c = 30;
		t.d = 40;
	}

}
