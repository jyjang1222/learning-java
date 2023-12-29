package 반복문_개념;
/*
# do - while문
	1. while문의 변형된 형태이다.
	2. while문과 많은 차이가 없다.
	
	3. 구조
		1) do			: 조건식이 없기 때문에 일단 실행부터 한다.
		2) {}			: 실행할 문장
		3) while(조건)	: 위에서 실행을 먼저 하고 조건을 검사한다.
						  조건이 사실이면 다시 do로 이동한다.
		4) [주의] ; 세미콜론을 반드시 붙여야한다.
*/
public class 반복문5_개념05_dowhile {

	public static void main(String[] args) {
		int i = 6;
		while(i < 6) {
			System.out.println(i);
			i = i + 1;
		}
		
		System.out.println("--------------");
		
		i = 6;
		
		do {
			System.out.println(i);
			i = i + 1;
		} while(i < 6);		
	}

}
