package 날짜_개념;

class User {}
class UserDAO {
	private UserDAO () {}
	private static UserDAO instance = new UserDAO();
	public static UserDAO getInstance() {
		return UserDAO.instance;
	}
	public void insert() {}
}

public class 날짜_기본이론2_싱글톤패턴2 {

	public static void main(String[] args) {
		UserDAO user1 = UserDAO.getInstance();
		System.out.println(user1);
		user1.insert();
	}

}
