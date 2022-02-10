package template;

public class ManualCar extends Car{
    @Override
    public void drive() {
        System.out.println("사람이 운전");
        System.out.println("사람이 핸들조작");
    }

    @Override
    public void stop() {
        System.out.println("사람이 브레이크로 정지");
    }

    @Override
    protected void wiper() {
        System.out.println("사람이 수동조절");
    }
}
