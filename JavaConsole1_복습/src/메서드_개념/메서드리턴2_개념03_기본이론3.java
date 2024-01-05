package 메서드_개념;

class TestReturn {
    int num;

    void setNum(int num) {
        this.num = num;
    }
    int getNum() {
        return num;
    }
}

class TestPattern {
    String name;

    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return name;
    }
}

public class 메서드리턴2_개념03_기본이론3 {
    public static void main(String[] args) {
        TestReturn tr1 = new TestReturn();
        tr1.setNum(1);
        int num1 = tr1.getNum();
        System.out.println(num1);

        num1 = tr1.num;
        System.out.println(num1);

        TestPattern tp1 = new TestPattern();
        tp1.setName("jun");
        String name1 = tp1.getName();
        System.out.println(name1);
    }
}
