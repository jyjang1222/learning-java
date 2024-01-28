package 스태틱_개념;

class HeartCounter {
	public static int count;
	
	public HeartCounter() {
		HeartCounter.count += 1;
	}
}

public class 스태틱1_개념04_기본이론4 {
	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			HeartCounter p = new HeartCounter();
		}
		// 현재까지 생성된 좋아요 갯수를 알수있다.
		System.out.println(HeartCounter.count);
	}
}