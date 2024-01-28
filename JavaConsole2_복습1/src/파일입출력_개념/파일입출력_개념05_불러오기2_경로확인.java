package 파일입출력_개념;

import java.io.File;
import java.io.FileReader;

public class 파일입출력_개념05_불러오기2_경로확인 {

	public static void main(String[] args) {
		String fileName = "src/파일입출력_개념/file1.txt";
		String data = "";
		
		FileReader fr = null;
		File file = new File(fileName);
		
		if (file.exists()) {
			try {
				fr = new FileReader(fileName);
				
				while (true) {				
					int ch = fr.read();
					
					if (ch != -1) {
						data += (char)ch;
					} else {
						break;
					}
				}
				fr.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("파일 미존재");
		}
		System.out.println(data);
		
	}

}
