package 스태틱_개념;

import java.util.Vector;

class StaticTest {
	private static int score; // 내용이 담긴 변수는 static 으로 만들면 공유되어 버린다.
	private static String name;
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		StaticTest.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		StaticTest.name = name;
	}
}

class StaticTestDAO {
	public static Vector<StaticTest> testList = new Vector<StaticTest>();
	
	public static void addTest(StaticTest test) {
		testList.add(test);
	}
	public static void printTestList() {
		for (StaticTest test : testList) {
			System.out.print(test.getName());
			System.out.println(" " + test.getScore());
		}
	}
}

public class 스태틱1_개념02_기본이론2 {
	public static void main(String[] args) {
		/*
		 * [스태틱 활용시 주의 할점] DAO 는 static 으로 만들어도되지만 
		 * 객체는 개수를 따로count 하는 변수를 제외하곤 실제
		 * 내용이 들어가는 변수를 static으로 만들면 안된다.
		 */
		String[] dataName = { "aaa", "bbb", "ccc", "ddd" };
		int[] dataScore = { 43, 54, 12, 94 };
		
		for (int i = 0; i < dataName.length; i++) {
			StaticTest t = new StaticTest();
			
			t.setName(dataName[i]);
			t.setScore(dataScore[i]);
			
			StaticTestDAO.addTest(t);
		}
		StaticTestDAO.printTestList();
	}
}
