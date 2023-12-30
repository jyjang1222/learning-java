package 문자열_개념;

public class 문자열1_개념05_형변환 {

	public static void main(String[] args) {
		// 1. 기본 자료형 형변환하는 방법 : (자료형)변수
		// * 문자 -> 숫자
		char ch = 'a';
		int chNum = (int)ch;
		System.out.println(chNum);
		
		ch = (char)(chNum + 1);
		System.out.println(ch);
		
		// 2. 문자열 형변환하는 방법 : 특수함수를 사용해야한다.
		// * 문자열 -> 숫자
		String strNum = "10";
		int num = Integer.parseInt(strNum);
		System.out.println(strNum);
		
		// * 숫자 -> 문자열
		// 1.
		strNum = num + "";
		System.out.println(strNum);
		// 2.
		strNum = String.valueOf(num);
		System.out.println(strNum);
	}

}
