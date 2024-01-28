package 스태틱_개념;

import java.util.Vector;

class Client {
	private int num;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
}

class staticClientDAO {
	public static Vector<Client> clientList = new Vector<Client>();
	public static void addClient(Client c) {
		clientList.add(c);
	}
}

public class 스태틱1_개념03_기본이론3 {
	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			Client c = new Client();
			c.setNum(i);
			staticClientDAO.addClient(c);
		}
		
		for (Client c : staticClientDAO.clientList) {
			System.out.println(c.getNum());
		}
	}
}
