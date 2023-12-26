package 변수1_개념;

public class 변수1_개념06_변수의크기와종류 {
	public static void main(String[] args) {
		// 1. 정수 : int, long
		System.out.println("[정수]");
		
		// int는 -21억에서 21억의 값만 저장 가능하다.
		// 더 큰 값을 저장하고 싶으면 long을 사용한다.
		// int a = 3000000000;	(주석을 풀면 에러발생)
		
		// long을 사용할 때는 long의 약자인 L을 숫자 뒤에 붙여준다. (int와 구분하기 위함)
		long b = 3000000000L;
		System.out.println(b);
		
		
		// 2. 실수 : float(작은 실수), double(큰 실수)
		System.out.println("[실수]");
		
		// 소수점은 최대한 정확히 표현하는 것이 좋기 때문에
		// float 보단 double을 사용한다.
		float c = 1.1234567891234F;		// float도 double과 구분을 위해 F를 붙여준다.
		double d = 1.1234567891234;		// double도 한계가 있지만 float 보단 큰 수를 저장할 수 있다.
		System.out.println(c);
		System.out.println(d);
	}
}
