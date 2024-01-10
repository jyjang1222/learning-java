package 캡슐화_개념;

class Product {
	private String regiDate;
	private String name;
	private int price;
	
	public Product (String date , String name , int price){
		this.regiDate = date;
		this.name = name;
		this.setPrice(price); // 유효성을 검증하고 값 저장
	}
	// getter, setter메서드 자동완성 단축키
	// alt + shift + s, r
	
	
	// set메서드 : 값의 유효성 검사 및 저장
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getRegiDate() {
		return regiDate;
	}
	public String getName() {
		return name;
	}
	// get메서드 : 값을 반환
	public int getPrice() {
		return price;
	}
}

public class 캡슐화_개념03_기본이론3 {

	public static void main(String[] args) {
		// [get set의 활용법]
		
		// 위와같이 set메서드는 price만 만들어놓고 , 
		// 제조년과 상품이름의 set메서드를 만들지않으면 
		// 제조년과 상품이름은 처음 저장한 이후 변경이 절대로 불가능하다. 
		
		// 결론은 변수 하나당 get, set 메서드를 한세트로 작성하는 것을 권장
		Product pr = new Product("20210420", "김치", 2000);
		System.out.println(pr.getName());
		System.out.println(pr.getRegiDate());
		System.out.println(pr.getPrice());
		System.out.println("-------------------------------");
		pr.setPrice(1500);

		System.out.println(pr.getName());
		System.out.println(pr.getRegiDate());
		System.out.println(pr.getPrice());
	}

}
