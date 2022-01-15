package abstractEx;

public abstract class Computer {
    public abstract void display();
    public abstract void typing();
    // 추상메서드
    public int add(int x, int y) {return x + y;}
    public void turnOn() {
        System.out.println("전원을 켭니다");
    }
    public void turnOff() {
        System.out.println("전원을 끕니다");
    }
    // 구현메서드
}
