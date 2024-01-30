# 0. 자바 설치
1. 자바 언어 https://youtu.be/9uJQHdtwmBs
2. 확인 : c > program > java
	- jdk = java development kit
	- jre = java runtime environment 
3. 이클립스(eclipse) https://youtu.be/o09bJ7KQW3U
	- 설치형
 	- 압축해제형 
4. 이클립스에서 Java파일 생성
	- 프로젝트 (Java Project)
	- 패키지 (Package)
 	- 클래스파일 (class)

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
## 기본개념
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

## 주의점
```java
class Test06 {
	void changeValueInArray(int [] arr) {
		arr[1] = 100;
	}
}

public class 메서드1_개념06_기본이론6 {
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		
		Test06 t6  = new Test06();
		
		// 배열은 주소이기 때문에 값이 바뀐다.
		t6.changeValueInArray(arr);
		System.out.println(); // 10 100 30 40 50 
	}
}
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

## 문자열 배열
```java
int[] arr = new int[3];	// 0으로 초기화
double[] arr2 = new double[3]; 	// 0.0
String[] temp = new String[3];	// null
```

# 6. 클래스
## 기본개념
```java
package 클래스_개념;
/*
	클래스 : 객체를 생성하기위한 설계 틀
	객체 : 인스턴스 집합
	인스턴스 : new키워드를 사용해서 메모리에 올라간 상태인 하나의 객체
*/
class Member {
	int number;
	String id;
	String pw;
	String name;
	int score;
}

class Test01 {
	int x;
	int y;
}

public class 클래스1_개념01_클래스1 {
	public static void main(String[] args) {
		Member member = new Member();
		member.number = 1; //디폴트 초기화값 0
		member.id = "qwer"; //디폴트 초기화값 null
		member.pw = "1234";
		member.name = "김철수";
		member.score = 30;
	}
}
```
```java
package 클래스_개념;

class Test02 {
	String name;
	int score;
}
public class 클래스1_개념02_클래스2 {
	public static void main(String[] args) {
		Test01 t1 = new Test01();
		t1.x = 10;
		t1.y = 20;
		
		Test02 t2 = new Test02();
		t2.name = "홍길동";
		t2.score = 87;
	}
}
```
- 같은 패키지 안의 클래스는 다른 클래스에서 사용할 수 있다.	
- 같은 패키지 내에서는 클래스를 중복해서 사용할 수 없다.

## 인스턴스 변수
```java
class Test {
	// 클래스 영역 = 메서드 밖 영역
	// 인스턴스 변수는 값이 자동 초기화
	// int(0), double(0.0), String클래스(null), 배열(null), boolean(false)
	int x;
	int y;
	
	void print() {
		// 메서드 안 영역
		// 지역 변수(노란색)
		// 지역 변수는 값의 자동 초기화가 X
		// 반드시 선언과 동시에 값을 초기화해줄 것을 권장
		int result = x + y;
		System.out.println(result);
		System.out.println(x);
	}
}
```

## 클래스 배열
```java
class Product{
	String name;
	int price;
	
	void init(String name , int price) {
		this.name = name;
		this.price = price;
	}
	
	void printData() {
		System.out.println(name + " " + price);
	}
}

public class 메서드클래스배열4_개념01_기본이론1 {
	public static void main(String[] args) {
		// 클래스 = 사용자 정의 데이터 타입
		int[] list = new int[2];
		
		// Product 클래스 데이터타입을
		// 저장할 방 2개를 생성해줘
		// * 아직 Product 인스턴스가 생성된 것은 X
		Product[] prList = new Product[2];
		System.out.println(prList[0]);	// null
		System.out.println(prList[1]);	// null
		
		// 아래 두 줄의 코드를 잊지말고 꼭 작성하자!
		prList[0] = new Product();
		prList[1] = new Product();
	}
}
```

## 가비지컬렉터 (Garbage Collector)
```java
import java.util.Scanner;

class Sample01 {
	int a;
	int b;
}

Scanner scan = new Scanner(System.in);
		
