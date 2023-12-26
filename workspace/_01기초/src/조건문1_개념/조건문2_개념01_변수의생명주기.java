package 조건문1_개념;
/*
# 변수의 생명주기(scope)
- 변수는 선언 당시의 {}중괄호 안에서만 사용 가능하다.
  } 닫힌 중괄호를 만날 때 소멸한다. 
*/
public class 조건문2_개념01_변수의생명주기 {
	public static void main(String[] args) {
		// 지역 변수(local variable)
		int x = 10;
		
		if(true) {
			int y = 20;
			System.out.println("x = " + x);
			System.out.println("y = " + y);
		}// 변수 y가 소멸하는 시기
		
		// 변수 x는 사용 가능하지만 y는 사용할 수 없다.
		System.out.println("x = " + x);
		// System.out.println("y = " + y);
	}// 변수 x가 소멸하는 시기
}
