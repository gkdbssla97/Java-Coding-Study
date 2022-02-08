package scheduler;

public class LeastJob implements Scheduler{
    @Override
    public void getNextCall() {
        System.out.println("22");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("22");
    }
}
