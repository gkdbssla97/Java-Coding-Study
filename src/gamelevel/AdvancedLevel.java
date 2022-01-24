package gamelevel;

public class AdvancedLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("빨리 달립니다");
    }

    @Override
    public void jump() {
        System.out.println("jump 기능 O");
    }

    @Override
    public void turn() {
        System.out.println("turn 기능 O");
    }

    @Override
    public void showLevelMsg() {
        System.out.println("***중급자레벨***");
    }
}
