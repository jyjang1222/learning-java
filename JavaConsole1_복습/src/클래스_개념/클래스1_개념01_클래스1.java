package 클래스_개념;

class Member {
	int number;
	String id;
	String pw;
	String name;
}

public class 클래스1_개념01_클래스1 {

	public static void main(String[] args) {
		Member member = new Member();
		member.number = 1; //디폴트 초기화값 0
		member.id = "qwer"; //디폴트 초기화값 null
		member.pw = "1234";
		member.name = "김철수";
		
		System.out.println(member.number);
	}

}