Sample01 s1 = new Sample01(); //garbage 데이터
s1 = new Sample01();
s1.a = scan.nextInt();
		
// s1 = null;		
		
// s1을 null로 저장하지 않아도
// GC(Garbage Collector)가 알아서 메모리를 해제해준다.
s1 = new Sample01();
		
scan.close();
```

# 7. 메서드
## 기본개념
```java
/*
# 메서드 기본구조
(1) 정의
	1) void			: 키워드
	2) setNums		: 이름
	3) (int a , int b )	: 전달된 값을 저장하는 변수(매개변수, parameter)
	3) { 기능 }		: 실행되는 영역
(2) 사용법
	1) test1.setNums(10, 20);
	2) test1		: 클래스 변수명
	3) .setNums		: .메서드명
	4) (10, 20);		: (전달할 값); (인자, argument)
*/
class Test03 {
	int num1;
	int num2;
	
	void setNums(int a , int b) {
		num1 = a;
		num2 = b;
	}
	void printNums() {
		System.out.println(num1 + " " + num2);
	}
}
public class 메서드1_개념03_기본이론3 {
	public static void main(String[] args) {
		// main() 메서드는 가장 먼저 호출되어 Stack메모리에 쌓인다.
		// 아래와같이 값을 저장해서 출력 할수도있지만.
		// 메서드를 만들어서 사용할수도있다.
		Test03 test1 = new Test03();
		test1.num1 = 10;
		test1.num2 = 20;
			
		Test03 test2 = new Test03();
		test2.setNums(10, 20);
		test2.printNums();
	}
}
```

## 인스턴스를 메서드 인자로 활용 예제
```java
class Data {
	int a;
	int b;
	String op;
	int res;
	void setData(int a, int b) {
		this.a = a;
		this.b = b;
	}
	void print() {
		System.out.printf("%d %s %d = %d\n", a, op, b, res);
	}
}

class Calc {
	void plus(Data data) {
		data.op = "+";
		data.res = data.a + data.b;
	}
	void minus(Data data) {
		data.op = "-";
		data.res = data.a - data.b;
	}
}

public class 메서드1_개념07_기본이론7 {
	public static void main(String[] args) {
		Data data1 = new Data();
		data1.setData(1, 2);
		Calc calc1 = new Calc();
		// data1 는 new Data() 의 주소가 들어있기때문에 값 변경이 가능하다. 
		calc1.plus(data1);
		data1.print();
		calc1.minus(data1);
		data1.print();
	}

}
```

## 메서드 리턴
```java
class TestReturn2_1 {
	int result;
	// return값이 없으면 void로 선언
	void plus(int a , int b) {	// 메서드의 선언부 
		result = a + b;		// 메서드의 구현부
		// return; return 메서드 종료, void일 경우에는 return생략가능
	}
}

class TestReturn2_2 {
	int plus(int a , int b) {
		// result 변수가 없어도 기능을 만들수있다. 
		return a + b;
	}
}
```
1. 리턴 사용방법
- return 메서드를 사용하면 클래스내의 변수한개를 줄일수있다.
- 굳이 쓰지않아도 프로그램 만드는데는 아무런지장이 없다. 
- 하지만 프로그래밍이 능숙해지면 자연히쓰게된다.
2. 리턴메서드 만드는법
- int 			  ==> main 으로 보낼 자료형 
- plus(int a , int b)     ==> 이름 
- { return + 내보낼 값 }   ==> 이값은 main 으로 보내진다.   

## 디자인 패턴 (getter, setter)
```java
class Student1 {
	private String name;
	private int age;
	
