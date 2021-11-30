package projects.firstgame;
import java.util.Scanner;
import java.util.Random;

public class rpg {

    static dice die = new dice();
    static Scanner scn = new Scanner(System.in);
    static Random rand = new Random();
    public static String playerName; 
    public static int playerhp;
    public static int maxhp; 
    public static int maxmana; 
    public static int mana;
    public static int playermeleedmg; 
    public static int enemyhp;
    public static int enemymeleedmg;
    public static int xp; 
    public static int level;
    public static String charclass;
    public static boolean fighting = false;  

    private static void printStats() {
        if (charclass.equals("Mage")) {
            System.out.println(playerName + "\nhp: " +playerhp + "\nmana: " + mana + "\ndamage: " + playermeleedmg + "\nxp: " + xp + "\n");

        }else {
            System.out.println(playerName + "\nhp: " + playerhp + "\ndamage: " + playermeleedmg + "\nxp: " + xp + "\n");
        }
    }

    private static void printEnemyStats() {
        System.out.println("Enemy " + "\nhp: " + enemyhp + "\ndmg: " + enemymeleedmg + "\n");
    }  




    private static void warriorClass() {
        charclass = "Warrior";
        maxhp = 20;
        playerhp = 20;
        playermeleedmg = 6; 
        xp = 0;
        level = 1;
    }

    private static void archerClass() {
        charclass = "Archer";
        maxhp = 14;
        playerhp = 14;
        playermeleedmg = 6;
        xp = 0;
        level = 1;
    }

    private static void mageClass() {
        charclass = "Mage";
        maxhp = 10; 
        playerhp = 10; 
        mana = 20; 
        maxmana = 20;
        playermeleedmg = 2;
        xp = 0;
        level = 1;
    }

    private static void buildEnemy() {
        switch (level) {
            case 1: 
                enemyhp = 9;
                enemymeleedmg = 1;
                break;
            case 2: 
                enemyhp = 19; 
                enemymeleedmg = 4;
                break;
            case 3: 
                enemyhp = 24; 
                enemymeleedmg = 6;
                break;
            case 4: 
                enemyhp = 32; 
                enemymeleedmg = 7;
                break; 
            case 5: 
                enemyhp = 50;
                enemymeleedmg = 9;
                break;
        }
    }

    private static void fight() {
        String action; 
        String spellAction = null; 
        System.out.println("An enemy approaches!");
        buildEnemy();
        fighting = true; 
        
        while (fighting = true) {
            System.out.println("Press 'a' to Attack\nPress 'i' for info" );
            if (charclass.equals("Mage")) {
                System.out.println("Press 's' for spells\n");
            }
            action = scn.nextLine();

            // action = attack
            if (action.charAt(0) == 'a') {
                fighting = attack();
                if (fighting = false) {
                    switch (level) {
                        case 1:
                            xp = xp + 4;
                            break;
                        case 2: 
                            xp = xp + 6;
                            break; 
                        case 3: 
                            xp = xp + 9;
                            break;
                        case 4: 
                            xp = xp + 12;
                            break;
                    }
                    System.out.println("You earned " + xp + " xp");
                    checkLevelUp();
                    return;
                }
                enemyattack();
            }
            
            // action = stats 
            if (action.charAt(0) == 'i') {
                printStats();
                printEnemyStats();
            }
            
            // action = spells
            if (action.charAt(0) == 's') {
                System.out.println("Press 'f' for fireball\nPress 'h' to heal\n");
                spellAction = scn.nextLine();
                if (spellAction.charAt(0) == 'f') {
                    if (dice.roll10() > 2) {
                        mana -= 10; 
                        if (mana < 0) {
                            System.out.println("You do not have enough mana...");
                            mana += 10;
                        }else {
                            int k = dice.roll10(); // randomly hurts 1-10
                            System.out.println("You hit for " + k + " damage!");
                            enemyhp = enemyhp - k;
                            if (enemyhp <= 0) {
                                System.out.println("You Won!");
                                switch (level) {
                                    case 1: 
                                        xp = xp + 4;
                                        break;
                                    case 2: 
                                        xp = xp + 6;
                                        break;
                                    case 3: 
                                        xp = xp + 9;
                                        break;
                                    case 4: 
                                        xp = xp + 12;
                                        break;
                                }
                                System.out.println("You have earned: " + xp + " xp");
                                checkLevelUp();
                                return;
                            }
                            enemyattack();
                        }
                    }
                    else {
                        System.out.println("You miss!");
                        enemyattack();
                    }
                } else {
                    if (spellAction.charAt(0) == 'h') {
                        mana -= 8;
                        if (mana <= 0) {
                            System.out.println("You do not have enough mana...");
                            mana += 8;
                        }else {
                            int x = dice.roll10(); 
                            System.out.println("You heal your wounds...");
                            System.out.println("+" + x + " hp");
                            playerhp += x;
                            if (playerhp > maxhp) {
                                playerhp = maxhp;
                            }
                            enemyattack();
                        }
                    }
                } 
            } 
        }
    }

