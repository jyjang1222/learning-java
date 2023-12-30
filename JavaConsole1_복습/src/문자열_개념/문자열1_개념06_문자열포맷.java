package 문자열_개념;

public class 문자열1_개념06_문자열포맷 {

	public static void main(String[] args) {
		String[] name = { "aaa" , "bbbbbbbb" , "c"};
		int[] total = { 271 , 200, 24};
		double[] avg = new double[3];
		for(int i = 0; i < 3; i++) {
			avg[i] = (double)total[i] / 3;
		}
		// 오른쪽 정렬
		for (int i = 0; i < name.length; i++) {
			System.out.printf("[%10s] [%5d] [%6.2f]" , name[i], total[i], avg[i]);
			System.out.println();
		}
		
		// 왼쪽 정렬
		for (int i = 0; i < name.length; i++) {
			System.out.printf("[%-10s] [%-5d] [%-6.2f]" , name[i], total[i], avg[i]);
			System.out.println();
		}
		
		// String.format()은 단순 출력이 아닌 문자열로 저장하고 싶을 때 사용한다.
		String data = "";
		for (int i = 0; i < name.length; i++) {
			data += String.format("[%-10s] [%-5d] [%-6.2f]", name[i], total[i], avg[i]);
			data += "\n";
		}
		System.out.println(data);
	}

}
