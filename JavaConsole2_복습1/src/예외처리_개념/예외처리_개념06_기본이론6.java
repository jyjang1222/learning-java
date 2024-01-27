package 예외처리_개념;
//일반적으로 메서드 안에는 전부 try catch를 작성
class Test {
	// 예외처리하는 방법 2가지 (첫번째 방법 많이 사용함)
	// (1) try {} 안에  식을 적는다.
	void sample1() {
		try {
			int a = 10 / 0;
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	// (2) 메서드 이름 옆에 throws Exception 을 적는다.
	//     조건) 대신, 메서드 호출할때 try{}로 감싸줘야한다. 
	void sample2() throws Exception { //호출시 무조건 예외(Exception) 발생
		int a = 10 / 0;
	}
}

public class 예외처리_개념06_기본이론6 {

	public static void main(String[] args) {
		Test t = new Test();
		
		t.sample1();
		System.out.println("test");
		
//		t.sample2(); 오류발생
		try {
			t.sample2();
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("test2");
		
	}

}
