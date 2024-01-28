package 생성자_개념;

//생성자는 반드시 클래스 이름과 같아야 한다.
//생성자는 인스턴스 변수를 초기화 시킬 목적으로 사용한다.
//생성자는 리턴타입을 가지지 않고 return도 사용하지 않는다.(메서드와의 차이점)
//보통은 setter를 통해 초기화를 하고 스프링까지 배우면 생성자는 잘안쓰게된다.

class Toy {
	String name;
	int price;
	
	// 기본생성자 (생략가능)
	Toy () {
		name = "박스";
		price = 1000;
		System.out.println("기본 생성자");
	}
	
	// 생성자 재정의 (오버로딩)
	Toy (String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	void setData(String name, int price) {
		this.name = name;
		this.price = price;
	}
	String getData() {
		return name + String.valueOf(price);
	}
}

public class 생성자_개념01_기본이론1 {

	public static void main(String[] args) {
		Toy toy1 = new Toy();
		System.out.println(toy1.getData());
		Toy toy2 = new Toy("로봇", 2000);
		System.out.println(toy2.getData());
		
		toy2.setData("인형", 3000);
		System.out.println(toy2.getData());
	}

}
