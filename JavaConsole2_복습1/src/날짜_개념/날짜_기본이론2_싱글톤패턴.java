package 날짜_개념;

class MySingleTonDAO {
	// 1. 생성자를 private으로 잠근다.
	private MySingleTonDAO() {}
	
	// 2. 내부에서 new를 통해 객체를 생성한다.
	private static MySingleTonDAO instance = new MySingleTonDAO();
	
	// 3. instance 변수에 접근할 수 있는 메서드를 생성한다.
	public static MySingleTonDAO getInstance() {
		return MySingleTonDAO.instance;
	}
}

public class 날짜_기본이론2_싱글톤패턴 {

	public static void main(String[] args) {
		// 싱글톤 패턴이란 
		// 과거 DAO 클래스들이 static 을 이용해 편리하게 사용했으나
		// 모든 변수와 함수에 static 을 붙여야만했다. 
		// class 자체에 static 을 붙이면 좋겠지만
		// class 에는 static 을 붙일수없기 때문에 (문법적으로)
		// 그와 유사한 형태로 마치 class 에 붙인거와 같은 효과가 난다. 
		
		// ===  만드는법 ===
		// 1) 생성자를 private 으로 만든다 . 그러면 new 를 할 수 없다. 
		// 2) 내부에서 new를 해서 객체를 생성한다. static 필요
		// 3) public 을 get함수에만 적용한다. static 필요
		
		MySingleTonDAO d1 = MySingleTonDAO.getInstance();
		MySingleTonDAO d2 = MySingleTonDAO.getInstance();
		System.out.println(d1); 
		System.out.println(d2); 
		
	}

}
