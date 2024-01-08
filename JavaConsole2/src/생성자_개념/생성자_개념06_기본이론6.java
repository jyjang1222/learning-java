package 생성자_개념;

import java.io.IOException;
import java.io.FileWriter;

class Test05 {
	// 예외처리_개념06_기본이론6 확인
	Test05 () throws Exception {
		
	}
}

public class 생성자_개념06_기본이론6 {

	public static void main(String[] args) {
//		Test05 t1 = new Test05();
		try {
			Test05 t2 = new Test05();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileWriter fw1 = new FileWriter("test1.txt");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
