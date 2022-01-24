package interfaceex;

public class CompleteCalc extends Calculator{
    // class extends는 <구현 상속>
    @Override
    public int times(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if(num2 != 0)
            return num1 / num2;
        return ERROR;
    }
    public void showInfo() {
        System.out.println("Calc 인터페이스를 구현");
    }
}
