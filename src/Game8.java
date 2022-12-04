import java.util.Scanner;

public class Game8 {
    public static void playgame() {
        Scanner scan = new Scanner(System.in);
        LinkedList con = new LinkedList();
        con.insert("computer", 1);
        con.insert("software", 2);
        con.insert("pc", 3);
        con.insert("technology", 4);
        con.insert("compute", 5);
        con.insert("laptop", 6);
        con.insert("internet", 7);
        con.insert("ibm", 8);
        con.insert("system", 9);
        con.insert("hardware", 10);
        con.insert("electronic", 11);
        con.insert("desktop", 12);
        con.insert("microsoft", 13);
        con.insert("user", 14);
        con.insert("machine", 15);
        con.insert("digital", 16);
        con.insert("datum", 17);
        con.insert("programmer", 18);
        con.insert("web", 19);
        con.insert("device", 20);
        con.insert("database", 21);
        System.out.println("take as many guesses as you want!");
        System.out.println(
                "the secret word has key = 1. the closer you are to the word, the closer the key value would be."
                        + "if you are not close, the key will be -1");
        System.out.println("Your first hint is: database");
        System.out.println("Now start guessing!");
        while (true) {
            String guess = scan.nextLine();
            int a = con.search(guess);
            if (a == 1) {
                System.out.println("congrats you win!");
                break;
            } else if (a == -1) {
                System.out.println("the word is a far guess");
                System.out.println(a);
            } else {
                System.out.println("getting close!");
                System.out.println(a);
            }
        }

    }
}