package 스태틱_개념;

import java.util.Vector;

class StaticTest {

	static private int score; // 내용이 담긴 변수는 static 으로 만들면 공유되어 버린다.
	static private String name;

	private int score2;
	private String name2;

	public static int getScore() {
		return score;
	}

	public static void setScore(int score) {
		StaticTest.score = score;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		StaticTest.name = name;
	}
	
	//

	public int getScore2() {
		return score2;
	}

	public void setScore2(int score2) {
		this.score2 = score2;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

}

class StaticTestDAO {
	public Vector<StaticTest> testList = new Vector<StaticTest>();

	public void addTest(StaticTest test) {
		testList.add(test);
	}

	public void printTestList() {
		for (int i = 0; i < testList.size(); i++) { // 전부 같은내용이 나온다.
			System.out.print(testList.get(i).getName());
			System.out.println(" " + testList.get(i).getScore());
		}
		System.out.println("--------------------------------------------");
		for (int i = 0; i < testList.size(); i++) {
			System.out.print(testList.get(i).getName2());
			System.out.println(" " + testList.get(i).getScore2());
		}
	}
}

public class 스태틱1_개념02_기본이론2 {

	public static void main(String[] args) {
		/*
		 * [스태틱 활용시 주의 할점] DAO 는 static 으로 만들어도되지만 
		 * 객체는 개수를 따로count 하는 변수를 제외하곤 실제
		 * 내용이들어가는 변수를 static으로 만들면 안된다.
		 */
		StaticTestDAO STD = new StaticTestDAO();

		String[] dataName = { "aaa", "bbb", "ccc", "ddd" };
		int[] dataScore = { 43, 54, 12, 94 };
		
		for (int i = 0; i < dataName.length; i++) {
			
			StaticTest t = new StaticTest();
			// static(클래스) 메서드
			StaticTest.setName(dataName[i]);
			StaticTest.setScore(dataScore[i]);
			
			// non-static(인스턴스) 메서드
			t.setName2(dataName[i]);
			t.setScore2(dataScore[i]);

			STD.addTest(t);
		}
		STD.printTestList();
		
	}

}
