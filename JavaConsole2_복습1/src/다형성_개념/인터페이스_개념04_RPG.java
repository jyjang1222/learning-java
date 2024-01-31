package 다형성_개념;

import java.util.Random;

interface Skill {
	public abstract void skill();
	public abstract void skillAttack(Unit unit);
	public abstract void attack(Unit unit);
}

class Unit implements Skill {
	public final int MAX_HP;
	public int hp;
	public int power;
	
	public Unit(int hp, int power) {
		MAX_HP = hp;
		this.hp = MAX_HP;
		this.power = power;
	}
	
	@Override
	public String toString() {
		return hp + "/" + MAX_HP;
	}
	
	@Override
	public void skill() {}
	@Override
	public void skillAttack(Unit unit) {}
	@Override
	public void attack(Unit unit) {}
}

class Wolf extends Unit {
//	public final int MAX_HP;
//	public int hp;
//	public int power;
	public int leg;
	public int bite;
	
	public Wolf(int leg, int bite) {
		super(100, 10);
		this.leg = leg;
		this.bite = bite;
	}

	@Override
	public void skill() {
		power += leg + bite;
		System.out.println("다리개수와 이빨개수만큼 공격력이 향상했다! power =" + power);
	}
	@Override
	public void attack(Unit unit) {
		Random ran = new Random();
		
		int rNum = ran.nextInt(10) + 1;
		
		unit.hp -= power;
		unit.hp -= rNum;
		
		System.out.println("Wolf가 기본 데미지 " + this.power + "을(를) 입혔습니다.");
		System.out.println("Wolf가 추가 데미지 " + rNum + "을(를) 입혔습니다.");
	}
	@Override
	public void skillAttack(Unit unit) {}
}

class Bat extends Unit {
	public int fly;
	public int poison;
	
	public Bat(int fly, int poison) {
		super(50, 5);
		this.fly = fly;
		this.poison = poison;
	}
	
	@Override
	public void skill() {
		power += fly;
		System.out.println("Bat가 fly스킬 사용, 공격력증가! power = " + power);
	}
	@Override
	public void skillAttack(Unit unit) {
		unit.hp -= poison + power;
		Random ran = new Random();
		
		int rNum = ran.nextInt(10) + 1;
		System.out.println("Bat가 기본 데미지 " + this.power + "을(를) 입혔습니다.");
		System.out.println("Bat가 추가 데미지 " + rNum + "을(를) 입혔습니다.");
	}
	@Override
	public void attack(Unit unit) {
		unit.hp -= power;
		System.out.println("Bat가 기본 데미지 " + this.power + "을(를) 입혔습니다.");
	}
}

public class 인터페이스_개념04_RPG {

	public static void main(String[] args) {
		Unit[] unitList = new Unit[5];
		
		Wolf wolf = new Wolf(3, 10);
		unitList[0] = wolf;
		unitList[0].skill();
		
		Bat bat = new Bat(10, 5);
		unitList[1] = bat;
		unitList[1].skill();
		
		unitList[0].attack(unitList[1]);
		System.out.println(unitList[1]);
		unitList[1].attack(unitList[0]);
		System.out.println(unitList[0]);
	}

}
