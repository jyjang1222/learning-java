package 변수_개념;

public class 변수1_개념07_자료형변환 {

	public static void main(String[] args) {
		// 1. 자동 형변환
		// 만약에 실수 + 정수를 하면 내부적으로 정수를 실수로 자동 형변환을 한다.
		// 예) 10 + 3.0 => 10.0 + 3.0
		System.out.println("[자동 형변환]");
		System.out.println(10 + 3);
		System.out.println(10 + 3.0);
		
		// 2. 강제 형변환
		// 자료형이 다른 변수끼리 연산이 필요할 때는 강제로 형변환을 해야 한다.
		// 방법) (형변환타입)변수
		System.out.println("[강제 형변환]");
		int x = 10;
		int y = 3;
		
		double result1 = x / y;
		double result2 = (double)x / y;
		System.out.println(result1);
		System.out.println(result2);
	}

}
