package 메서드_개념;

class Test {
	// 클래스 영역 = 메서드 밖 영역
	// 영상에서 클래스 변수라고 설명했으나,
  // 정확한 명칭은 인스턴스 변수(파란색)
	// 클래스 변수는 값이 자동 초기화
	// int(0), double(0.0), String클래스(null), 배열(null)
	int x;
	int y;
	
	void print() {
		// 메서드 안 영역
		// 지역 변수(노란색)
		// 지역 변수는 값의 자동 초기화가 X
		// 반드시 선언과 동시에 값을 초기화해줄 것을 권장
		int result = x + y;
		System.out.println(result);
		System.out.println(x);
	}
	
	// 클래스 영역 = 메서드 밖 영역
}

public class 메서드1_개념09_변수 {

	public static void main(String[] args) {
		Test t = new Test();
		t.x = 10;
		t.y = 20;
		t.print();
	}

}
