package 콜렉션_개념;

import java.util.Scanner;
import java.util.Arrays;

// 객체지향
class Controller {
	int[] score;
	int command;
	
	void printMenu() {
		System.out.println("[벡터 컨트롤러]");
		System.out.println("[1] 추가");
//		System.out.println("[2] 삭제(인덱스)");
//		System.out.println("[3] 삭제(값)");
		System.out.println("[4] 삽입");
		System.out.println("[0] 종료");
		System.out.print("메뉴 선택 : ");
	}
	
	void printData() {
		System.out.println("컨트롤러 저장소 : " + Arrays.toString(score));
	}
	
	void addData(int val) {
		int[] temp = score;
		score = new int[score.length + 1];
		
		for (int i = 0; i < temp.length; i++) {
			score[i] = temp[i];
		}
		
		score[score.length - 1] = val;
	}
	
	boolean checkExistData() {
		boolean check = false;
		if (score.length > 0) {
			check = true;
		} else {
			System.out.println("데이터가 하나 이상 존재해야 합니다.");
		}
		return check;
	}
	
	boolean checkValidIdx(int idx) {
		boolean check = false;
		if (0 <= idx && idx < score.length) {
			check = true;
		} else {
			System.out.println("해당 위치에는 할 수 없습니다.");
		}
		return check;
	}
	
	void init() {
		Scanner scan = new Scanner(System.in);
		score = new int[0];
		
		while(true) {
			printData();
			printMenu();
			
			command = scan.nextInt();
			
			if (command == 0) {
				break;
			}
			if (command == 1) {
				System.out.print("추가할 값을 입력 : ");
				int inputVal = scan.nextInt();
				addData(inputVal);
			} 
			if (command == 4) {
				if(checkExistData()) {
					System.out.print("삽입할 위치(인덱스) 입력 : ");
					int insertIdx = scan.nextInt();
					
					if(checkValidIdx(insertIdx)) {
						System.out.print("삽입할 값 입력 : ");
						int insertVal = scan.nextInt();
						
						int[] temp = score;
						score = new int[score.length + 1];

						int j = 0;
						for (int i = 0; i < score.length; i++) {
							if (i == insertIdx) {
								score[i] = insertVal;
								continue;
							}
							score[i] = temp[j];
							j += 1;
						}
					}
				}
			}
			
		} //end while
		
		scan.close();
	} //end init
	
}

public class 가변배열_개념01_가변배열컨트롤러2 {
	
	public static void main(String[] args) {
	/*
		# 배열 컨트롤러(가변배열) : 벡터(Vector), 연결리스트(ArrayList)
			1. 추가
				값을 입력받아 순차적으로 추가
			2. 삭제(인덱스)
				인덱스를 입력받아 해당 위치의 값 삭제
			3. 삭제(값)
				값을 입력받아 삭제
				없는 값 입력 시 에외처리
			4. 삽입
				인덱스와 값을 입력받아 삽입
	*/
		Controller controller = new Controller();
		
		controller.init();
		
	}

}
