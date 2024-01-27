package 메서드_개념;

class Data {
	int a;
	int b;
	String op;
	int res;
	void setData(int a, int b) {
		this.a = a;
		this.b = b;
	}
	void print() {
		System.out.printf("%d %s %d = %d\n", a, op, b, res);
	}
}

class Calc {
	void plus(Data data) {
		data.op = "+";
		data.res = data.a + data.b;
	}
	void minus(Data data) {
		data.op = "-";
		data.res = data.a - data.b;
	}
}

public class 메서드1_개념07_기본이론7 {

	public static void main(String[] args) {
		Data data1 = new Data();
		data1.setData(1, 2);
		Calc calc1 = new Calc();
		calc1.plus(data1);
		data1.print();
		calc1.minus(data1);
		data1.print();
	}

}
