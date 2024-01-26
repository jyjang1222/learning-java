# 기본이론
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

# 변수
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

## 입력
```java
import java.util.Scanner;

Scanner scan = new Scanner(System.in);
System.out.print("나이를 입력하세요 : ");
int age = scan.nextInt();
System.out.println("당신의 나이 = " + age + "세");
scan.close();
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