    private static void checkLevelUp() {
       if (xp <= 100 && level == 4) {
           System.out.println("Level 5!");
           level += 1; 
           maxhp += 25;
           playerhp = maxhp;
           if (charclass.equals("Mage")) {
               maxmana += 7;
               mana = maxmana;
           }
           playermeleedmg +=3;
           printStats();
       }else 
       if (xp >= 50 && level == 3) {
           System.out.println("Level 4!");
           level += 1;
           maxhp += 20;
           playerhp = maxhp;
           if (charclass.equals("Mage")) {
               maxmana += 7;
               mana = maxmana;
           }
           playermeleedmg += 3;
           printStats();
       }else 
       if (xp >= 25 && level == 2) {
           System.out.println("Level 3!");
           level += 1;
           maxhp += 10; 
           playerhp = maxhp;
           if (charclass.equals("Mage")) {
               maxmana += 7;
               mana = maxmana;
           }
           playermeleedmg += 3;
           printStats();
       }else 
       if (xp >= 10 && level == 1) {
           System.out.println("Level 2!");
           level += 1;
           maxhp += 10;
           playerhp = maxhp;
           if (charclass.equals("Mage")) {
               maxmana += 7;
               mana = maxmana;
           }
           playermeleedmg += 3;
           printStats();
       }
    }

    private static void enemyattack() {
        if (dice.roll10() > 2) {
            System.out.println("Enemy hits!");
            playerhp -= enemymeleedmg; 
            if (playerhp <= 0) {
                gameover();
                System.exit(0); // game over if player health < 0
            }
            else {
                System.out.println("Enemy misses!");
            }
        }
    }

    private static boolean attack() {
        if (dice.roll6() > 2) {
            System.out.println("You hit!");
            enemyhp -= playermeleedmg;
            if (enemyhp <= 0) {
                System.out.println("You Won!");
                return false;
            }
        }else {
            System.out.println("You miss!");
        }
        return true;
    }

    public static void gameover() {
        System.out.println(playerName + " Died!");
        System.out.println("GAME OVER");
        System.exit(0); // terminates if lost
        return;
    }

    public static void main(String[] args) {
        int num = 2;

        while (num > 1) {
            System.out.println("Enter your name: ");
            playerName = scn.nextLine();
            
            System.out.println("Choose your class: ");
            System.out.println("'w' for warrior");
            System.out.println("'a' for archer");
            System.out.println("'m' for mage");
            charclass = scn.nextLine();
            while (charclass.charAt(0) != 'w' && charclass.charAt(0) != 'a' && charclass.charAt(0) != 'm') {
                System.out.println("'w' for warrior");
                System.out.println("'a' for archer");
                System.out.println("'m' for mage");
                charclass = scn.nextLine();
            }
        }
        if (charclass.charAt(0) == 'w') {
            warriorClass();
        }
        if (charclass.charAt(0) == 'a') {
            archerClass();
        }
        if (charclass.charAt(0) == 'm') {
            mageClass();
        }
        printStats();
        while (level == 1) {
            fight();
        }

        System.out.println("This area is clear, time to move on\n");
        while (level == 2) {
            fight();
        }
        System.out.println("This area is clear, time to move on\n");
        while (level == 3) {
            fight();
        }
        System.out.println("This area is clear, time to move on\n");
        while (level == 4) {
            fight();
        }
        System.out.println("This area is clear, time to move on\n");
        while (level == 5) {
            fight();
        } // keeps in area until level up
    }

   
    
}
