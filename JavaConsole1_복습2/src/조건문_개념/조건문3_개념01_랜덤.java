package 조건문_개념;

import java.util.Random;

public class 조건문3_개념01_랜덤 {

	public static void main(String[] args) {
		System.out.printf("%.1f\n", 3.15);
		Random ran = new Random();
		int rNum = ran.nextInt(3) + 1;
		System.out.println(rNum);
	}

}
