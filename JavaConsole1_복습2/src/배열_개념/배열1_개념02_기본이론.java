package 배열_개념;

import java.util.Arrays;
import java.util.Iterator;

public class 배열1_개념02_기본이론 {

	public static void main(String[] args) {
		int[] arr = new int[3];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i * 10;
		}
		System.out.println(Arrays.toString(arr));
		
		int[] arr2 = {1, 2, 3};
		double[] arr3 = {1.1, 1.2, 1.3};
		boolean[] arr4 = {true, false};
		char[] arr5 = {'m', 'i', 'k', 'e'};
		
		int[][] arr6 = new int[2][2];
		
		for (int[] array : arr6) {
			System.out.println(Arrays.toString(array));
		}
		
		int[] arr7 = null;
		arr7 = new int[2];
	}

}
