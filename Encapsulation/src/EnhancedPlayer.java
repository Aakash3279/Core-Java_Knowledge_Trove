//using encapsulation
public class EnhancedPlayer {
    private String Fullname; //rightClick -> Refractor -> rename
    private int healthPercentage;
    private String weapon;

    public EnhancedPlayer(String Fullname) {
        this(Fullname,100,"Sword");
    }

    public EnhancedPlayer(String Fullname, int health, String weapon) {
        this.Fullname = Fullname;
       if(health <= 0){
           this.healthPercentage = 1;
       }else if(health >= 100){
           this.healthPercentage = 100;
       }else {
           this.healthPercentage = health;
       }
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        healthPercentage = healthPercentage - damage;
        if(healthPercentage <= 0){
            System.out.println("Player knocked out of the game!");
        }
    }

    public int healthRemaining(){
        return healthPercentage;
    }

    public void restoreHealth(int extraHealth){
        healthPercentage = healthPercentage + extraHealth;
        if(healthPercentage > 100){
            System.out.println("player restored at 100%");
            healthPercentage = 100;
        }
    }

}
