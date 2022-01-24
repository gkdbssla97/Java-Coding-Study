package gamelevel;

public class Player {
    private PlayerLevel level;

    public Player() {
        level = new BeginnerLevel();
        level.showLevelMsg();
    }
    public void upgradeLevel(PlayerLevel level) {
        this.level = level;
        level.showLevelMsg();
    }

    public void play(int cnt) {
        level.go(cnt);
    }
}
