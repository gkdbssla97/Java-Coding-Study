package scheduler;

public class RoundRobin implements Scheduler{
    @Override
    public void getNextCall() {
        System.out.println("11");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("11");

    }
}
