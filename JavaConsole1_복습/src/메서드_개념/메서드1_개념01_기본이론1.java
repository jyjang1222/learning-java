package 메서드_개념;
/*
# 메서드 기본구조
(1) 정의
	1) void			: 키워드
	2) testPrint()	: 이름
	3) { 기능 }		: 실행되는 영역
(2) 사용법
	1) t1.testPrint();
	2) t1				: 클래스 변수명
	3) .testPrint()		: .메서드명();
*/
class Test01 {
	int x;
	void testPrint() {
		System.out.println("print");
//		return;
	}
}
public class 메서드1_개념01_기본이론1 {
	public static void main(String[] args) {
		Test01 test = new Test01();
		test.x = 10;
		test.testPrint();
	}
}
