package 조건문1_개념;

public class 조건문3_개념05_if옵션_elseif {

	public static void main(String[] args) {
		// if에서 else if 2개를 거쳐
		System.out.println(">>> 과일");
		System.out.println("[1.사과 2.포도 3.감]");
		System.out.println("번호를 입력하세요 : 5");
		
		int select = 5;
		if(select == 1) { System.out.println("1.사과"); }
		else if(select == 2) { System.out.println("2.포도"); }
		else if(select == 3) { System.out.println("3.감"); }
		else { System.out.println("오류1"); }
		
		System.out.println("----------------");
		
		select = 5;
		if(select == 1) { System.out.println("1.사과"); }
		if(select == 2) { System.out.println("2.포도"); }
		if(select == 3) { System.out.println("3.감"); }
		if(3 < select || select < 1) { System.out.println("오류2"); }
	}

}
