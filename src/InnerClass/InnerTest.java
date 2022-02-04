package InnerClass;

class OutClass {
    private int num = 10;
    private  static int snum = 20;
    InClass inClass;

    public OutClass() {
        inClass = new InClass();
    }
    private class InClass {
        int inNum = 200;

        void inTest() {
            System.out.println(num);
            System.out.println(snum);
        }
    }
    public void usingInTest() {
        inClass.inTest();
    }
    static class InStaticClass {
        int iNum = 100;
        static int sInNum = 200;

        void inTest() {
            snum++;
            System.out.println("inTest() 호출");
            System.out.println(iNum);
            System.out.println(sInNum);
        }
        static void sTest() {
            // System.out.println(iNum); static변수만 사용가능
            System.out.println(sInNum);
        }
    }
}

public class InnerTest {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        outClass.usingInTest();

        OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
        sInClass.inTest();
        OutClass.InStaticClass.sTest();

    }
}
