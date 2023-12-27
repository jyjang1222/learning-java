package 반복문_개념;

public class 반복문5_개념02_switch {

	public static void main(String[] args) {
		int num = 2;
		
		if(num == 1) {
			System.out.println("num은 1이다.");
		} else if(num == 2) {
			System.out.println("num은 2이다.");
		} else if(num == 3) {
			System.out.println("num은 3이다.");
		} else {
			System.out.println("num은 1~3은 아니다.");
			System.out.println("num은 1~3은 아니다.");
		}
		
		System.out.println("-------------------------");
		
		switch (num) {
		case 1:
			System.out.println("num은 1이다.");
			break;
		case 2:
			System.out.println("num은 2이다.");
			break;
		case 3:
			System.out.println("num은 3이다.");
			break;
		default:
			System.out.println("num은 1~3은 아니다.");
//			break;
		}
		
	}
}
