package 예외처리_개념;

import java.util.Scanner;
import java.util.Random;

public class 예외처리_개념05_기본이론5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		// [1] Thread.sleep(밀리세컨즈)
		// [2] () 안에 넣은 값만큼 일시정지된다. 
		// [3] 밀리세컨즈이기때문에 1000 이 1초이다. 
		// [4] 이걸활용해서 동적프로그램을 만들수있다. (GUI 에서 활용)
		
		try {
			// java.lang 패키지내 클래스는 import하지 않고 사용가능
			System.out.println("test");
			Thread.sleep(1000);			
			System.out.println("test");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
