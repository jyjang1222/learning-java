package 반복문_개념;
/*
# 삼항 연산자
	비교식 ? 참 : 거짓
*/
public class 반복문5_개념04_삼항연산자 {

	public static void main(String[] args) {
		int x = 10;
		int y = 0;
		
		if(x == 10) {
			y = 1;
		}else {
			y = -1;
		}
		
		System.out.println("y = " + y);
		
		//----------------------------------------

		int z = (x == 10) ? 1 : -1;
		// x가 10인게 사실이면 ? 1을  변수z에 저장
		// x가 10인게 거짓이면 ? -1을 변수 z에 저장
		System.out.println("z = " + z);		
	}

}
