package 반복문_개념;
/*
# 보조제어문 2종류
1. break
	break가 속해있는 반복문 1개를 즉시 종료한다.
	(굉장히 편리하다.)
*/
public class 반복문4_개념02_break {

	public static void main(String[] args) {
		for(int i=0; i<15; i++) {
			if(i == 3) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("프로그램 종료");
	}

}
