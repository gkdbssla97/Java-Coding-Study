package gamelevel;

public class BeginnerLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("천천히 달립니다");
    }

    @Override
    public void jump() {
        System.out.println("jump 기능 X");
    }

    @Override
    public void turn() {
        System.out.println("turn 기능 X");
    }

    @Override
    public void showLevelMsg() {
        System.out.println("***초보자레벨***");
    }
}
