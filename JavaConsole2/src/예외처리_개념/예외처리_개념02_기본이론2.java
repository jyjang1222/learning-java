package 예외처리_개념;

public class 예외처리_개념02_기본이론2 {

	public static void main(String[] args) {
		int[] arr = new int[3];
		
		try {
			arr[100] = 100;
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		//--------------------------
		
		int a = 10;
		try {
			int b = a / 0;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		//--------------------------
		
		String str = "aaa";
		try {
			int num = Integer.parseInt(str);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

}
