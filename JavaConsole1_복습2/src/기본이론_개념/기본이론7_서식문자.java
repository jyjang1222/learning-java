package 기본이론_개념;

public class 기본이론7_서식문자 {

	public static void main(String[] args) {
		System.out.println(10);
		System.out.printf("%d", 10);
		System.out.println();
		
		double num2 = 3.14142454235345325;
		System.out.println(num2);
		System.out.printf("%10.2f", num2);
		System.out.println();
		System.out.printf("%.0f", num2);
		
		System.out.printf("%c", 'A');
		System.out.println();
		
		System.out.printf("%d%% + %d%% = %d%%", 50, 50, 100);
	}

}
