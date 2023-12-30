package 변수_개념;

public class 변수1_개념07_자료형변환 {

	public static void main(String[] args) {
		// 1. 자동 형변환
		System.out.println(10 + 3.0);
		// 2. 강제 형변환
		int x = 10;
		int y = 3;
		double z = 10.0;
		double res1 = x / y;
		double res2 = (double)x / y;
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(z / y);
	}

}
