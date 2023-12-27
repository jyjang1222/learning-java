package 반복문_개념;
/*
# 반복문 for
1. 반복문의 조건 3가지
	1) 초기식
	2) 조건식
	3) 증감식
2. for문의 구조
	for(초기식 ;  조건식 ; 증감식){
		조건식이 참(true)일 동안 실행할 문장;
	}
3. for문의 실행순서
	초기식 → 조건식 → 실행문 → 증감식 → 조건식 → 실행문 → 증감식 .... 
*/
public class 반복문4_개념01_for문 {

	public static void main(String[] args) {
		// 예) 1 ~ 5까지 출력
		int x = 1;			// 초기식
		while(x <= 5) {		// 조건식
			System.out.println(x);
			x = x + 1;		// 증감식
		}
		// int x = 10;
		System.out.println(x);
		
		/*
			초기식, 조건식, 증감식이 한 줄에 있다.
			다만 while문과 세미콜론의 위치가 다르다.
			세미콜론;이 앞에서부터 2개만 있다.
		 */
		for (int y = 1; y <= 5; y++) {
			System.out.println(y);
		}
		
		// for문의 특징 : 초기식의 변수는 for문과 함께 소멸된다.
		int y = 10;
	}

}
