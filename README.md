# learning-java-eclipse
 자바학습저장소1

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
1. Annotations
2. 접근자 (public/protected/private)
3. abstract
4. static
5. final
6. transient
7. volatile
8. default
9. synchronized
10. native
11. strictfp

출처 : https://www.oracle.com/java/technologies/javase/codeconventions-fileorganization.html#1852

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
	void overridTest() 
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
- 메서드 오버라이딩은 부모 클래스에 있는 메서드를 자식 클래스가 같은 이름으로 메서드를 만들어서 사용하는 것이다. 


