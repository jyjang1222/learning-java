package 메서드_개념;

class User {
	String name;
	int score;
	
	void setUser(String name, int score) {
		this.name = name;
		this.score = score;
	}
    void printInfo() {
        System.out.println(name + " : " + score);
    }
}

public class 메서드클래스배열4_개념02_기본이론2 {
	public static void main(String[] args) {
	
		String[][] data = {{"김철수", "100"}, {"이만수", "20"}, {"박영희", "70"}};
		User[] userList = new User[3];
		
		for (int i = 0; i < userList.length; i++) {
			String name = data[i][0];
			int score = Integer.parseInt(data[i][1]);
			
			userList[i] = new User();
			userList[i].setUser(name, score);
		}
		
		for (User user : userList) {
			user.printInfo();
		}
		
	}
}
