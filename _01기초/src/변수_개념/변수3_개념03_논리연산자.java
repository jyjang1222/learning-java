package 변수_개념;
/*
# 논리 연산자
	1. 종류
		1) && (and) : 양쪽 모두 참이어야 참
		2) || (or)  : 양쪽 중 어느 한쪽이라도 참이면 참
				      ||의 키보드 위치는 쉬프트 + 한글 원(돈) 표시이다.
		3) !  (not) : 참이면 거짓으로 변환, 거짓이면 참으로 변환 (추후 사용된다)

	2. 역할
		1) 논리 연산자를 통해 여러개의 비교 연산자를 연결할 수 있다.
		2) 논리 연산자를 통해 범위 설정이 가능하다.
*/
public class 변수3_개념03_논리연산자 {

	public static void main(String[] args) {
		System.out.println(10 == 10 && 3 == 3);
		System.out.println(10 != 10 && 3 == 3);
		System.out.println(10 == 10 && 3 != 3);
		System.out.println(10 != 10 && 3 != 3);
		
		System.out.println("--------------------");
		
		int a = 10;
		int b = 3;
		
		System.out.println(a == a || b == b);
		System.out.println(a != a || b == b);
		System.out.println(a == a || b != b);
		System.out.println(a != a || b != b);
        
		System.out.println("--------------------");
		
		System.out.println(!true);
		System.out.println(!false);
	}

}
