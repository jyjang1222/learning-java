package 반복문_개념;
/*
# 증감 연산자
	1. ++a
		- 먼저 a에 1이 더해지고 출력된다.
	2. a++
		- 먼저 a가 출력되고나서 1이 더해진다.
		- 연산자 우선순위에 의해서 ++을 변수 뒤에 붙이는건
		  우선순위가 가장 낮다.
		  때문에 b가 먼저 출력되고나서 더하기 1이 된다.
		  이것을 이용해 코드 한 줄 정도는 줄일 수 있겠으나,
		  권장하지 않는다.
		  정확히 코딩하는 것이 더 좋다.
*/
public class 반복문5_개념03_증감연산자 {

	public static void main(String[] args) {
		int num = 10;
		
		num++;		// 11
		++num;		// 12
		System.out.println(num);
		
		num = 10;
		int rs1 = ++num;
		System.out.println("rs1 = " + rs1);		// 11
		System.out.println("num = " + num);		// 11
		
		/*
			++, -- 증감연산자가
			(1) 다른 연산자와 함께 쓰이고
			(2) 증감연산자의 위치가 변수 뒤에 있으면(후위형)
			(3) 증감연산자의 역할(증가 or 감소)을
			    가장 마지막에 수행한다.
		 */
		num = 10;
		int rs2 = num++;
		System.out.println("rs2 = " + rs2);
		System.out.println("num = " + num);
		
		
		int x = 10;
		System.out.println("x = " + ++x);	// x += 1
		System.out.println("x = " + x);
		
		int y = 10;
		System.out.println("y = " + y++);
		System.out.println("y = " + y);
		
		// 위 방법들 보다는 아래 방법이
		// 코드가 한 줄 추가되더라도 훨씬 안정적이다.
		int z = 10;
		System.out.println("z = " + z);
		z = z + 1;
		System.out.println("z = " + z);
	}

}
