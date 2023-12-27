package 배열_개념;
/*
# 배열(array)
	1. "같은 종류"의 데이터를 "여러개" 저장하기 위한 기술
	 cf.여러 종류의 데이터를 여러개 저장하기 위한 기술 = 클래스
	
	2. 선언법
		- [] 대괄호의 위치는 앞, 뒤 어디든 상관없다.
		int[] array = new int[방의 개수];
		int array[] = new int[방의 개수];
	
	3. 인덱스(index)
		- 0부터 시작하는 방번호(index)가 부여된다.
		- 방 번호는 순차적으로 1씩 증가한다.
		예) 
			int[] array = new int[5];
			방 번호는 0, 1, 2, 3, 4
	4. 배열의 초기화
		int num = 0;
		int[] array = null;
		- 배열은 null을 사용한다.
	
	5. 배열의 각각의 변수의 초기화
		- 정수형 배열은 자동으로 변수에 0을 저장한다.
		- 실수형 배열은 자동으로 변수에 0.0을 저장한다.
		- 논리형 배열은 자동으로 변수에 false를 저장한다.
		
	6. 사용법
		- 각각의 방 번호를 이용해서 값을 저장한다.
		예)
			array[0] = 1;
			array[0] = 2;
	
	7. 없는 방을 사용하면 에러가 발생한다.
		예)
			array[10] = 10;		// 에러
*/
public class 배열1_개념01_기본이론 {

	public static void main(String[] args) {
		// 1. 일반 변수의 값 저장법
		int num = 0;
		num = 10;
		System.out.println("num = " + num);
		
		System.out.println("------");
		
		// 2. 배열
		int[] array = null;		// 배열은 null을 0대신 사용한다.
		array = new int[5];		// 변수 5개가 생겨나고 기본 값 0이 저장된다.(자동으로 저장)
		
		// [I@626b2d4a
		System.out.println(array);
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		
		System.out.println("------");
		
		// 각각의 변수에 값을 저장한다.
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		
		for(int i=0; i<5; i++) {
			System.out.println(array[i]);
		}
		System.out.println("------");
		
		// 없는 방에 값을 저장하고 출력하면 에러가 발생한다.
		// java.lang.ArrayIndexOutOfBoundsException: 
		// Index 5 out of bounds for length 5
		// array[5] = 100;
		// System.out.println(array[5]);
		
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		int e = 50;
		
		int[] array2 = new int[4];
		int[] array3 = null;
		array3 = new int[3];
		
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
	}

}
