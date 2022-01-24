package interfaceex;

public abstract class Calculator implements Calc{
    //interface implements는 <type 상속>
    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int substract(int num1, int num2) {
        return num1 - num2;
    }


}
