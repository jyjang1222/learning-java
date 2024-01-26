package 클래스_개념;
/*
	클래스 : 객체를 생성하기위한 설계 틀
	객체 : 인스턴스 집합
	인스턴스 : new키워드를 사용해서 메모리에 올라간 상태인 하나의 객체
*/
class Member {
	int number;
	String id;
	String pw;
	String name;
}

class Test01 {
	int x;
	int y;
}

public class 클래스1_개념01_클래스1 {

	public static void main(String[] args) {
		Member member = new Member();
		member.number = 1;
		member.id = "qwer";
		member.pw = "1234";
		member.name ="김철수";
		
		System.out.println(member.name);
	}

}
