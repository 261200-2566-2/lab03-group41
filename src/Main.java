
public class Main {
    public static void main(String[] args) {
        RPGCharacter player = new RPGCharacter();
        RPGCharacter enemy = new RPGCharacter();
        Sword sword = new Sword(50, 1);
        Shield shield = new Shield(100, 1);
        
        player.setname("kong");
        player.display();

        player.levelup();
        player.equipSword(sword);
        player.equipShield(shield);
        player.display();

        player.attack(enemy);
        enemy.display();
    
    }
}