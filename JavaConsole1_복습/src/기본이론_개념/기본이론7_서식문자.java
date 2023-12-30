package 기본이론_개념;

public class 기본이론7_서식문자 {

	public static void main(String[] args) {
	/*
		 출력문의 종류
		 1. println()
		 2. print()
		 3. printf()
		 	1) f = format(서식)
		 	2) 서식 문자의 종류 (어떤 형식으로 출력할지 결정)
		 		%알파벳
		 		%d	decimal, 정수
		 		%f	float, 실수
		 		%c	character, 문자한개
		 		%s	String, 문자여러개
	*/
		System.out.println(10);
		System.out.printf("%d", 10);
		System.out.println();
		
		System.out.println(3.14142454235345325);
		System.out.printf("%10.2f", 3.14142454235345325);
		System.out.println();
		System.out.printf("%.0f", 3.14142454235345325);
		System.out.println();
		
		System.out.printf("%c", 'A');
		System.out.println();
		
		System.out.printf("%s", "String");
		System.out.println();
		
		System.out.printf("%d + %d = %d%%", 1, 2, 3);
	}

}
