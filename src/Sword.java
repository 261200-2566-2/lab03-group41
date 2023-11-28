public class Sword {
    private int damage;
    private int level;

    public Sword(int damage, int level) {
        this.damage = damage;
        this.level = level;
    }

    public int getdamage() {
        return damage;
    }

    public void levelup() {
        level++;
        damage = damage + 100 * (level - 1);
    }

    public int fight() {
        return damage;
    }
}