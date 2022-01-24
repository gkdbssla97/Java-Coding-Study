package gamelevel;

public class SuperLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("Super 달립니다");
    }

    @Override
    public void jump() {
        System.out.println("jump Super 기능");
    }

    @Override
    public void turn() {
        System.out.println("turn Super 기능");
    }

    @Override
    public void showLevelMsg() {
        System.out.println("***고급자레벨***");
    }
}
