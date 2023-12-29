package 반복문_개념;
/*
# switch - case
	1. 사용 예 : 비교 대상이 전부 같다(==) 일 때만 사용 가능하다.
	2. 모양이 많이 불편한다.
	3. 때문에 if만 사용해도 무방하다.
	
	4. 구조
		1) switch		: 키워드
		2) (값)			: 비교할 값
		3) {}			: 실행영역
		4) case 값:		: 비교할 값
		5) 내용 break;	: 비교할 값과 내용
*/
public class 반복문5_개념01_switch {

	public static void main(String[] args) {
		int num = 2;
		
		if(num == 1) {
			System.out.println("num은 1이다.");
		}else if(num == 2) {
			System.out.println("num은 2이다.");
		}else if(num == 3) {
			System.out.println("num은 3이다.");
		}
		
		System.out.println("-------------------------");
		
		switch(num) {
		case 1:
			System.out.println("num은 1이다.");
			break;
		case 2:
			System.out.println("num은 2이다.");
			break;
		case 3:
			System.out.println("num은 3이다.");
			break;
		}		
	}

}
