package 배열_개념;

import java.util.Arrays;
/*
# 배열의 전체 값을 출력하기 쉬운방법
	예) 
		int[] arr = {1, 2, 3, 4};
	
		1단계 : import java.util.Arrays;
		2단계 : Arrays.toString(arr);
*/
public class 배열3_개념01_편한출력 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("------------");

		// Arrays.toString() 의 실제 내부는 다음과 같다.
		System.out.print("[");
		for(int i=0; i<arr.length; i++) {
			if(i < arr.length-1) {
				System.out.print(arr[i] + ", ");
			}else {
				System.out.print(arr[i]);
			}			
		}
		System.out.print("]");	
		System.out.println();		
	}

}
