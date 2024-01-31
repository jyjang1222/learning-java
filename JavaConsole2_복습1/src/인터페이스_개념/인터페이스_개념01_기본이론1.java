package 인터페이스_개념;

//상속
class TestA {
	void test() {}
}
class TestB extends TestA {}

//추상화상속
abstract class TestC {
	abstract void test();
	void test2() {};
}
class TestD extends TestC {
	@Override
	void test() {}
}

//인터페이스 상속
interface TestE {
	public void test();
}
interface TestF {
	public void test2();
}
class testG implements TestE, TestF {
	@Override
	public void test() {}
	@Override
	public void test2() {}
}

public class 인터페이스_개념01_기본이론1 {

	public static void main(String[] args) {
		
	}

}
