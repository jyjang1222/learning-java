package 반복문_개념;
import java.util.Scanner;
/*
continue는 else로 대체할 수 있다.
때문에 continue를 사용 안해도 된다.
*/
public class 반복문4_개념04_continue를else로표 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int run = 1;
		while(run == 1) {
			System.out.println("1.햄버거");
			System.out.println("2.콜라");
			System.out.println("3.감자");
			
			int sel = scan.nextInt();
			
			if(sel != 1 && sel != 2 && sel != 3) {
				System.out.println("잘못된 입력입니다.");
			}else {
				if(sel == 1) {
					System.out.println("햄버거를 주문하였습니다.");
				}else if(sel == 2) {
					System.out.println("콜라를 주문하였습니다.");
				}else if(sel == 3) {
					System.out.println("감자를 주문하였습니다.");
				}
			}
		}
		
		scan.close();
	}

}
