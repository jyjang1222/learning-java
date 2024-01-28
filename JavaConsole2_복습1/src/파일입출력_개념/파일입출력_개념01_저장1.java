package 파일입출력_개념;

import java.io.FileWriter;

public class 파일입출력_개념01_저장1 {

	public static void main(String[] args) {
		// 세이브 파일 만들기 FileWriter
		// 1) 변수생성          	==>  FileWriter fw = null; 
		// 1) 파일 생성          	==>  fw = new FileWriter("파일이름"); 
		// 2) 파일에 내용 저장 		==>  fw.write(저장할내용);
		// 3) 파일닫기           	==>  fw.close(); 
		
		String path = "src/파일입출력_개념/";
		String fileName = "file1.txt"; //프로젝트 폴더에 생성됨
		String fileContent = "김철수,10\\n이영희,30\\n박만수,50";
		
		FileWriter fw = null; // try 밖에서 사용을 위해 보통 밖에 변수를 만든다.
		
		try {
			fw = new FileWriter(path + fileName);
			fw.write(fileContent);
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
