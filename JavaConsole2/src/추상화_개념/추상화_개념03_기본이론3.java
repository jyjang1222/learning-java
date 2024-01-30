package 추상화_개념;
/*
상속의 종류 3가지
(1) 상속
	extends, 한번만 상속 가능
(2) 추상화
	abstract 부모클래스
	abstract 메서드();
	부모의 abstract메서드를 자식이 반드시 구현implement(중괄호)해야 한다. 
(3) 인터페이스

상속의 장점
기존 int[] arr = {1, 2}
상속 Monster[] list = {cat, dog}
공통의 부모를 만들면 자식들을 부모 배열로 저장 가능
*/

abstract class Monster {
	abstract void skill();
	abstract void attack(); // 어차피 서로다른 기능들을 재정의 해야하니 추상메서드로 만듬
	abstract void deffense();
}
class Cat extends Monster {
	void fishAttack() {
		System.out.println("물고기 공격!");
	}
	void attack() {
		System.out.println("고양이 공격");
	}
	@Override
	void skill() {
		// TODO Auto-generated method stub
	}
	@Override
	void deffense() {
		// TODO Auto-generated method stub
	}
}

class Dog extends Monster {
	@Override
	void skill() {
		// TODO Auto-generated method stub
	}
	@Override
	void attack() {
		System.out.println("강아지 공격");
	}
	@Override
	void deffense() {
		// TODO Auto-generated method stub
	}
}
public class 추상화_개념03_기본이론3 {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		Monster[] monsterList = new Monster[2];
		monsterList[0] = cat;
		monsterList[1] = dog;
		monsterList[0].attack();
		
		Cat c = (Cat)monsterList[0];
		c.fishAttack();
	}
}
