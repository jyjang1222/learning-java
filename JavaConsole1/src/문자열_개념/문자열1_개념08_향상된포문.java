package 문자열_개념;

public class 문자열1_개념08_향상된포문 {

	public static void main(String[] args) {
		String[] test = {"aaa" , "bbb" , "ccc"};
		
		for(int i = 0; i < test.length; i++) {
			String str = test[i];
			System.out.println(str);
		}
		
		for(String str : test) {
			System.out.println(str);
		}
		
		int[] test2 = {1, 2, 3};
		for (Integer num : test2) {
			System.out.println(num);
		}
	}

}
