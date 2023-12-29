package 메서드_개념;

import java.util.Random;

class RanNum {
	int num;
	boolean check;		// false로 초기화
	
	void print() {
		System.out.print(this.num + " ");
	}
}

public class 메서드클래스배열4_개념03_중복숫자 {

	public static void main(String[] args) {
		// 문제) RanNum 클래스를 활용해서 중복숫자금지 출력 
		//      클래스배열에 1~5사이숫자를 랜덤으로 저장한다. (조건 중복숫자금지)
		Random ran = new Random();
		RanNum[] numList = new RanNum[5];
		
//      정답
//		for (int i = 0; i < numList.length; i++) {
//			numList[i] = new RanNum();
//		}
//		
//		for (int i = 0; i < numList.length; i++) {
//			int rNum = ran.nextInt(5);
//			
//			if (numList[rNum].check == false) {
//				numList[rNum].num = i + 1;
//				numList[rNum].check = true;
//			} else {
//				i -= 1;
//			}
//		}
		
		// 내 풀이
		for (int i = 0; i < numList.length; i++) {
			numList[i] = new RanNum();
			int rNum = ran.nextInt(5) + 1;
			boolean check = true;
			
			for (int j = 0; j < i; j++) {
				if (numList[j].num == rNum) {
					check = false;
					i -= 1;
				} 
			}
			if (check) {				
				numList[i].num = rNum;
			}
		}
		
		for(int i = 0; i < numList.length; i++) {
			numList[i].print();
		}
	}

}
