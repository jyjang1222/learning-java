package 날짜_개념;

class Member {}
class MemberDAO {
	static public MemberDAO instance = new MemberDAO();
	public void insert() {}
	public void delete() {}
}

class User {}
class UserDAO {
	// 1. new 를 못하게 private 으로 생성자 설정한다. 
	private UserDAO() {}
	// 2. private 으로 클래스내부에서 new 를 한다. 
	private static UserDAO instance = new UserDAO(); 
	// 3. set은 만들지않는다. 오로지get만 만들어서 접근만할수있게한다. 
	public static UserDAO getInstance() { 			 
		return UserDAO.instance;
	}
	public void insert() {}
}

public class 날짜_기본이론2_싱글톤패턴2 {
	public static void main(String[] args) {
		
		MemberDAO.instance.delete();	
		MemberDAO.instance = new MemberDAO(); // 외부에서 new가 가능한 문제점이 있다. 
		
		// 싱글턴 만드는법 
		// UserDAO user = new UserDAO(); 
		UserDAO.getInstance().insert();
	}
}