# 목차
0. [자바 설치](#0-자바-설치)
1. [기본이론](#1-기본이론)
2. [변수](#2-변수)
3. [반복문](#3-반복문)
4. [배열](#4-배열)
5. [문자열](#5-문자열)
6. [클래스](#6-클래스)
7. [메서드](#7-메서드)
8. [예외처리](#8-예외처리)
9. [파일입출력](#9-파일입출력)
10. [생성자](#10-생성자)
11. [캡슐화](#11-캡슐화)
12. [스태틱](#12-스태틱)
13. [상속](#13-상속)
14. [추상화](#14-추상화)
15. [인터페이스](#15-인터페이스)
16. [다형성](#16-다형성)
17. [날짜](#17-날짜)
18. [싱글톤 패턴](#18-싱글톤-패턴)
19. [제네릭](#19-제네릭)
20. [콜렉션](#20-콜렉션)

# 객체지향 프로그래밍 주요개념 한 줄 정리
- **클래스**란 객체를 생성하기위해 변수와 메서드가 정의돼있는 틀
- **객체**란 인스턴스와 같은 개념으로 쓰이지만, 세세하게 따지면 인스턴스들을 총칭하는 용어 (함수와 메서드의 차이 정도)
- **인스턴스**란 클래스를 통해 만들어진 메모리에 올라간 상태인 각각의 객체
  
- **캡슐화**란 외부로 부터 접근을 제어해서 데이터를 보호하는 것
- **상속**이란 부모클래스에 있는 변수, 메서드를 자식클래스가 그대로 사용할수있는 것
- **추상화**란 객체들의 **공통적인 부분**(변수, 메서드)을 구해서 추상클래스를 만드는 것
- **다형성**이란 상속받은 객체들이 서로 다른 형태(자료형)를 갖는 성질
  
- **오버로딩**이란 같은 이름의 메서드를 만들 수 있는 기능
- **오버라이딩**이란 부모 클래스의 메서드를 자식클래스가 같은 이름으로 재정의해서 만들수 있는 기능

# 자바 명명 규칙
## 네이버 자바 코딩 컨벤션
https://naver.github.io/hackday-conventions-java/

## 공통 명명 규칙
### 규칙
1. 대소문자가 구분되며 길이에 제한이 없다.
2. 예약어를 사용해서는 안 된다.
3. 숫자로 시작해서는 안 된다.
4. 특수문자는 '_' 와 '$'만을 허용한다.
5. 파스칼 표기법 (PascalCase)과 카멜 표기법(camelCase)를 사용한다.
6. 반의어는 반드시 대응하는 개념으로 사용해야 한다.

※ PascalCase : 모든 단어에서 첫 번째 문자는 대문자이며 나머지는 소문자이다.
※ camelCase : 최초에 사용된 단어를 제외한 첫 번째 문자가 대문자이며 나머지는 소문자이다.

### 패키지 명명 규칙
1. 패키지명은 표준 패턴을 따라야 한다.
     (ex. [com].[Company].[Project].[TopPackage].[LowerPackage])

2. 패키지명은 가급적 한 단어의 명사를 사용한다.
     (ex. com.nexon.sudden.member.object (o) / sudden.memberObject (x)

### 클래스 명명 규칙
1. 클래스명에는 파스칼을 사용한다.
     (ex. public class HelloWorld {})
2. 인터페이스에는 특별한 접두사나 접미사를 사용하지 않고 파스칼을 사용한다.
     (ex. public interface Animal {})
3. 인터페이스를 구현한 클래스에는 특별한 접두사나 접미사를 사용하지 않고 파스칼을 사용한다.
     (ex. public class Tiger implements animal{})
4. 추상 클래스에는 특별한 접두사 접미사를 사용하지 않고 파스칼을 사용한다.
     (ex. public abstract class Animal {})

### 메소드 명명 규칙
1. 메소드명에는 카멜 표기법을 사용한다.
     (ex. public void sendMessage(String message) {} )

2. 속성에 접근하는 메소드명의 접두사는 'get','set'을 사용한다.
     (ex. public void setDisplayName)
     (ex. public void getDisplayName)

3. 데이터를 조회하는 메소드명의 접두사는 find를 사용한다.
     (ex. public void findData(String data){})

4. 데이터를 입력하는 메소드명의 접두사는 input을 사용한다.
     (ex. public void inputData(HashMap data){})

5. 데이터를 변경하는 메소드명의 접두사는 modify를 사용한다.
     (ex. public void modifyData(HashMap data){})

6. 데이터를 삭제하는 메소드명의 접두사는 delete를 사용한다.
     (ex. public void deleteData(String data){})

7. 데이터를 초기화 하는 메소드명의 접두사는 initialize을 사용한다.
     (ex. public void initData(String data){})

8. 반환값의 타입이 boolean인 메소드는 접두사로 is를 사용한다.
     (ex. public void isData(String Data){})

9. 데이터를 불러오는 메소드명의 접두사는 load를 사용한다.
     (ex. public void loadData(){})

10. 데이터가 있는지 확인하는 메소드명의 접두사는 has를 사용한다.
     (ex. public void hasData(){})

11. 보다 지능적인 set이 요구될때 사용하는 메소드명의 접두사는 register를 사용한다.
     (ex. public void registerAccount(){})

12. 새로운 객체를 만든뒤 해당 객체를 리턴해주는 메소드명의 접두사는 create를 사용한다.
     (ex. public void createAccount(){})

13. 해당 객체를 다른 형태의 객체로 변환해주는 메소드명의 접두사는 to를 사용한다.
     (ex. public void toString(){})

14. 해당 객체가 복수인지 단일인지 구분하는 메서드명의 접미사는 s를 사용한다.
     (ex. public void getMembers(){})

15. B를 기준으로 A를 하겠다는 메소드명의 전치사는 By를 사용한다.
     (ex. public void getUserByName(String name){})

### 변수 명명 규칙
1. 변수와 메소드의 파라미터에는 카멜표기법을 사용한다.
2. 변수에 약어를 사용하지 않고 모든 의미를 충분히 담는다.
3. 한 글자로 된 이름을 사용하지 않는다.
4. 선언된 지점에서 초기화하며, 가능한 사용범위를 최소화 한다.
     (ex. 숫자 0 레퍼런스 null)
   
6. 반복문에서 인덱스로 사용할 변수는 i,j,k 등으로 사용한다.
     (ex. for(int i = 0; i < 10; i++){})

7. 지역변수와 멤버변수(전역변수)는 변수명 앞에 밑줄(_)을 사용하여 구별한다.

8. boolean타입의 변수는 접두사로 is를 사용한다

## 많이 쓰이는 반의어 정리
| 반의어 | 설명 |
|:---|:---|
|get / set|얻다 / 놓다|
|add / remove|추가 / 제거|
|create / destroy|창조 / 파괴|
|start / stop|시동 / 정지|
|insert / delete|삽입 / 삭제|
|increment / decrement|증가 / 감소|
|old / new|구 / 신|
|first / last|처음 / 마지막|
|up / down|위 / 아래|
|min / max|최소 / 최대|
|next / previous|다음 / 이전|
|open / close|열다 / 닫다|
|show / hide|보이다 / 숨기다|
|pause / resume|일시 정지 / 재개하다|
|parent / child|부모 / 자식|

# 0. 자바 설치
1. 자바 언어
	- https://www.oracle.com/kr/java/technologies/javase/javase8-archive-downloads.html
3. 확인 : c > program > java
	- jdk = java development kit
	- jre = java runtime environment 
4. 이클립스(eclipse)
	- 설치형
 	- 압축해제형
		- https://www.eclipse.org/downloads/packages/
5. 이클립스에서 Java파일 생성
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

# 5. 문자열
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
- **클래스**란 객체를 생성하기위해 변수와 메서드가 정의돼있는 틀
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
### 리턴 사용방법
- return 메서드를 사용하면 클래스내의 변수한개를 줄일수있다.
- 굳이 쓰지않아도 프로그램 만드는데는 아무런지장이 없다. 
- 하지만 프로그래밍이 능숙해지면 자연히쓰게된다.
### 리턴메서드 만드는법
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
- 메서드 **오버로딩**이란 같은 이름의 메서드를 사용할 수 있는 기능이다
- 메서드의 이름이 같아도 전달되는 값이 다르다면 서로 다른 메서드로 인식한다

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
- **오버라이딩**이란 부모 클래스에 있는 메서드를 자식 클래스가 같은 이름으로 메서드를 재정의해서 사용하는 것이다
- 메서드 오버라이딩은 상속 관계에서 적용된다.
- 대표적인 예가 equals() 메서드. String클래스가 Object클래스를 상속받아 equals메서드를 재정의한 것
- 부모의 메서드는 실행되지않고 자식의 메서드가 우선순위를 가져간다
- 여러 타입의 클래스 자료형을 부모 클래스이름으로 통합해서 배열에 저장할 수 있다

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
// 2) fr.read(); 			// 한글자씩 int로 가져온다. (가져올 내용이 없으면 -1이 저장)
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
- **캡슐화**란 외부로 부터 접근을 제어해서 데이터를 보호하는 것을 말한다
- 변수에는 private, 메서드에는 public 키워드를 붙이고 get, set메서드를 만들어 DTO클래스를 만드는 것으로 구현한다
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
- public : 프로젝트내 모든 클래스에서 사용가능
- protected  : 패키지가 같으면 public, 패키지가 다르면 자식클래스내에서는 public, 자식클래스내가 아니면 private
- default : 패키지가 같으면 public, 패키지가 다르면 private
- private : 내부 클래스에서만 사용가능, 타 클래스에서 사용불가

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
- public : 클래스 외부접근을 허용
- protected : 동일 패키지거나 자식 클래스에서 접근 가능
- default : 동일 패키지 클래스에서 접근 가능
- private : 클래스 내부접근만 허용

## DTO
### DTO (Data Transfer Object)
- 데이터 전송 객체
- 여러 레이어(Layer)간 데이터를 주고 받을 때 사용할 수 있고 주로 View와 Controller 사이에서 활용
- 일반적으로 DB에서 가져온 데이터를 다른 계층에서 사용하기 적합한 형식으로 변환하여 전송하는데 사용
- DTO 속성은 getter / setter 메서드로 구성
- 데이터 전송에만 사용

```java
class ClientDTO {
	private int num;

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
}
```

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

## DAO (Data Access Object)
- 데이터 접근 객체(DB의 data에 접근하기 위한 객체)
- DB에서 데이터를 가져오거나 DB에 데이터를 저장하는 등 CRUD작업을 수행하는 객체
- DAO를 static 으로 만들면 편하다.
- DTO와 DAO는 항상 한세트로 만든다고 생각하면된다

## static, DTO, DAO 활용 예제
```java
class ClientDTO {
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
			ClientDTO c = new ClientDTO();
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
- **상속**이란 부모클래스에 있는 변수, 메서드를 자식클래스가 그대로 사용할 수 있는 것을 말한다
## 상속의 종류 3가지
### (일반)상속
- extends, 한번만 상속 가능
### 추상화
- abstract 부모클래스
- abstract 메서드();
- 부모의 abstract메서드를 자식이 반드시 구현implement(중괄호)해야 한다. 
### 인터페이스
- interface 부모클래스
- interface 는 다중상속이 가능
- interface 를 상속하면 메서드를 무조건 강제구현해야 한다
  
```java
//상속
class TestA {
	void test() {}
}
class TestB extends TestA {}

//추상화상속
abstract class TestC {
	abstract void test();
	void test2() {};
}
class TestD extends TestC {
	@Override
	void test() {}
}

//인터페이스 상속
interface TestE {
	public void test();
}
interface TestF {
	public void test2();
}
class testG implements TestE, TestF {
	@Override
	public void test() {}
	@Override
	public void test2() {}
}
```

## 상속(extends)
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
- 공통의 부모를 만들면 자식들을 부모 배열로 저장 가능
```java
기존 int[] arr = {1, 2}
상속 Monster[] list = {cat, dog}
``` 

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

# 14. 추상화
## 추상화(abstract)
```java
/*
추상화(abstract)
    1) 부모클래스 앞에 abstract 를 붙여준다.
    2) 자식클래스에서 구현시킬 메서드명 앞에 abstract 를 붙여준다.
    3) 원래메서드는{} 를 사용하여 내용을 구현하는데  {}를 생략하고 ; 을 붙여준다.
*/
//1) 클래스 앞에 abstract를 붙여줌
abstract class A {
	// 2) 메서드 앞에 abstract를 붙여줌
	abstract void test();  //구현을 하지않는다는 표현으로 {}를 없애고 ';' 을 붙임 
	
	void test2() {} // abstract 가 붙지않은 메서드도 만들수있다. 
}

//3) 클래스 A를 상속받자마자 오류가 발생함
class B extends A {
	// 4) 강제로 만들어야하는 메서드
	void test() {
		
	}
}
```
- **추상화**란 객체들의 **공통적인 부분**을 구해서 추상클래스를 만드는 것을 말한다
- 추상클래스는 부모클래스에 변수와 메서드를 정의만 하고 구현은 자식클래스에 작성 한다
- abstract 키워드를 사용하여 추상클래스, 추상메서드를 만들 수 있다
- 추상클래스는 인스턴스를 만들 수 없다. 따라서 상속을 통해 자식 클래스에서 인스턴스를 생성해야 한다
- 추상메서드는 부모클래스에서 이름만 정의하고 내용은 자식클래스에서 오버라이딩을 해서 구현한다

## 추상화 예제
```java
abstract class Monster {
	abstract void skill();
	abstract void attack(); // 어차피 서로다른 기능들을 재정의 해야하니 추상메서드로 만듬
	abstract void deffense();
}
class Cat extends Monster {
	void fishAttack() {
		System.out.println("물고기 공격!");
	}
	void attack() {
		System.out.println("고양이 공격");
	}
	@Override
	void skill() {
		// TODO Auto-generated method stub
	}
	@Override
	void deffense() {
		// TODO Auto-generated method stub
	}
}

class Dog extends Monster {
	@Override
	void skill() {
		// TODO Auto-generated method stub
	}
	@Override
	void attack() {
		System.out.println("강아지 공격");
	}
	@Override
	void deffense() {
		// TODO Auto-generated method stub
	}
}
public class 추상화_개념03_기본이론3 {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		Monster[] monsterList = new Monster[2];
		monsterList[0] = cat;
		monsterList[1] = dog;
		monsterList[0].attack();
		
		Cat c = (Cat)monsterList[0];
		c.fishAttack();
	}
}
```

# 15. 인터페이스
## 예제
```java
interface AA {
	public void test1();
}
interface BB {
	public void test2();
	public void test3();
}
class CC implements AA, BB { // interface 는 다중상속이 된다
	public void test1() {} // interface 를 상속하면 메서드를 무조건 강제구현한다
	public void test2() {}
	public void test3() {}
}
```
### 인터페이스(Interface) 클래스
- 부모 클래스앞에 interface 를 붙인다
- interface 상속은 extends 대신 implements 를 붙인다
- interface 는 다중상속이 가능하여, 여러 interface를 상속할 수 있다

### 인터페이스는 추상클래스보다 더 추상화된 클래스 (전부 강제)
- 실제 구현된 것이 전혀없는 기본 설계도
- 상수와 추상 메서드만 멤버로 갖는다
- 인스턴스를 생성할 수 없고, 클래스 작성에 도움을 줄목적으로 사용되는 클래스

# 16. 다형성
- **다형성**이란 상속받은 객체들이 서로 다른 형태(자료형)를 갖는 성질

## 클래스 타입 형변환
```java
class Parent1 {
	int a;
}
class Child1 extends Parent1 {
	int b;
}

public class 추상화_개념04_형변환1 {
	public static void main(String[] args) {
		Parent1 p = new Parent1();
		Child1 c = new Child1();
		
//		a	=	a, b
		Parent1 p2 = new Child1(); // 부모타입으로 자식 인스턴스 생성.
//      	p2.a 실제 인스턴스는 자식이라 인스턴스변수 a,b가 생성되며, a는 부모자식 모두 가지고있기 떄문에 접근가능.
//		p2.b 타입이 부모이기 때문에 자식이 가진 인스턴스 변수b 에는 접근불가
		
		Child1 c2 = (Child1)p2;
//		c2.b 타입을 다시 자식으로 바꾸어주면 b접근가능
		
//		a, b	=	a (멤버b는 비게돼서 생성불가)
//		Child1 c3 = new Parent1(); // 자식타입으로 부모 인스턴스 생성. 당연히 안된다. 
//      	부모클래스에는 인스턴스 변수 b가 없기 때문에 자식타입으로 부모인스턴스 선언 불가
//		자식 타입으로 생성하려고 하는데 부모 생성자를 사용하면 해당 자식 타입에 선언된 멤버b는 비게됨
	}
}

```
- 타입으로 접근하면 이해가 쉬워진다

## 클래스 형변환2
### instanceof
```java
class Parent {
	public int a;
}

class Child extends Parent {
	public int b;
}

public class 추상화_개념05_형변환2 {
	public static void main(String[] args) {
		
		Parent p1 = new Parent(); 
		
		Parent p2 = new Child();  
		// new Parent();는 부모만 생성되기때문에 child에 담을 수 없다.
		// Child c1 = new Parent(); 	// 이렇게 하면 에러가 발생된다. 	
		// Child c2 = (Child)p1; 		// 이렇게 하면 에러가 발생된다.
				
		Child c3 = new Child();
		
		Parent p3 = (Parent)c3;
		
		System.out.println("-----------------------------------");
		
		// instanceof 키워드를 사용하면 좀더 확실히 예외처리 할수있다.
		
		if (p1 instanceof Child) {
			Child ch = (Child)p1;
			System.out.println("형변환 성공1");
		} else {
			System.out.println("형변환 불가1");
		}
		
		if (p2 instanceof Child) {
			Child ch = (Child)p2;
			System.out.println("형변환 성공2");
		} else {
			System.out.println("형변환 불가2");
		}
			
	}
}
```

## 다형성 클래스배열 예제
```java
abstract class Shape {
	public abstract void draw();
}

//	Shape 클래스를 상속받아 Point 클래스를 만든다.
class Point extends Shape {
	@Override
	public void draw() {
		System.out.println("점을 찍는다.");
	}
}

//	Shape 클래스를 상속받아 Line 클래스를 만든다.
class Line extends Shape {
	@Override
	public void draw() {
		System.out.println("선을 그린다.");
	}
}

//	Shape 클래스를 상속받아 Circle 클래스를 만든다.
class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("원을 그린다.");
	}
}

//	Shape 클래스를 상속받아 Rect 클래스를 만든다.
class Rect extends Shape {
	@Override
	public void draw() {
		System.out.println("사각형을 그린다.");
	}
}

//	Shape 클래스를 상속받아 TriAngle 클래스를 만든다.
class TriAngle extends Shape {
	@Override
	public void draw() {
		System.out.println("삼각형을 그린다.");
	}
}

public class 추상화_개념06_다형성그리기 {
	public static void main(String[] args) {
		// === 다형성 === 
		// 서로 다른클래스는 배열에 저장불가능하기때문에
		// 공통부모를 상속받고 부모의 클래스로 배열을 만들면 한배열에 서로다른클래스들을 저장할수있다.
		Shape[] shapes = {new Point(), new Line(), new Circle(), new Rect(), new TriAngle()};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 작업을 선택하세요 : ");
		int menu = sc.nextInt();
		
		shapes[menu - 1].draw();

	}
}
```
- 상속받은 여러 타입의 클래스 자료형을 부모 클래스 배열로 통합해서 배열에 저장할 수 있다

# 17. 날짜
## 사용권장 순위
- **LocalDate, LocalTime, LocalDateTime** > Date, Calendar
- **DateTimeFormatter** > SimpleDateFormat
### 날짜 관련 클래스가 다수 존재하는 이유
- Java 8 이전에 사용하던 Date 관련 클래스는 Date, Calendar, SimpleDateFormat 등이 있었으나, 많은 문제가 있어 자바 8 버전 이후부터는 새로운 날짜 관련 API를 제공한다
- Date, Calendar, SimpleDateFormat클래스들은 Java의 레거시 API

## Date
```java
import java.util.Date;

Date date = new Date();
System.out.println(date); // Wed Jan 31 21:36:01 KST 2024
// date메서드는 곧 사용금지될 함수들이다.
System.out.println("년 : " + (date.getYear() + 1900));
```

## Calendar
```java
import java.util.Calendar;
import java.text.SimpleDateFormat;

// Calendar calendar = new Calendar(); // new를 사용해서 객체를 생성할 수 없다.
Calendar calendar = Calendar.getInstacne(); // 클래스 내부에서 선언된 자신의 클래스 객체를 얻어온다.

SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E) HH:mm");
System.out.println(sdf.format(calendar.getTime()))

System.out.println("년 : " + calendar.get(Calendar.YEAR));
System.out.println("월 : " + (calendar.get(Calendar.MONTH) + 1));
System.out.println("일 : " + calendar.get(Calendar.DAY_OF_MONTH));
		
// 일요일(1), 월요일(2), ..., 토요일(7)
System.out.println("요일 : " + calendar.get(Calendar.DAY_OF_WEEK));	
		
System.out.println("시 : " + calendar.get(Calendar.HOUR));		// 12시각
System.out.println("시 : " + calendar.get(Calendar.HOUR_OF_DAY));	// 24시각
System.out.println("분 : " + calendar.get(Calendar.MINUTE));
System.out.println("초 : " + calendar.get(Calendar.SECOND));
```
- Calendar 클래스는 singleton 패턴으로 설계된 클래스이므로 객체를 만들어 사용할 수 없다.
- 객체를 만들어 사용할 수 없는 클래스는 클래스 내부에 자신의 클래스로 만든 객체를 가지고 있고
- 내부에 가지고 있는 클래스 객체를 얻어오는 메소드를 실행해서 사용한다.

- Calendar 클래스 객체는 날짜 및 시간 정보 이외의 더 많은 정보를 가지고 있으므로 
- SimpleDateFormat 클래스 객체를 이용해 서식을 지정하려면 getTime() 메소드로 날짜와 시간만 얻어온 후 적용시켜야 한다.
- get() 메소드로 날짜,시간을 각각 구할수 있다.

## SimpleDateFormat
```java
import java.text.SimpleDateFormat;

SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 a hh시 mm분 ss초");
System.out.println(sdf1.format(date));
SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MM.dd(E) HH:mm");
System.out.println(sdf2.format(date));
/*
* System.currentTimeMillis()
* 1970년 1월 1일 자정 부터 이 메소드가 실행되는 순간까지 지나온 시간을 밀리초(1/1000초) 단위로 얻어온다.
* 13자리의 숫자를 얻어오기 때문에 int로 처리하면 에러가 발생되므로 long로 처리해야 한다.
*/
long time = System.currentTimeMillis();
System.out.println(time);
System.out.println(sdf2.format(time));
```

## LocalDate, LocalTime, LocalDateTime
### 현재 날짜 및 시간 가져오기
```java
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

// 현재 날짜 가져오기
LocalDate currentDate = LocalDate.now();

// 현재 시간 가져오기
LocalTime currentTime = LocalTime.now();

// 현재 날짜와 시간 가져오기
LocalDateTime currentDateTime = LocalDateTime.now();
```

### 특정 날짜와 시간 생성하기
```java
// 특정 날짜 생성하기 (년, 월, 일)
LocalDate date = LocalDate.of(2022, 9, 15);

// 특정 시간 생성하기 (시, 분)
LocalTime time = LocalTime.of(14, 30);

// 특정 날짜와 시간 생성하기 (년, 월, 일, 시, 분)
LocalDateTime dateTime = LocalDateTime.of(2022, 9, 15, 14, 30);
```

### 날짜 및 시간 계산하기
```java
// 날짜에 대한 연산
LocalDate tomorrow = LocalDate.now().plusDays(1); // 내일
LocalDate nextWeek = LocalDate.now().plusWeeks(1); // 일주일 후

// 시간에 대한 연산
LocalDateTime nextHour = LocalDateTime.now().plusHours(1); // 한 시간 후

// 두 날짜 사이의 일 수 계산
LocalDate startDate = LocalDate.of(2022, 1, 1);
LocalDate endDate = LocalDate.of(2022, 12, 31);
long daysBetween = ChronoUnit.DAYS.between(startDate, endDate); // 2022년의 일 수
```

### 날짜 및 시간 연산하기
```java
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

// 날짜에 대한 연산
LocalDate tomorrow = LocalDate.now().plusDays(1); // 내일
LocalDate nextWeek = LocalDate.now().plusWeeks(1); // 일주일 후

// 시간에 대한 연산
LocalDateTime nextHour = LocalDateTime.now().plusHours(1); // 한 시간 후

// 두 날짜 사이의 일 수 계산
LocalDate startDate = LocalDate.of(2022, 1, 1);
LocalDate endDate = LocalDate.of(2022, 12, 31);
long daysBetween = ChronoUnit.DAYS.between(startDate, endDate); // 2022년의 일 수
```

## DateTimeFormatter
### 특정 서식으로 날짜와 시간 표시하기
```java
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// 날짜와 시간 객체 생성
LocalDateTime dateTime = LocalDateTime.now();

// 패턴을 사용하여 날짜와 시간을 문자열로 변환
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
String formattedDateTime = dateTime.format(formatter);
System.out.println(formattedDateTime); // 예: 2022-02-28 13:45:30
```

# 18. 싱글톤 패턴
```java
class MySingleTonDAO {
	// 1. 생성자를 private으로 잠근다.
	private MySingleTonDAO() {}
	
	// 2. 내부에서 new를 통해 객체를 생성한다.
	private static MySingleTonDAO instance = new MySingleTonDAO();
	
	// 3. instance 변수에 접근할 수 있는 메서드를 생성한다.
	public static MySingleTonDAO getInstance() {
		return MySingleTonDAO.instance;
	}
}

public class 날짜_기본이론2_싱글톤패턴 {
	public static void main(String[] args) {
		// ===  만드는법 ===
		// 1) 생성자를 private 으로 만든다 . 그러면 new 를 할 수 없다. 
		// 2) 내부에서 new를 해서 객체를 생성한다. static 필요
		// 3) public 을 get함수에만 적용한다. static 필요
		
		MySingleTonDAO d1 = MySingleTonDAO.getInstance();
		MySingleTonDAO d2 = MySingleTonDAO.getInstance();
		System.out.println(d1); 
		System.out.println(d2); 
	}
}
```
### 싱글톤 패턴이란 
- 과거 DAO 클래스들이 static 을 이용해 편리하게 사용했으나 모든 변수와 함수에 static 을 붙여야만 했다
- class 자체에 static 을 붙이면 좋겠지만 class 에는 static 을 붙일수없기 때문에 (문법적으로)
- 그와 유사한 형태로 마치 class 에 붙인거와 같은 효과가 난다.

# 19. 제네릭
## 제네릭 예제
```java
import java.util.Vector;

class MyVector<T> {
	private Object[] arr;
	private int count;
	
	public void add(T data) {
		if (count == 0) {
			arr = new Object[1];
		} else if (count > 0) {
			Object[] temp = arr;
			arr = new Object[count + 1];
			
			for (int i = 0; i < temp.length; i++) {
				arr[i] = temp[i];
			}
			temp = null;
		}
		arr[count] = data;
		count += 1;
	}
	public T get(int index) {
		return (T)arr[index];
	}
	public void set(int index, T data) {
		arr[index] = data;
	}
	public int size() {
		return count;
	}
}

class User {
	public String name;
	
	public User() {}
	public User(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
class Tv {}

public class 제네릭_기본이론3_제네릭벡터 {
	public static void main(String[] args) {
		MyVector<User> list1 = new MyVector<User>();
		list1.add(new User("홍길동"));
		list1.add(new User("김민수"));
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		
		// <> 제네릭은 클래스를 지정해주는대로 사용가능하다. 
		MyVector<Tv> list2 = new MyVector<Tv>();
		
		Vector<User> list3 = new Vector<User>();
		list3.add(new User("홍길동"));
		User temp1 = new User("김소정");
		list3.add(temp1);
		
		list3.set(1, new User("최민정"));
		
		for (User user : list3) {
			System.out.println(user.toString());
		}
	}
}
```

## 래퍼클래스
```java
/*
# 래퍼 클래스(wrapper class)
- 래퍼 클래스란, 기본 자료형을 클래스로 만들어 놓은 것을 의미한다. (해당 자료형에 필요한 기능 추가)
	[기본형]          [래퍼 클래스]
	byte             Byte
	short            Short
	int              Integer
	long             Long
	float            Float
	double           Double
	char             Character
	boolean          Boolean	
*/

public class 콜렉션벡터_개념01_래퍼클래스 {

	public static void main(String[] args) {
		int i1 = 10;
		
		Integer i2 = Integer.valueOf("10");
		Integer i3 = new Integer(20);
		
		double d1 = 10.11;
		Double d2 = Double.valueOf(10.11);
	}

}
```

# 20. 콜렉션
- 데이터를 저장하기위한 유용한 자료구조 클래스
## Vector
```java
import java.util.Vector;
/*	
# 주요 기능
	1. 추가 		: add
	2. 삭제 		: remove
	3. 전부 삭제 	: clear
	4. 개수		: size
	5. 값 읽기	: get (* 배열의 []에 해당)
	6. 값 수정	: set
*/

public class 콜렉션벡터_개념02_사용법 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(100);
		System.out.println(v); // [100]
		System.out.println(v.get(0)); //100
		v.set(0, 200);
		v.size(); // 1
		v.remove(0);
		v.clear();
	}
}
```
### 배열의 한계
- 배열은 한번 선언하면 프로그램에서 그 크기를 바꿀 수 없다.
- 가변배열을 직접 만들어서 사용했지만,
- 자바에서는 Vector 클래스를 통해 가변배열을 제공한다.
### 특징
- 특이하게 <>꺽쇠를 사용하는데 이를 제네릭(generic)이라고 부른다.
- 저장할 수 있는 데이터의 타입은 **클래스 타입** 만 가능하다.
- int, double 이와 같은 기본 자료형을 저장할 수 없기 때문에
- Integer, Double 과 같은 래퍼 클래스를 이용해야 한다.
### 선언하는 방법
- Vector<Integer> vector = new Vector<Integer>();

## ArrayList
```java
import java.util.ArrayList;

public class 콜렉션종류_기본이론1_어레이리스트1 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// 1. add(value) : ArrayList의 맨 뒤에 value를 추가한다.
		list.add(1);
		list.add(2);
		// 2. remove(index) : ArrayList의 index번째 데이터를 제거한다.
		list.remove(0);
		// 3. size() : ArrayList에 저장된 데이터의 개수를 얻어온다.
		System.out.println(list.size());
		
		// 4. get() : ArrayList의 index번째의 value를 얻어온다.
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// 5. add(index, value) : ArrayList의 index번째 위치에 value를 삽입한다.
		list.add(0, 0);
		System.out.println(list); // [0, 2]
		
		// 6.set(index, value) : ArrayList의 index번째 위치에 value를 수정한다.
		list.set(1, 1);
		
		// 7. clear() : ArrayList의 모든 데이터를 제거한다.
		list.clear();
	}
}
```
- Vector 보다 나중에 나온 자료구조.
- Vector 보다 성능이 좋다. 
- 결론은 Vector 보다 ArrayList 를 사용하자. 문법은 똑같다. 

## Map
```java
import java.util.HashMap;
import java.util.Map;

public class 콜렉션종류_기본이론2_맵 {
	public static void main(String[] args) {
		
		Map<String, Integer> hmap = new HashMap<String, Integer>();
		
//		1. put(key, value) : HashMap의 key에 value를 할당한다.
//		1.1 put() 메소드는 존재하지 않는 key에 넣어주면 데이터가 입력되고 존재하는 key에 넣어주면 수정된다.
		hmap.put("apple", 1000);
		hmap.put("orange", 1500);
		hmap.put("orange", 3000);
		hmap.put("melon", 5000);
		hmap.put("water melon", 15000);
		
//		2. size() : HashMap에 저장된 데이터의 개수를 얻어온다.
		System.out.println(hmap.size());
		
//		3. get(key) : HashMap의 key에 할당된 value를 얻어온다.
		System.out.println(hmap.get("orange"));
		
//		4. keySet() : HashMap의 key만 얻어온다.
		System.out.println(hmap.keySet()); // [orange, apple, water melon, melon]
		
		int sum = 0;
		for (String key : hmap.keySet()) {
			System.out.println(hmap.get(key));
			sum += hmap.get(key);
		}
		System.out.println(sum);
		
//		5. remove(key) : HashMap의 key에 해당되는 값을 제거한다.
		hmap.remove("apple");
		
//		6. clear() : HashMap의 모든 값을 제거한다.
		hmap.clear();
	}
}
```
		
- HashMap은 K(Key)에 V(Value)를 할당하는 방식으로 저장된다.
- Key는 String으로 하고 Value는 HashMap에 저장할 데이터의 타입을 쓴다.
- 맵의 객체생성은 앞에 변수는 **Map** 으로 사용하고 new 는 **HashMap** 으로 한다. 
- HashMap 의 부모인 Map의 메서드를 이용하기때문이다.
