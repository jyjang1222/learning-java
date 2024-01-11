package 스태틱_개념;

class Test01 {
	
	// 클래스영역의 변수의 종류 (클래스영역 = 메서드 밖의 영역)
	public int a;				// non-static 변수 = 인스턴스 변수 (new할시 초기화)
	public static int b;		// static 변수	  = 클래스 변수 (0으로 초기화)
	
	static void test() {
		System.out.println("!!");
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
	
		Test01.b = 10; // 클래스 변수는 static 메모리 영역에 변수가 할당이 돼있어서 값 변경 가능
		System.out.println(Test01.b);
		System.out.println("-------------------------------------");
		// static으로 생성된 변수는 new 를 할때 새로 생성되지않는다. 
		
		Test01 t1 = new Test01();
		t1.a = 20; // 인스턴스변수는 new키워드를 사용해 stack에 올라가야 값 변경 가능
		System.out.println(t1.a);
		System.out.println(t1.b); // 같은결과가나온다. Test01.b 와 같다.
		// t1.b는 문법적으로 허용은 하지만 Test01.b로 접근을 권장
		System.out.println("-------------------------------------");
		Test01 t2 = new Test01();
		t2.a = 30;
		System.out.println(t2.a);
		System.out.println(t2.b); // 위와 같다.
	}

}

// 스태틱1_개념01_기본이론1.main(null);
