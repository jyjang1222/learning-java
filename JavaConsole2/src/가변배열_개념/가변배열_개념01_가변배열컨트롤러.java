package 가변배열_개념;

import java.util.Scanner;

public class 가변배열_개념01_가변배열컨트롤러 {

	public static void main(String[] args) {
	/*
		# 배열 컨트롤럴(가변배열) : 벡터(Vector), 연결리스트(ArrayList)
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
		Scanner scan = new Scanner(System.in);
		int[] score = new int[0];
		
		while (true) {
			for (int i = 0; i < score.length; i++) {
				System.out.print("[" + score[i] + "]");
			}
			System.out.println();
			System.out.println("[벡터 컨트롤러]");
			System.out.println("[1] 추가");
			System.out.println("[2] 삭제(인덱스)");
			System.out.println("[3] 삭제(값)");
			System.out.println("[4] 삽입");
			System.out.println("[0] 종료");
			System.out.print("메뉴 선택 : ");
			
			int inputNum = scan.nextInt();
			// [1]추가
			if (inputNum == 1) {
				int[] temp = score;
				score = new int[score.length + 1];
				
				for (int i = 0; i < temp.length; i++) {
					score[i] = temp[i];
				}
				
				System.out.print("값을 입력 : ");
				int inputVal = scan.nextInt();
				score[score.length - 1] = inputVal;
			// [4]삽입
			} else if (inputNum == 4) {
				// 데이터가 존재하면 삽입 가능
				if (score.length > 0) {
					System.out.print("삽입할 위치(인덱스) 입력 : ");
					int insertIdx = scan.nextInt();
					
					if (0 < insertIdx && insertIdx < score.length) {
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
					} else {
						System.out.println("해당 위치에는 삽입할 수 없습니다.");
					}
				} else {
					System.out.println("데이터가 하나 이상 존재해야 삽입가능합니다.");
				}
			// [0] 종료
			} else if (inputNum == 0) {				
				break;
			}
		}
		
		
	}

}
