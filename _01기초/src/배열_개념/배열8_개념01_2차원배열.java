package 배열_개념;

import java.util.Arrays;

public class 배열8_개념01_2차원배열 {

	public static void main(String[] args) {
		int[] temp = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(temp));
		System.out.println(temp.length);
		
		int[][] arr = new int[2][3];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		System.out.println();

		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		for(int i=0; i<2; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		System.out.println(arr.length);		// 행의 길이
		System.out.println(arr[0].length);	// 열의 길이
		System.out.println(arr[1].length);
	}

}
