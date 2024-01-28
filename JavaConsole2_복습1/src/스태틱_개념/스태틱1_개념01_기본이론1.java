package 스태틱_개념;

class Test01 {
	private int a;				// non-static 변수 = 인스턴스 변수 (new할시 초기화)
	public static int b;		// static 변수	  = 클래스 변수 (0으로 초기화)
//	private static int c;
//	private static 변수나 private method의 경우 필요한지 궁금
//  https://wooooooak.github.io/java/2019/01/06/private_static%EC%9D%B4_%ED%95%84%EC%9A%94%ED%95%9C_%EA%B2%BD%EC%9A%B0/
	
	static void test() {
		System.out.println("!!");
	}
	public void setA(int a) {
		this.a = a;
	}
}

public class 스태틱1_개념01_기본이론1 {

	public static void main(String[] args) {
		// static 키워드 
		// static키워드가 붙은 변수와 메서드는 실행하자마자 바로 static 메모리영역에 할당이 돼서 
	    // new 를 하지 않아도 사용할 수 있다.
		// 스태틱 메서드는 호출시에 stack에 올라감
		
		// static으로 생성한 변수에 접근하는법
        // 클래스명.변수명  ==> Test01.b
		Test01.b = 10;
		Test01.test();
		Test01 t1 = new Test01();
		t1.setA(20); // 인스턴스변수는 new키워드를 사용해 stack에 올라가야 값 변경 가능
		t1.test(); // 문법적으로 허용은 하지만 Test01.test()로 접근을 권장
	}

}
