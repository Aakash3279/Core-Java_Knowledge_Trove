public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Players health = "+player.healthRemaining());
//
//        //player.health = 200; // bad code because restore health has no use in this
//
//        player.loseHealth(11);
//        System.out.println("Players health = "+player.healthRemaining());

        EnhancedPlayer tim = new EnhancedPlayer("Tim");
        System.out.println("Initial Health = "+tim.healthRemaining());

        EnhancedPlayer tom = new EnhancedPlayer("Tom",200,"Sword");
        System.out.println("Initial Health = "+tim.healthRemaining());

    }
}