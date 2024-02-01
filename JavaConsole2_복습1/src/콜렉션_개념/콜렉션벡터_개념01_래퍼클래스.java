package 콜렉션_개념;

/*
# 래퍼 클래스(wrapper class)
- 래퍼 클래스란, 기본 자료형을 클래스로 만들어 놓은 것을 의미한다. (해당 자료형에 필요한 기능 추가)
	[기본형]          [래퍼 클래스]
	byte             Byte
	short            Short
	int              Integer
	long             Long
	float            Float
	double           Double
	char             Character
	boolean          Boolean	
*/

public class 콜렉션벡터_개념01_래퍼클래스 {

	public static void main(String[] args) {
		int i1 = 10;
		
		Integer i2 = Integer.valueOf("10");
		Integer i3 = new Integer(20);
		
		double d1 = 10.11;
		Double d2 = Double.valueOf(10.11);
	}

}
