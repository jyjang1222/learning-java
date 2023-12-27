package 조건문1_개념;
/*
조건문의 범위에 해당하는 {} 중괄호를 생략할 수도 있다.
단, 1줄만 허용되며 정확한 코딩 습관을 위해 사용하지 않는 것이 좋다.
*/
public class 조건문3_개념02_중괄호생략 {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		
		if(a == b) {
			System.out.println("실행O -(1)");
		}
		if(a == b)
			System.out.println("실행O -(2)");
		
		System.out.println("-------------");
		
		if(a != b) {
			System.out.println("실행X -(1)");
			System.out.println("실행X -(2)");
		}
		
		if(a != b)
			System.out.println("실행X -(3)");
			System.out.println("실행O -(4)");	// 한 줄만 적용되므로 출력된다.
	}

}
