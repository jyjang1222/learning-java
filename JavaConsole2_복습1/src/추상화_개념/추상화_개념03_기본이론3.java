package 추상화_개념;

abstract class Monster {
	abstract void skill();
	abstract void attack();
	abstract void defense();
}
class Cat extends Monster {
	@Override
	void attack() {
		System.out.println("고양이 공격");
	}
	@Override
	void skill() {}
	@Override
	void defense() {}
}
class Dog extends Monster {
	@Override
	void attack() {
		System.out.println("강아지 공격");
	}
	@Override
	void skill() {}
	@Override
	void defense() {}
}

public class 추상화_개념03_기본이론3 {

	public static void main(String[] args) {
		Monster[] monsterList = {new Cat(), new Dog()};
		monsterList[0].attack();
		
		Cat c = (Cat)monsterList[0];
	}

}
