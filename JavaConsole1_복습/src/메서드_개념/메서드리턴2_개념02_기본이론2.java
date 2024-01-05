package 메서드_개념;

class TestReturn1 {
    int result;
    void plus(int a, int b) {
        result = a + b;
    }
}
class TestReturn2 {
    int plus(int a, int b) {
        return a + b;
    }
}

public class 메서드리턴2_개념02_기본이론2 {
    public static void main(String[] args) {
        TestReturn1 test1 = new TestReturn1();
        test1.plus(1, 2);
        System.out.println(test1.result);

        TestReturn2 test2 = new TestReturn2();
        System.out.println(test2.plus(2, 3));
    }
}
