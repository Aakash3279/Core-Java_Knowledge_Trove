//class without encapsulation
public class Player {
    public String FullName; // giving this full name causes need to change in main class also
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        health = health - damage;
        if(health <= 0){
            System.out.println("Player knocked out of the game!");
        }
    }

    public int healthRemaining(){
        return health;
    }

    public void restoreHealth(int extraHealth){
        health = health + extraHealth;
        if(health > 100){
            System.out.println("player restored at 100%");
            health = 100;
        }
    }
}
