public class Shield {
    private int defend;
    private int level;

    public Shield(int defend, int level) {
        this.defend = defend;
        this.level = level;
    }

    public int getdefend() {
        return defend;
    }

    public Shield() {
        defend = 1000;
        level = 1;
    }

    void levelup() {
        level++;
        defend = defend + 100 * (level - 1);
    }
}