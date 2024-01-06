package 예외처리_개념;

public class 예외처리_개념01_기본이론1 {
	public static void main(String[] args) {
		int x = 10;
		int y = 0;
		// java.lang.ArithmeticException: / by zero
		
//		if(y == 0) {
//			System.out.println("0으로 나눌 수 없습니다.");
//		} else {
//			System.out.println(x / y);
//		}
		
		// 에러의 종류가 너무 많기 때문에 
		// 모든 에러를 다 잡아주는  Exception을 보통 사용한다. 	
		try {
			// 에러가 발생할 코드 작성
			System.out.println(x / y);
		} catch(Exception e) {
			// try영역에서 에러가 발생하면 실행할 영역
			System.out.println("오류 발생!!!");
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료"); // 중간에 오류가 발생해도 끝까지 실행
	}
}
