
//import java.util.HashMap;
import java.util.Scanner;

public class adventure {
    public static String triggerGame(TNode n) {
        String r1 = "";
        switch (n.key) {
            // case A
            case 120:
                r1 = beginning();
                return r1;
            // case B
            case 80:
                r1 = hut();
                return r1;
            // case C
            case 150:
                r1 = treeHouse();
                return r1;
            // case D
            case 40:
            case 100:
            case 130:
            case 162:
                r1 = fisherman();
                return r1;
            // case E
            case 30:
                r1 = yesHut();
                return r1;
            // case F
            case 180:
                r1 = yesTreeHouse();
                return r1;
            // case G
            case 160:
                return "left";

            // case H
            case 190:
                return "right";
            // case I (right)
            case 200:
                r1 = enterTreeHouse();
                return r1;
            // case J
            case 20:
                return "left";
            // case K
            case 18:
                return "left";
            // case I (left)
            case 14:
                r1 = enterHut();
                return r1;
            // case L (left)
            case 12:
                r1 = leftCampFire();
                return r1;
            // case L (right)
            case 50:
            case 210:
                r1 = rightCampFire();
                return r1;
            // case m
            case 4:
            case 70:
            case 110:
            case 138:
            case 170:
            case 230:
                r1 = caveChests();
                return r1;
            // case n 6, 72, 112, 140, 172, 240
            case 6:
            case 72:
            case 112:
            case 140:
            case 172:
            case 240:
                r1 = Chest1();
                return r1;
            // case o
            case 2:
            case 64:
            case 108:
            case 136:
            case 168:
            case 228:
                r1 = Chest2();
                return r1;
            // case P 8, 74, 114, 142, 174, 250
            case 8:
            case 74:
            case 114:
            case 142:
            case 174:
            case 250:
                r1 = winChest();
                return r1;
            // case q (left)
            case 10:
                r1 = leftFisherman2();
                return r1;
            // case q (right)
            case 60:
            case 220:
                r1 = rightFisherman2();
                return r1;
            // case w
            case 0:
            case 62:
            case 106:
            case 134:
            case 166:
            case 266:
                r1 = wrongChest();
                // case S&T 3, 5, 65, 71, 109, 111, 137, 139, 169, 171, 229, 239
            case 3:
            case 5:
            case 65:
            case 71:
            case 109:
            case 111:
            case 137:
            case 139:
            case 169:
            case 171:
            case 229:
            case 239:
                r1 = failChests();
                return r1;
            default:
                return "  ";
        }
    }

    public static String beginning() {
        System.out.println("welcome, traveler!! \njoin us on an adventure, where your choices can alter your fate");
        System.out.println(
                "you're on a journey to find a secret treasure, and you find yourslef in a forest at a crossroads." +
                        "One path points to the left, the other points to the right. Which way do you choose to go? (Type left or right)");
        Scanner scan = new Scanner(System.in);
        String choice = scan.next();
        if (choice.equals("left")) {
            return "left";
        } else {
            return "right";
        }
    }

    public static String hut() {
        Scanner scan = new Scanner(System.in);
        System.out.println("you have found a hut!");
        System.out.println("do you choose to go in? (Type yes or no)");
        String a = scan.nextLine();
        if (a.equals("yes")) {
            a = "left";
        } else {
            a = "right";
        }
        return a;

    }

    public static String treeHouse() {
        Scanner scan = new Scanner(System.in);
        System.out.println("you have found a tree house!");
        System.out.println("do you choose to go in? (Type yes or no)");
        String a = scan.nextLine();
        if (a.equals("yes")) {
            a = "right";
        } else {
            a = "left";
        }
        return a;
    }

    public static String yesHut() {
        System.out.println("oh no! the hut is locked! You can unlock it by solving this riddle!");
        String res = games.riddleGame2();
        if (res.equals("left")) {
            System.out.println("You solved them correctly. You can now enter the hut");
            return "left";
        } else {
            System.out.println("You sold them incorrectly. You are forced to proceed.");
            return "right";
        }
    }

    public static String yesTreeHouse() {
        System.out.println("oh no! the tree house is locked! You can unlock it by solving this riddle!");
        String res = games.riddleGame1();
        if (res.equals("right")) {
            System.out.println("You solved them correctly. You can now enter the tree house");
            return "right";
        } else {
            System.out.println("You sold them incorrectly. You are forced to proceed.");
            return "left";
        }
    }

    public static String enterHut() {
        System.out.println("there is a box inside the hut");
        System.out.println("but you must solve a puzzle to be able to play it");
        Game8.playgame();
        System.out.println("Congrats you have found a small treasure!");
        return "left";
    }

    public static String enterTreeHouse() {
        System.out.println("there is a box inside the tree house");
        System.out.println("but you must solve a puzzle to be able to play it");
        Game1.playgame();
        System.out.println("Congrats you have found a small treasure!");
        return "right";
    }

    public static String leftCampFire() {
        System.out.println("You go back outside and find that it has gotten dark and cold.");
        System.out.println("Now you must build a campfrire");
        games.stepsGame();
        return "left";
    }

    public static String rightCampFire() {
        System.out.println("You go back outside and find that it has gotten dark and cold.");
        System.out.println("Now you must build a campfrire");
        games.stepsGame();
        return "right";
    }

    public static String leftFisherman2() {
        System.out.println(
                "after you wake up you continue on your journey and find the fisherman standing in front of a cave");
        return "left";
    }

    public static String rightFisherman2() {
        System.out.println(
                "after you wake up you continue on your journey and find the fisherman standing in front of a cave");
        return "return";
    }

    public static String caveChests() {
        Scanner scan = new Scanner(System.in);
        System.out.println(
                "You have entered a cave, and inside are two chests! \n");
        System.out.println(
                "You and The Fisherman have decided each get a chest, choose: \n Chest 1 or Chest 2:");
        String res = scan.nextLine();
        if (res.equals("Chest 2")) {
            return "right";
        } else {
            return "left";
        }
    }

    public static String Chest2() {
        Scanner scan = new Scanner(System.in);
        System.out.println(
                "To open the chest, you must first solve this riddle! \n");

        String res = games.riddleGame4();
        if (res.equals("right")) {
            return "right";
        } else {
            return "left";
        }
    }

    public static String Chest1() {
        Scanner scan = new Scanner(System.in);
        System.out.println(
                "To open the chest, you must first solve this riddle! \n");

        String res = games.riddleGame3();
        if (res.equals("right")) {
            return "right";
        } else {
            return "left";
        }
    }

    public static String wrongChest() {
        System.out.println(
                "Chest was EMPTY! fisherman escaped with all the gold");
        System.out.println("You were unable to find the treasure.");

        return "exit";
    }

    public static String failChests() {
        System.out.println(
                "You've failed to open the chest! Now it is locked FOREVER!");
        System.out.println("You were unable to find the treasure.");

        return "exit";
    }

    public static String winChest() {
        System.out.println(
                "Chest opened successfullly! You've found the treasure! CONGRATS!");

        return "exit";
    }

    public static String fisherman() {
        Scanner scan = new Scanner(System.in);
        System.out.println(
                "You have found a fisherman! He asks for your help. Do you wish to help him? (Type yes or no)");
        String res = scan.nextLine();
        if (res.equals("yes")) {
            return "right";
        } else {
            return "left";
        }
    }

}
