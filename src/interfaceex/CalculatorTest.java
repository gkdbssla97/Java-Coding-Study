package interfaceex;

public class CalculatorTest {
    public static void main(String[] args) {
        Calc calc = new CompleteCalc();
        //Calc calc = new Calculator(); // 추상클래스 생성자 X
        //Calc calc = new Calc(); // 인터페이스는 생성자 X

        int num1 = 10;
        int num2 = 2;
        System.out.println(calc.add(num1, num2));
    }
}
