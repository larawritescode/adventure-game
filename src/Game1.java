import java.util.Scanner;

public class Game1 {
    public static void playgame() {
        Scanner scan = new Scanner(System.in);
        LinkedList con = new LinkedList();
        con.insert("movie", 1);
        con.insert("film", 2);
        con.insert("hollywood", 3);
        con.insert("star", 4);
        con.insert("comedy", 5);
        con.insert("sequel", 6);
        con.insert("remake", 7);
        con.insert("drama", 8);
        con.insert("actor", 9);
        con.insert("cinema", 10);
        con.insert("thriller", 11);
        con.insert("animate", 12);
        con.insert("blockbuster", 13);
        con.insert("bollywood", 14);
        con.insert("horror", 15);
        con.insert("screen", 16);
        con.insert("theater", 17);
        con.insert("direct", 18);
        con.insert("picture", 19);
        con.insert("soundtrack", 20);
        con.insert("video", 21);
        System.out.println("take as many guesses as you want!");
        System.out.println(
                "the secret word has key = 1. \n the closer you are to the word, the closer the key value would be. if you are not close, the key will be -1");
        System.out.println("Your first hint is: video");
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