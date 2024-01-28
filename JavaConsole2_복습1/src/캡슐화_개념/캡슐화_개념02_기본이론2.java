package 캡슐화_개념;

class Student1 {
	private String name;
	private int age;
	
	public Student1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// getter, setter메서드 자동완성 단축키
	// alt + shift + s, r
	// 변수 하나당 get, set 메서드를 한세트로 작성하는 것을 권장
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

public class 캡슐화_개념02_기본이론2 {

	public static void main(String[] args) {
		Student1 st1 = new Student1("홍길동", 11);
		System.out.println(st1.getName());
		System.out.println(st1.getAge());
	}

}
