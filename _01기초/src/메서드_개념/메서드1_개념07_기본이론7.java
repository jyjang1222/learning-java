package 메서드_개념;

class Data{
	int a;
	int b;
	int result;
	String op;
	void print() {
		System.out.println(a + op + b + "=" + result);
	}
}

class Calc{
	void plus(Data data , int a , int b) {
		data.a = a;
		data.b = b;
		data.op  = "+";
		data.result = a + b;
	}
	void minus(Data data , int a , int b) {
		data.a = a;
		data.b = b;
		data.op = "-";
		data.result = a - b;
	}
}

public class 메서드1_개념07_기본이론7 {

	public static void main(String[] args) {
		Data data = new Data();		
		Calc calc = new Calc();	
		
		// data 는 new Data() 의 주소가 들어있기때문에 가능하다. 
		calc.plus(data, 10, 3);
		data.print();
		calc.minus(data, 11, 4);
		data.print();
	}

}
