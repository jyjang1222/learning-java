package 메서드_개념;

import java.util.Arrays;

class Test06 {
	void changeValueInArray(int [] arr) {
		arr[1] = 100;
	}
}

public class 메서드1_개념06_기본이론6 {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		
		Test06 t6  = new Test06();
		// 배열은 주소이기때문에 바뀐다.(아주중요하다.)
		t6.changeValueInArray(arr);		
		System.out.println(Arrays.toString(arr));
	}

}
