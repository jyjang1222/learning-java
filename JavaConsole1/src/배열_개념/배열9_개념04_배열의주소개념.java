package 배열_개념;

public class 배열9_개념04_배열의주소개념 {

	public static void main(String[] args) {
		int[][] darr = new int[3][];
		System.out.println(darr[0]);	// null
		System.out.println(darr[1]);
		System.out.println(darr[2]);
		
		int[] arr1 = {10,20,30,40,50};
		int[] arr2 = {1,2,3,4};
		int[] arr3 = {5,4,3,2,1};
		
		System.out.println(arr1);
		
		darr[0] = arr1;
		darr[1] = arr2;
		darr[2] = arr3;
		
		System.out.println(darr[0]);
		
		for(int i = 0; i < darr.length; i++) {
			for(int j = 0; j < darr[i].length; j++) {
				System.out.print(darr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
