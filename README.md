# 1. 기본이론
## 단축키
### Eclipse
```
패키지익스플로러 : Ctrl + M
창닫기 : Ctrl + W
이동 : Alt + 방향키(위, 아래)
복제 : Ctrl + Alt + 방향키
삭제 : Ctrl + D
undo : Ctrl + Z
redo : Ctrl + Y
자동완성 : Ctrl + Spacebar
확대축소 : Ctrl + +,-
실행 : Ctrl + F11
getter, setter메서드 자동완성 : alt + shift + s, r
```

### IntelliJ
```
코드 라인 복사: Command + D
해당 테스트 실행: Control + Shift + R
자동 완성: Control + Space
주석: Command + /
라인 삭제: Command + Backspace
한줄 단위로 코드 이동: Option + Shift + 화살표(상, 하)
생성자/Getter/Setter/toString 만들기: Control + Enter
```
## Java class, method 선언 시 표현 순서
1. Annotations 2. 접근자 (public/protected/private) 3. abstract 4. static 5. final
6. transient 7. volatile 8. default 9. synchronized 10. native 11. strictfp

출처 : https://www.oracle.com/java/technologies/javase/codeconventions-fileorganization.html#1852

## 서식문자
```java
/*
출력문의 종류
1. println()
2. print()
---------------------
3. printf()
1) f = format(서식)
2) 서식 문자의 종류 (어떤 형식으로 출력할지 결정)
	%알파벳
	%d		decimal,정수
	%f		float,실수
	%c		character,문자한개
	%s		String,문자여러개
*/
System.out.printf("%d", 10);
System.out.println(3.14142454235345325); //3.141424542353453
System.out.printf("%10.2f", 3.14142454235345325); //3.14
System.out.printf("%.0f", num2); //3
System.out.printf("%c", 'A');
System.out.printf("%d%% + %d%% = %d%%", 50, 50, 100); //50% + 50% = 100%
```

## 이스케이프 문자
```java
/*
이스케이프 문자 \
		
(1) \알파벳 = 기능
(2) 종류
	\n = new line(줄바꿈)
	\t = tab
	\"
	\'
*/
System.out.println("안녕\n하세요");
System.out.println("안녕\t하세요");
System.out.println("\"Hi\"");
System.out.println("\'Hi\'");
```

# 2. 변수
## 변수의 크기와 종류
```java
// 1. 정수 : int, long
System.out.println("[정수]");
		
// int는 -21억에서 21억의 값만 저장 가능하다.
// 더 큰 값을 저장하고 싶으면 long을 사용한다.
		
// long을 사용할 때는 long의 약자인 L을 숫자 뒤에 붙여준다. (int와 구분하기 위함)
long b = 3000000000L;
		
// 2. 실수 : float(작은 실수), double(큰 실수)
// 소수점은 최대한 정확히 표현하는 것이 좋기 때문에
// float 보단 double을 사용한다.
float c = 1.1234567891234F;		// float도 double과 구분을 위해 F를 붙여준다.
double d = 1.1234567891234;		// double도 한계가 있지만 float 보단 큰 수를 저장할 수 있다.
```

## 상수
```java
final int NUM = 20; // 상수는 대문자로 선언
final int MAX = 30;
```

## 자료형 변환
```java
// 1. 자동 형변환
// 만약에 실수 + 정수를 하면 내부적으로 정수를 실수로 자동 형변환을 한다.
// 예) 10 + 3.0 => 10.0 + 3.0
System.out.println("[자동 형변환]");
System.out.println(10 + 3.0);
		
// 2. 강제 형변환
// 자료형이 다른 변수끼리 연산이 필요할 때는 강제로 형변환을 해야 한다.
// 방법) (형변환타입)변수
System.out.println("[강제 형변환]");
int x = 10;
int y = 3;
		
double result1 = x / y;
double result2 = (double)x / y;
```

## 입력과 랜덤
```java
import java.util.Scanner;
import java.util.Random;

Scanner scan = new Scanner(System.in);
System.out.print("나이를 입력하세요 : ");
int age = scan.nextInt();
System.out.println("당신의 나이 = " + age + "세");
scan.close();

Random ran = new Random();
int rNum = ran.nextInt(3); // 0 ~ 2
```
# 3. 반복문
## 문법
```java
String[] test = {"aaa" , "bbb" , "ccc"};
		
for (int i = 0; i < test.length; i++) {
	String str = test[i];
	System.out.println(str);
}
		
for (String str : test) {
	System.out.println(str);
}
		
int[] test2 = {1, 2, 3};
for (Integer num : test2) {
	System.out.println(num);
}
```

