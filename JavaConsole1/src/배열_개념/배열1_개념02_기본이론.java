package 배열_개념;

public class 배열1_개념02_기본이론 {

	public static void main(String[] args) {
		// 1. 배열 사용법(1)
		int[] array = new int[3];
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		
		for(int i=0; i<3; i++) {
			System.out.println(array[i]);
		}
		System.out.println("-------");
		
		// 2. 배열 사용법(2)
		// 아래는 축약형으로 위와 동일한 결과이다.
		
		// int[] temp = new int[3];
		// temp[0] = 10;
		// temp[1] = 20;
		// temp[2] = 30;
		
		int[] temp = {10, 20, 30};
		for(int i=0; i<3; i++) {
			System.out.println(temp[i]);
		}
		System.out.println("-------");
		
		// 3. 단, 축약형은 처음에 한번만 적용되고, 그 이후 값을 변경하고 싶으면 직접 저장해야 한다.
		// 다음과 같이 사용할 수 없다.
		// temp = {40, 50, 60};
		
		temp[0] = 40;
		temp[1] = 50;
		temp[2] = 60;
		for(int i=0; i<3; i++) {
			System.out.println(temp[i]);
		}	
	}

}
