package gamelevel;

public abstract class PlayerLevel {
    public abstract void run();
    public abstract void jump();
    public abstract void turn();
    public abstract void showLevelMsg();

    final public void go(int cnt) {
        run();
        for(int i = 0; i < cnt; i++)
            jump();
        turn();
    }
}
