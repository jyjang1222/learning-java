package 배열_개념;

import java.util.ArrayList;
import java.util.Scanner;

// 중복값 존재시 추가x
// 삭제시 값미존재 삭제x

public class 배열9_개념15_리스트컨트롤러 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> numList = new ArrayList<Integer>();
		
		while (true) {
			System.out.println("[리스트 컨트롤러]");
			System.out.println("[1] 추가 [2] 삭제 [3] 검색 [4] 출력 [5] 수정 [0] 종료");
			
			int sel = scan.nextInt();
			
			if (sel == 0) {
				break;
			} else if(sel == 1) {
				System.out.print("추가값 입력 : ");
				int inputVal = scan.nextInt();
				
				// 중복검사
				boolean check = false;
				for (int i = 0; i < numList.size(); i++) {
					if (numList.get(i) == inputVal) {
						check = true;
					}
				}
				
				if (check == false) {
					numList.add(inputVal);
					System.out.println(inputVal + " 을 추가했습니다.");
				} else {
					System.out.println("중복되는 값 입니다.");
				}
			} else if(sel == 2) {
				System.out.print("삭제할 값 입력 : ");
				int inputVal = scan.nextInt();
				
				// 삭제할 값 존재 확인
				boolean check = false;
				int removeIdx = 0;
				for (int i = 0; i < numList.size(); i++) {
					if (numList.get(i) == inputVal) {
						check = true;
						removeIdx = i;
					}
				}
				
				if (check = false) {
					System.out.println("삭제할 값이 존재하지 않습니다.");
				} else {
					numList.remove(removeIdx);
					System.out.println(inputVal + "값을 삭제했습니다.");
				}
			} else if(sel == 3) {
				System.out.print("[검색]값 입력 : ");
				int value = scan.nextInt();
				
				// 값 유효성 검사
				int check = -1;
				for(int i = 0; i < numList.size(); i++) {
					if(value == numList.get(i)) {
						check = i;
						break;
					}
				}
				
				if(check == -1) {
					System.out.println("값 입력 오류입니다.");
				} else {
					System.out.printf("입력하신 값 %d 는 %d 번째 위치하고있습니다.", value, check + 1);
				}
			} else if(sel == 4) {
				System.out.println(numList);
			} else if(sel == 5) {
				System.out.print("[수정]값 입력 : ");
				int value = scan.nextInt();
				
				// 값 유효성 검사
				int check = -1;
				for(int i=0; i < numList.size(); i++) {
					if(value == numList.get(i)) {
						check = i;
						break;
					}
				}
				
				if(check == -1) {
					System.out.println("값 입력 오류입니다.");
				} else {
					System.out.print("[수정]변경할 값 입력 : ");
					int newValue = scan.nextInt();
					numList.set(check, newValue);
				}
			}
			
		} //컨트롤러 End

		scan.close();
	}

}
