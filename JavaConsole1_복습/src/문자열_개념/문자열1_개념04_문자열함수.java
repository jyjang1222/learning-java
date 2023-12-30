package 문자열_개념;

import java.util.Arrays;

public class 문자열1_개념04_문자열함수 {

	public static void main(String[] args) {
		String str = "academy";
		char ch = str.charAt(0);
		System.out.println(ch);
		
		String str2 = str.substring(1, 3);
		System.out.println(str2);
		
		String str3 = "서울시,송파구,1234";
		String[] temp = str3.split(",");
		System.out.println(Arrays.toString(temp));
		
		String str4 = " a b c ";
		str4 = str4.trim();
		System.out.println(str4);
		
		String str5 = "hello java";
		str5 = str5.replaceAll("java", "spring");
		System.out.println(str5);
	}

}
