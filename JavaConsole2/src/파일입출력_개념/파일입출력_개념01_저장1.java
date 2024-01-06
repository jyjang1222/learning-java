package 파일입출력_개념;

import java.io.FileWriter;
import java.io.IOException;

public class 파일입출력_개념01_저장1 {

	public static void main(String[] args) {
		// 세이브 파일 만들기 FileWriter
		// 1) 변수생성          	==>  FileWriter fw = null; 
		// 1) 파일 생성          	==>  fw = new FileWriter("파일이름"); 
		// 2) 파일에 내용 저장 		==>  fw.write(저장할내용);
		// 3) 파일닫기           	==>  fw.close(); 
		
//		String fileName = "file01.txt";  프로젝트 폴더에 생성됨
		String fileName = "src/파일입출력_개념/file03.txt"; // 경로 지정가능
		
		FileWriter fw = null; // try 밖에서 사용을 위해 보통 밖에 변수를 만든다.
		
		try {
			fw = new FileWriter(fileName);		
			fw.write("김철수,10\\n이영희,30\\n박만수,50");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Exception 을 사용해도되고 IOException 을사용해도된다.
//			try {fw.close();} catch (IOException e) {e.printStackTrace();}
			try {fw.close();} catch (Exception e) {e.printStackTrace();}
		}
	}

}