# 4. 배열
## 선언방법
```java
import java.util.Arrays;

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
```

# 5.문자열
## 문자열 비교
```java
/*
문자들은 기본적으로 숫자를 가지고있다.
compareTo는 빼기를 의미한다.
"a"가 숫자 97이라면 "b"는 98이다.
a에서 b를 뺀다면, 음수가 나올것이다.
*/
String str1 = "가";		
String str2 = "나";		
		
int rs1 = str1.compareTo(str2);
System.out.println(rs1);			// 음수
		
int rs2 = str2.compareTo(str1);
System.out.println(rs2);			// 양수
		
String str3 = "가";
int rs3 = str1.compareTo(str3);
System.out.println(rs3);			// 0
```

## 문자열 함수
1. 문자열의 길이 : length()
2. 문자 한 개 추출(인덱싱) : charAt(index)
3. 문자 여러개 추출(슬라이싱) : substring(index), substring(index1, index2)
4. split(구분자 문자) : 구분자로 잘라내어 배열에 저장
5. trim() : 앞뒤 공백 제거
6. replaceAll("기존단어","대체단어") : 문자열 변경

## 형변환
```java
// 1. 기본 자료형 형변환하는 방법 : (자료형)변수
// * 문자 -> 숫자
char ch = 'a';
int chNum = (int)ch;	// 97
		
ch = (char)(chNum + 1);    //b
		
// 2. 문자열 형변환하는 방법 : 특수함수를 사용해야한다.
// * 문자열 -> 숫자
String strNum = "10";
int num = Integer.parseInt(strNum);
System.out.println(num + 1);		// 11
		
// * 숫자 -> 문자열
// 방법1) 꼼수
strNum = num + "";
System.out.println(strNum + 1);		// 101
		
// 방법2) 정식
strNum = String.valueOf(num);
System.out.println(strNum + 1);		// 101
```

## 문자열 포맷
```java
String[] name = { "aaa" , "bbbbbbbb" , "c"};
int[] total = { 271 , 200, 24};
double[] avg = new double[3];
for(int i = 0; i < 3; i++) {
	avg[i] = (double)total[i] / 3;
}

// 오른쪽 정렬, - 는 왼쪽 정렬 
for (int i = 0; i < 3; i++) {
	System.out.printf("[%10s] [%-5d] [%-6.2f]", name[i], total[i], avg[i]);
	System.out.println();
}

// String.format()은 단순 출력이 아닌 문자열로 저장하고 싶을 때 사용한다.
String data = "";
for(int i = 0; i < 3; i++) {
	data += String.format("[%-10s] [%-5d] [%-6.2f]",name[i] , total[i] , avg[i]);
	data +="\n";
}
```

## 문자열 입력
```java
String data = scan.next();
// scan.next ==> space 인식불가
scan.nextLine(); 

String data2 = scan.nextLine();
//scan.nextLine ==> space 인식

// 1) next와 nextLine을 동시에 사용하면 엔터가 먹힌는 경우가 발생된다.
// 2) 그럴경우 next 뒤에 아무내용없는 nextLine을 하나 적어준다.
```

## 오버로딩, 오버라이딩
### 메서드 오버로딩 overloading
```java
class MethodOverloding {
	void test(int a) {}
	void test(int a , int b) {}
	void test(String a) {}
}
```
- 메서드 오버로딩은 같은 이름의 메서드를 사용할 수 있는 기능이다.
- 메서드의 이름이 같아도 전달되는 값이 다르다면 서로 다른 메서드로 인식한다.

### 메서드 오버라이딩 overriding
```java
class MethodOverriding {
	void test() {
		System.out.println("testParent");
	}
	void overridTest() 
	{
		System.out.println("overridTestParent");
	}
}

class Child extends MethodOverriding {
	void overridTest() // 메서드 재정의
	{
		System.out.println("overridTestChild");
	}
}

public class 상속_개념07_오버라이딩 {
	public static void main(String[] args) {
		Child c = new Child();
		c.test();
		c.overridTest(); // 부모의 메서드는 실행되지않고 자식의 메서드가 우선순위를 가져간다.
	}
}
```
- 메서드 오버라이딩은 부모 클래스에 있는 메서드를 자식 클래스가 같은 이름으로 메서드를 만들어서 사용하는 것이다. (메서드 재정의)
- 대표적인 예가 equals() 메서드. String클래스가 Object클래스를 상속받아 equals메서드를 재정의한 것.
- 부모의 메서드는 실행되지않고 자식의 메서드가 우선순위를 가져간다.

