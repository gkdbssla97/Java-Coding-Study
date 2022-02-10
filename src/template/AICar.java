package template;

public class AICar extends Car{
    @Override
    public void drive() {
        System.out.println("자율 주행");
        System.out.println("자동차가 스스로 방향전환");
    }

    @Override
    public void stop() {
        System.out.println("자동차 스스로 멈춤");
    }

    @Override
    protected void wiper() {
        System.out.println("날씨에 따라 자동조절");
    }

    @Override
    public void washcar() {
        System.out.println("자동으로 세차");
    }
}