	public Student1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// getter, setter메서드 자동완성 단축키
	// alt + shift + s, r
	// 변수 하나당 get, set 메서드를 한세트로 작성하는 것을 권장
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

public class 캡슐화_개념02_기본이론2 {
	public static void main(String[] args) {
		Student1 st1 = new Student1("홍길동", 11);
		System.out.println(st1.getName());
		System.out.println(st1.getAge());
	}
}
```

## 오버로딩, 오버라이딩
### 메서드 오버로딩 (overloading)
```java
class MethodOverloding {
	void test(int a) {}
	void test(int a , int b) {}
	void test(String a) {}
}
```
- 메서드 오버로딩은 같은 이름의 메서드를 사용할 수 있는 기능이다.
- 메서드의 이름이 같아도 전달되는 값이 다르다면 서로 다른 메서드로 인식한다.

### 메서드 오버라이딩 (overriding)
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
- 메서드 오버라이딩은 상속 관계에서 적용된다.
- 부모 클래스에 있는 메서드를 자식 클래스가 같은 이름으로 메서드를 만들어서 사용하는 것이다. (메서드 재정의)
- 대표적인 예가 equals() 메서드. String클래스가 Object클래스를 상속받아 equals메서드를 재정의한 것.
- 부모의 메서드는 실행되지않고 자식의 메서드가 우선순위를 가져간다.

# 8. 예외처리
## try, catch, finally
```java		
try {
	// 에러가 발생할 코드 작성
	System.out.println(10 / 0);
} catch (Exception e) {
	// try영역에서 에러가 발생하면 실행할 영역
	// 모든 에러를 다 잡아주는 Exception을 보통 사용한다. 
	System.out.println("0으로 나눌수 없습니다");
	e.printStackTrace();
} finally {
	// finally 는 에러 유무 상관없이 무조건 실행된다.
	// 코드가 잘 작동했는지 확인 할때 쓴다. (안내문구용)
	System.out.println("나누기가 성공적으로 실행됬습니다.");
	System.out.println("예외발생과 상관없이 무조건 실행할 문장을 적는다.");
}
```

## throws Exception
```java
//일반적으로 메서드 안에는 전부 try catch를 작성
class Test {
	// 예외처리하는 방법 2가지 (첫번째 방법 많이 사용함)
	// (1) try {} 안에  식을 적는다.
	void sample1() {
		try {
			int a = 10 / 0;
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	// (2) 메서드 이름 옆에 throws Exception 을 적는다.
	//     조건) 대신, 메서드 호출할때 try{}로 감싸줘야한다. 
	void sample2() throws Exception { //호출시 무조건 예외(Exception) 발생
		int a = 10 / 0;
	}
}

public class 예외처리_개념06_기본이론6 {
	public static void main(String[] args) {
		Test t = new Test();
		
		t.sample1();
		System.out.println("test");
		
//		t.sample2(); 오류발생
		try {
			t.sample2();
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("test2");
	}
}
```

## Thread.sleep
```java
// [1] Thread.sleep(밀리세컨즈)
// [2] () 안에 넣은 값만큼 일시정지된다. 
// [3] 밀리세컨즈이기때문에 1000 이 1초이다. 
// [4] 이걸활용해서 동적프로그램을 만들수있다. (GUI 에서 활용)
		
try {
	// java.lang 패키지내 클래스는 import하지 않고 사용가능 (System, Thread 등)
	// Thread.sleep은 try catch로 예외처리를 해주어야 함. (예외처리 방법2 참고)
	System.out.println("test");
	Thread.sleep(1000);			
	System.out.println("test");
} catch(Exception e) {
	e.printStackTrace();
}
```

# 9. 파일입출력
## FileWriter
```java
import java.io.FileWriter;

// 세이브 파일 만들기 FileWriter
// 1) 변수생성          	==>  FileWriter fw = null; 
// 1) 파일 생성          ==>  fw = new FileWriter("파일이름"); 
// 2) 파일에 내용 저장 	==>  fw.write(저장할내용);
// 3) 파일닫기           ==>  fw.close(); 
		
String path = "src/파일입출력_개념/";
String fileName = "file1.txt"; //프로젝트 폴더에 생성됨
		
FileWriter fw = null;// try 밖에서 사용을 위해 보통 밖에 변수를 만든다.
		
try {
	fw = new FileWriter(path + fileName);
	fw.write("김철수,10\\\\n이영희,30\\\\n박만수,50");
	fw.close();
} catch(Exception e) {
	e.printStackTrace();
}
```

## FileReader
```java
import java.io.FileReader;

// 1) FileReader fr = null; 		// 변수선언
// 1) fr = new FileReader(fileName); 	// 저장된 파일을 읽어온다.	
// 2) fr.read(); 			// 한글자씩 int로 가져온다. 								// 가져올 내용이 없으면 -1이 저장된다.
// 3) fr.close(); 			// 사용후 반드시 닫아야 된다.
		
String fileName = "src/파일입출력_개념/file1.txt";
String data = "";
		
FileReader fr = null;
		
try {
	fr = new FileReader(fileName); //  저장된 파일을 읽어온다.
			
	while (true) {
		int read = fr.read(); // read() 한글자씩 int 로 가져온다.
		if (read != -1) {
			data += (char)read;
		} else {
			break;
		}
	}
	fr.close();
} catch(Exception e) {
	e.printStackTrace();
}
		
System.out.println(data);
```

## File
```java
import java.io.File;
import java.io.FileReader;

String fileName = "src/파일입출력_개념/file.txt";
String data = "";

FileReader fr = null;
File file = new File(fileName);
		
// file.exists() 파일존재 여부 boolean 값 반환
if (file.exists()) {
	try {
		fr = new FileReader(fileName);
		
		while (true) {
			int ch = fr.read();
					
			if (ch != -1) {
				data += (char)ch;
			} else {
				break;
			}
		}
		fr.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
} else {
	System.out.println("불러오기 실패");
}
```

# 10. 생성자
## 방법
```java
/*
 * # 생성자(constructor)
 * 1. 생성자는 반드시 클래스 이름과 같아야 한다.
 * 2. 생성자는 new 클래스명(); 이때 호출된다.
 * 3. 생성자는 인스턴스 변수를 초기화 시킬 목적으로 사용한다.
 * 4. 생성자를 정의하지 않으면, 자바 컴파일러가 자동으로 기본 생성자를 만든다.
 * 5. 기본생성자란, 매개변수에 아무것도 없는 생성자를 의미한다.
 * 6. 생성자는 리턴타입을 가지지 않고 return도 사용하지 않는다.(메서드와의 차이점)
 * 7. 생성자를 재정의하면 기본 생성자는 자동으로 만들어지지 않는다.
 * 8. 보통은 setter를 통해 초기화를 하고 스프링까지 배우면 생성자는 잘안쓰게된다.
*/
class Toy {
	String name;
	int price;
	
	// 기본생성자 (생략가능)
	Toy () {
		name = "박스";
		price = 1000;
	}
	
	// 생성자 재정의 (오버로딩)
	Toy (String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	void setData(String name, int price) {
		this.name = name;
		this.price = price;
	}
	String getData() {
		return name + String.valueOf(price);
	}
}

public class 생성자_개념01_기본이론1 {
	public static void main(String[] args) {
		Toy toy1 = new Toy();
		
		// 방법1 속성에 직접 값입력을 해서 초기화
		toy1.name = "인형";
		toy1.price = 1000;
		
		// 방법2 메서드를 통해 초기화
		toy1.setData("로봇", 2000);
		
		// 방법3 생성자를 통해 초기화
		Toy toy2 = new Toy("인형", 2000);
	}
}
```

# 11. 캡슐화
## 접근제어자
```java
class Test01 {
	// 접근제어자란 클래스, 변수, 메서드를 외부의 사용자가 접근할 때 제한을 두겠다는 의미
	// 접근제어자 : public(공공의), protected(추후 설명), default(접근제어자가 없는 상태), private(개인의)
	// (접근 가능 범위가 넓은 순)
	private int a;
	private int b;
	
	// 접근제어가 없는 것을 default 라고 부른다.
	// 지금까지는 접근제어자를 사용하지 않았지만, 정확하게 명시해주는 것이 좋다.
	// 이제부터 아무것도 안적는것은 권장하지않는다.
	int c;
	
	// public은 어느 클래스에서도 접근가능한 것
	// public을 사용하면 다른 패키지일지라도 클래스를 사용가능
	public int d;
	
	// 일반적으로 변수를 선언할 때에는 변수에는 private을 작성하고
	// 메서드에는 public 키워드를 작성한다
}

Test01 t = new Test01();
// 1. private을 붙인 변수는 클래스 내부에서만 사용이 가능하다.
// 2. 다른 클래스에서는 사용할 수 없다.
// The field Test01.a is not visible (field는 변수)
// t.a = 10;	// 에러
// t.b = 20;	// 에러
		
t.c = 30;
t.d = 40;
```
- 접근제어자 : public(공공의), protected(추후 설명), default(접근제어자가 없는 상태), private(개인의)

## 접근제어자2
```java
package 캡슐화_개념;

public class 접근제어자_개념01_기본이론1 {
	private int a;
	public int b;
	protected int c;
	int d; // default 는 사용하지않는게 좋다.
}
```
```java
package 캡슐화_개념;

public class 접근제어자_개념02_기본이론2 {
	public static void main(String[] args) {
		접근제어자_개념01_기본이론1 t = new 접근제어자_개념01_기본이론1();
		// t.a = 10; // private 은 내부 클래스 에서만 사용가능 	
		t.b = 10; // 같은패키지에 있으면 public 사용가능
		t.c = 20; // 같은패키지에 있으면 protected 사용가능
		t.d = 30; // 같은패키지에 있으면 default 사용가능
	}
}
```
```java
package 실습;

import 캡슐화_개념.접근제어자_개념01_기본이론1;

class L2_Child extends 접근제어자_개념01_기본이론1 {
	public L2_Child() {
		//a = 10; //private 이므로 접근 불가
		b = 20; //public 이므로 어느클래스에서나 사용가능
		c = 30; //protected 이므로 서로다른 패키지이지만 상속받은 자식클래스 내에서는 public
		//d = 40; //default 는 패키지가 달라지면 private 이므로 private
	}
}

public class 접근제어자_개념03_실습예제 {
	public static void main(String[] args) {
		L2_Child child1 = new L2_Child();
		child1.b = 10;
		//child1.c = 20; 접근불가
	}
}
```
- public : 프로젝트내 모든 클래스에서 사용가능
- protected  : 패키지가 같으면 public, 패키지가 다르면 자식클래스내에서는 public, 자식클래스내가 아니면 private
- default : 패키지가 같으면 public, 패키지가 다르면 private
- private : 내부 클래스에서만 사용가능, 타 클래스에서 사용불가

# 12. 스태틱
## 스태틱 활용 예제1
```java
class Test01 {
	public int a;			// non-static 변수 = 인스턴스 변수 (new할시 초기화)
	public static int b;		// static 변수	  = 클래스 변수 (0으로 초기화)
	
	static void test() {
		System.out.println("!!");
	}
}

public class 스태틱1_개념01_기본이론1 {
	public static void main(String[] args) {
		// static 키워드 
		// static키워드가 붙은 변수와 메서드는 실행하면 바로 static 메모리영역에 할당이 돼서
		// new 를 하지 않아도 사용할 수 있다.
		// 스태틱 메서드는 호출시에 stack에 올라감
		
		// static으로 생성한 변수에 접근하는법
        	// 클래스명.변수명  ==> Test01.b
		Test01.b = 10;
		Test01 t1 = new Test01();
		t1.a = 20; // 인스턴스변수는 new키워드를 사용해 stack에 올라가야 값 변경 가능
	}
}
```
- 스태틱을 사용하면
	- 변수는 하나의 변수로 데이터가 공유 된다. 클래스명.변수명
	- 메서드는 인스턴스를 통해 메서드를 호출하지 않고 바로 사용가능하다. 클래스명.메서드명

- 스태틱을 사용하지 않으면
	- 변수는 각각의 인스턴스가 개별적으로 데이터를 갖게 된다. 인스턴스1.변수, 인스턴스2.변수
	- 메서드는 new키워드를 사용하여 생성된 인스턴스를 통해 메서드를 호출해야한다. 인스턴스.메서드()

## DTO, DAO
### DTO (Data Transfer Object)
- 데이터 전송 객체
- 계층(Layer)간 데이터를 주고받기 위한 객체
- 계층(Layer)란 Controller, View, Business, Persistent 레이어 등을 말한다
- 일반적으로 DB에서 가져온 데이터를 다른 계층에서 사용하기 적합한 형식으로 변환하여 전송하는데 사용
- DTO 속성은 getter / setter 메서드로 구성
- 데이터 전송에만 사용
### DAO (Data Access Object)
- 데이터 접근(액세스) 객체(DB의 data에 접근하기 위한 객체)
- DB에서 데이터를 가져오거나 DB에 데이터를 저장하는 등 CRUD작업을 수행하는 객체
- 비즈니스 계층과 DB 간의 인터페이스 역할
- DAO를 static 으로 만들면 편하다.
- DTO와 DAO는 항상 한세트로 만든다고 생각하면된다

## static, DTO, DAO 활용 예제
```java
class Client {
	private int num;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
}

class staticClientDAO {
	public static Vector<Client> clientList = new Vector<Client>();
	public static void addClient(Client c) {
		clientList.add(c);
	}
}

public class 스태틱1_개념03_기본이론3 {
	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			Client c = new Client();
			c.setNum(i);
			staticClientDAO.addClient(c);
		}
		
		for (Client c : staticClientDAO.clientList) {
			System.out.println(c.getNum());
		}
	}
}
```

## 스태틱 활용시 주의 할점 예제
```java
class StaticTest {
	private static int score; // 내용이 담긴 변수는 static 으로 만들면 공유되어 버린다.
	private static String name;
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		StaticTest.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		StaticTest.name = name;
	}
}

class StaticTestDAO {
	public static Vector<StaticTest> testList = new Vector<StaticTest>();
	
	public static void addTest(StaticTest test) {
		testList.add(test);
	}
	public static void printTestList() {
		for (StaticTest test : testList) {
			System.out.print(test.getName());
			System.out.println(" " + test.getScore());
		}
	}
}

public class 스태틱1_개념02_기본이론2 {
	public static void main(String[] args) {
		/*
		 * [스태틱 활용시 주의 할점] DAO 는 static 으로 만들어도되지만 
		 * 객체는 개수를 따로count 하는 변수를 제외하곤 실제
		 * 내용이 들어가는 변수를 static으로 만들면 안된다.
		 */
		String[] dataName = { "aaa", "bbb", "ccc", "ddd" };
		int[] dataScore = { 43, 54, 12, 94 };
		
		for (int i = 0; i < dataName.length; i++) {
			StaticTest t = new StaticTest();
			
			t.setName(dataName[i]);
			t.setScore(dataScore[i]);
			
			StaticTestDAO.addTest(t);
		}
		StaticTestDAO.printTestList();
	}
}
```

## 스태틱 활용 예제2
```java
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
```

# 13. 상속
## 기본문법
```java
class A1 {
	int a;
	int b;
}
class B1 {
	A1 A = new A1();
	int c;
	int d;
}
class C1 extends A1 {
//	int a;
//	int b;
	int e;
	int f;
}
class Test1 extends Random{}

public class 상속_개념02_기본이론2 {
	public static void main(String[] args) {
		A1 A = new A1();

		// 상속문법을 사용하지않고 상속같은 관계만들기
		B1 B = new B1();
		B.A.b = 10;
		
		C1 C = new C1();	
		C.b = 10;

		Test1 t1 = new Test1();
		int r1 = t1.nextInt(100);
	}
}
```
- 상속 : 자식클래스 extends(키워드) 부모클래스 {}
- 상속을 받게되면 마치 자기클래스안의 변수처럼 자유롭게 사용할수있다. 
- 상속은 한번만 받을수있다.

## 중첩상속
```java
class AA{
	int aa;
}
class BB extends AA {
	int bb;
}
class CC extends BB {
	int cc;
}

public class 상속_개념05_중첩상속 {
	// 클래스당 상속은 1번만 가능하다.
	// 상속이 여러개 필요한경우 줄줄이 상속해야한다. 
	public static void main(String[] args) {	
		CC cc = new CC();
		
		// 상속을 받으면 부모변수를 마치 자기변수 처럼 사용할수있다.
		cc.aa = 10;
		cc.bb = 20;
		cc.cc = 30;	
	}
}
```

## Object
```java
class ExtendsTest1 extends Object {}
class ExtendsTest2 {}
class TestA /* extends Object */ {	
	int a;
}

public class 상속_개념06_오브젝트 {
	public static void main(String[] args) {
		TestA a = new TestA();
//		a.
		ExtendsTest1 t1 = new ExtendsTest1();
		ExtendsTest2 t2 = new ExtendsTest2();
		//t1.
		//t2.
	}
}
```
- Object 클래스는 모든 클래스의 최상위 부모 클래스 이다.
- 자바의 모든 클래스들은 자바에서 미리제공하는 Object 클래스를 내부적으로 자동으로 상속받게 되어있다.
- 변수에 .을 찍어보면 알수있다.

## 어노테이션, toString
```java
class Test05_1{	}
class Test05_2 /*extends Object*/ {	
	int a;
	int b;
	
	// @(어노테이션) 키워드
	// 기능을 가진 주석
	
	// @Override (기능을 가진 주석)
	// 작성시 부모의 선언부와 동일하게 작성해야 문법 오류가 나지 않는다.
	// 생략가능하지만 작성함으로써 엄격함 유지
	
	@Override
	public String toString()
	{
		return a + ", " + b;
	}
	
	// 기존 출력법
	public void print() {
		System.out.println(a + " , " + b);
	}
	
//	부모에 없는 메소드 위에 붙여보면 에러가난다.
//	@Override 
//	void test() {}	
}

public class 상속_개념08_toString1 {
	public static void main(String[] args) {
		// [오버라이드]		
		// 클래스 객체의 변수를 출력 하면 주소가 출력된다.
		// 원형은 변수.toString() 이지만 
		// 변수만으로도 쓸수있게 축약형을 제공한것이다.
		
		// toString() 은 Object 클래스에서 제공하는 함수로,
		// 주소를 출력해준다. 
		Test05_1 t1 = new Test05_1();		
		System.out.println(t1);
		System.out.println(t1.toString());
		// t1.toString()시 t1인스턴스 주소가 출력됨.
		// 주소를 출력하는 toString메서드를 재활용하여 사용하면 편리
				
		System.out.println("--------------------");
				
		// 부모 Object 클래스에 있는 toString() 메서드를 
		// 자식이 재활용해서 사용할수있다.
		Test05_2 t2 = new Test05_2();		
		System.out.println(t2);
		System.out.println(t2.toString());
	}
}
```

## super
```java
class Super1 {
	int s;
}
class Child1 extends Super1 {
	int a;
	
	Child1 (int s, int a) {
		this.s = s;
		this.a = a;
	}
	
	void test (int a, int s) {
		this.a = 10; //클래스영역에 있는 인스턴스 변수 사용시 this키워드
		a = 10;
		s = 10;
		super.s = 20; //부모클래스에 있는 인스턴스 변수 사용시 super키워드
		System.out.println("부모메서드");
	}
}
class Child2 extends Child1 {
	int c;
	
	Child2 (int s, int a, int c) {
		super(s, a);  // 부모의 생성자호출하는법 ()만붙여주면된다.
		this.c = c;
	}
	
	void test() {
		System.out.println("자식메서드");
	}
	void play() {
		test(); // 자식의 test()를 실행함.
		super.test(20, 20); // 부모의 test()를 실행함.
	}
	
	@Override
	public String toString() {
		return s + ", " + a + ", " + c;
	}
}

public class 상속_개념09_super1 {
	public static void main(String[] args) {
		Child2 test = new Child2(10, 20, 30);
		test.play();
		System.out.println(test.toString());
	}
}
```
