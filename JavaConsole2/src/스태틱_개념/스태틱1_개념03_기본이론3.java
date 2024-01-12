package 스태틱_개념;

import java.util.Vector;

//DTO (Data Transfer Object)
//데이터 전송 객체
//계층(Layer)간 데이터를 주고받기 위한 객체
//계층(Layer)이란 Controller, View, Business, Persistent 레이어 등을 말한다
//일반적으로 DB에서 가져온 데이터를 다른 계층에서 사용하기 적합한 형식으로 변환하여 전송하는데 사용
//DTO 속성은 getter / setter 메서드로 구성
//데이터 전송에만 사용

class Client {	
	private int number;
	private String name;
}

//DAO (Data Access Object)
//데이터 액세스 객체(DB의 data에 접근하기 위한 객체)
//DB에서 데이터를 가져오거나 DB에 데이터를 저장하는 등 CRUD작업을 수행하는 객체
//비즈니스 계층과 DB 간의 인터페이스 역할

class StaticClientDAO{
	public static Vector<Client> clientList = new Vector<Client>();	
	public static void addClient(Client c) {
		clientList.add(c);
	}	
}

class ClientDAO{
	public Vector<Client> clientList = new Vector<Client>();
	public void addClient(Client c) {
		clientList.add(c);
	}	
}

//DTO와 DAO는 항상 한세트로 만든다고 생각하면된다

public class 스태틱1_개념03_기본이론3 {

	public static void main(String[] args) {
		
		// static 활용 (1) DAO를 static 으로 만들면 편하다.
		for(int i = 0; i < 10; i++) {
			StaticClientDAO.addClient(new Client());
		}
		
		System.out.println("-----------------------------------");		
		ClientDAO clientDAO = new ClientDAO();	
		for(int i = 0; i < 10; i++) {
			clientDAO.addClient(new Client());
		}
		
	}

}
