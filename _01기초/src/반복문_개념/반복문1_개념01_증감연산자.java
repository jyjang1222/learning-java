package 반복문_개념;
/*
# 증감식 종류
	- 아래 4종류는 모두 같은 뜻이다.
	- 미세한 차이가 있으나 추후 다시 살펴보겠다.
	
	1. i = i + 10;
	2. i += 1;
	3. i++;
	4. ++i;
	
	1. i = i - 1;
	2. i -= 1;
	3. i--;
	4. --i;
	
	1. i = i * 1;
	2. i *= 1;
	
	1. i = i / 1;
	2. i /= 1;
	
	1. i = i % 1;
	2. i %= 1;
	
*/
public class 반복문1_개념01_증감연산자 {

	public static void main(String[] args) {
		int i = 0;
		i = i + 1;
		System.out.println(i);
		System.out.println();
		
		i += 1;
		System.out.println(i);
		System.out.println();
		
		i++;
		System.out.println(i);
		System.out.println();
		
		++i;
		System.out.println(i);
		System.out.println();
	}

}
