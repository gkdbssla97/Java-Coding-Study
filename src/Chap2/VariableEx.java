package Chap2;

public class VariableEx {
    public static void main(String[] args) {

        int num = 10;
        num = 20;
        System.out.println(num);

        int level = 20;
        System.out.println(level);

        long num1 = 1234123413123L; // L
        System.out.println(num1);

        double dNum = 3.14;
        float fNum = 3.14f;

        System.out.println(dNum);
        System.out.println(fNum);

        var id = 190131.141; // 자료형 추론
        System.out.println(id);
    }
}
