package abstractEx;

public class Desktop extends Computer{
    @Override
    public void display() {
        System.out.println("Desktop display()");
    }

    @Override
    public void typing() {
        System.out.println("Desktop display()");
    }
    public void turnOn() {
        System.out.println("Desktop TurnOn");
    }
}
