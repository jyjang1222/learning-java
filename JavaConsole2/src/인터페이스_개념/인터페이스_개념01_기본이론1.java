package 인터페이스_개념;

//상속
class TestA{
	void test() {}
}
class TestB extends TestA{
}

//추상화상속
abstract class TestC {
	abstract void test();
	void test2() {}
}
class TestD extends TestC{
	@Override
	void test() {}
}

//인터페이스상속
interface TestE {
	public void test();
	public void test2();
}
interface TestE2{
	public void test3();
}

class TestF implements TestE, TestE2{
	//extends대신 implements, 다중상속 사용가능
	@Override
	public void test() {}

	@Override
	public void test2() {}

	@Override
	public void test3() {}
}

public class 인터페이스_개념01_기본이론1 {

	public static void main(String[] args) {
		
	}

}
