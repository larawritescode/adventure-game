import java.util.Scanner;

public class games {
    public static String riddleGame1() {

        Scanner scan = new Scanner(System.in);
        int correctCount = 0;

        // String riddle1 = "I create my lair with earthen string, and dispatch my prey
        // with a biting sting. What am I?";
        String riddle2 = "Some try to hide, some try to cheat; but time will show, we always will meet. Try as you might to guess my name. What am I?";
        String riddle3 = "Never resting, never still; moving silently from hill to hill; it does not walk, run or trot; all is cool where it is not. What am I?";
        String riddle4 = "What can bring back the dead; make you cry, make you laugh, make you young; is born in an instant, yet lasts a lifetime. What am I?";

        // String ans1 = "Spider", sugg1 = "Bee", in1 = "";
        String ans2 = "Death", sugg2 = "Destiny", in2 = "";
        String ans3 = "The Sun", sugg3 = "The Moon", in3 = "";
        String ans4 = "Memory", sugg4 = "A Name", in4 = "";

        System.out.println("The following game is a riddle! \n");
        System.out.println("Each riddle will be displayed with two suggestions");
        System.out.println("But only 1 of them is CORRECT!");

        System.out.println("First Game: \n");

        // First Riddle:
        // System.out.println(riddle1);
        // System.out.println("CHOOSE AN ANSWER FROM BELOW");
        // System.out.print("SUGGESTIONS: " + ans1 + " OR " + sugg1 + "\n");
        // System.out.println("Input Answer: ");
        // in1 = scan.nextLine();
        // if (in1.equals(ans1))
        // correctCount = correctCount + 1;

        // Second Riddle:
        System.out.println(riddle2);
        System.out.println("CHOOSE AN ANSWER FROM BELOW");
        System.out.print("SUGGESTIONS: " + sugg2 + " OR " + ans2 + "\n");
        System.out.println("Input Answer: ");
        in2 = scan.nextLine();
        if (in2.equals(ans2))
            correctCount = correctCount + 1;
        System.out.println("Second Game: \n");

        // Third Riddle:
        System.out.println(riddle3);
        System.out.println("CHOOSE AN ANSWER FROM BELOW");
        System.out.print("SUGGESTIONS: " + sugg3 + " OR " + ans3 + "\n");
        System.out.println("Input Answer: ");
        in3 = scan.nextLine();
        if (in3.equals(ans3))
            correctCount = correctCount + 1;

        System.out.println("Third Game: \n");
        // Fourth Riddle:
        System.out.println(riddle4);
        System.out.println("CHOOSE AN ANSWER FROM BELOW");
        System.out.print("SUGGESTIONS: " + ans4 + " OR " + sugg4 + "\n");
        System.out.println("Input Answer: ");
        in4 = scan.nextLine();
        if (in4.equals(ans4))
            correctCount = correctCount + 1;

        String res = "";
        if (correctCount >= 2) {
            res = "right";
        } else {
            res = "left";
        }
        return res;
    }

    public static String riddleGame2() {

        Scanner scan = new Scanner(System.in);
        int correctCount = 0;

        String riddle1 = "What is always old and sometimes new; never sad, sometimes blue; never empty, but sometimes full; never pushes, always pulls? What am I?";
        // String riddle2 = "What is large, yet never grows; has roots that cannot be
        // seen; and is taller than trees? What am I?";
        String riddle3 = "I'm alive, but without breath; I'm as cold in life as in death; I'm never thirsty, though I always drink. What am I?";
        String riddle4 = "In spring I am gay in handsome array; in summer more clothing I wear; when colder it grows, I fling off my clothes; and in winter quite naked appear. What am I?";

        String ans1 = "The Moon", sugg1 = "The Sky", in1 = "";
        // String ans2 = "A Mountain", sugg2 = "A City", in2 = "";
        String ans3 = "A Fish", sugg3 = "Jellyfish", in3 = "";
        String ans4 = "A Tree", sugg4 = "A Goat", in4 = "";

        System.out.println("The following game is a riddle! \n");
        System.out.println("Each riddle will be displayed with two suggestions");
        System.out.println("But only 1 of them is CORRECT!");

        System.out.println("First Game: \n");

        // First Riddle:
        System.out.println(riddle1);
        System.out.println("CHOOSE AN ANSWER FROM BELOW");
        System.out.print("SUGGESTIONS: " + ans1 + " OR " + sugg1 + "\n");
        System.out.println("Input Answer: ");
        in1 = scan.nextLine();
        if (in1.equals(ans1))
            correctCount = correctCount + 1;

        // System.out.println("Second Game: \n");

        // // Second Riddle:
        // System.out.println(riddle2);
        // System.out.println("CHOOSE AN ANSWER FROM BELOW");
        // System.out.print("SUGGESTIONS: " + sugg2 + " OR " + ans2 + "\n");
        // System.out.println("Input Answer: ");
        // in2 = scan.nextLine();
        // if (in2.equals(ans2))
        // correctCount = correctCount + 1;

        System.out.println("Second Game: \n");

        // Third Riddle:
        System.out.println(riddle3);
        System.out.println("CHOOSE AN ANSWER FROM BELOW");
        System.out.print("SUGGESTIONS: " + sugg3 + " OR " + ans3 + "\n");
        System.out.println("Input Answer: ");
        in3 = scan.nextLine();
        if (in3.equals(ans3))
            correctCount = correctCount + 1;

        System.out.println("Third Game: \n");
        // Fourth Riddle:
        System.out.println(riddle4);
        System.out.println("CHOOSE AN ANSWER FROM BELOW");
        System.out.print("SUGGESTIONS: " + ans4 + " OR " + sugg4 + "\n");
        System.out.println("Input Answer: ");
        in4 = scan.nextLine();
        if (in4.equals(ans4))
            correctCount = correctCount + 1;
        String res = "";
        if (correctCount >= 2) {
            res = "left";
        } else {
            res = "right";
        }
        return res;
    }

    public static String riddleGame3() {

        Scanner scan = new Scanner(System.in);
        int correctCount = 0;

        String riddle1 = "At night they come without being fetched, and by day they are lost without being stolen. What am I?";
        String riddle2 = "What can run, but never walks; has a mouth, but never talks; has a head, but never weeps; has a bed, but never sleeps? What am I?";
        // String riddle3 = "This thing all things devour: birds, beasts, trees,
        // flowers; gnaws iron, bites steel; grinds hard stones to meal; slays kings,
        // ruins towns; and beats high mountains down. What am I?";
        String riddle4 = "As small as your thumb, I am light in the air. You may hear me before you see me, but trust that I'm here. What am I?";

        String ans1 = "Stars", sugg1 = "Moon", in1 = "";
        String ans2 = "A river", sugg2 = "A Chariot", in2 = "";
        // String ans3 = "Time", sugg3 = "Armies", in3 = "";
        String ans4 = "A Hummingbird", sugg4 = "A Mosquito", in4 = "";

        System.out.println("The following game is a riddle! \n");
        System.out.println("Each riddle will be displayed with two suggestions");
        System.out.println("But only 1 of them is CORRECT!");

        System.out.println("First Game: \n");

        // First Riddle:
        System.out.println(riddle1);
        System.out.println("CHOOSE AN ANSWER FROM BELOW");
        System.out.print("SUGGESTIONS: " + ans1 + " OR " + sugg1 + "\n");
        System.out.println("Input Answer: ");
        in1 = scan.nextLine();
        if (in1.equals(ans1))
            correctCount = correctCount + 1;

        System.out.println("Second Game: \n");

        // Second Riddle:
        System.out.println(riddle2);
        System.out.println("CHOOSE AN ANSWER FROM BELOW");
        System.out.print("SUGGESTIONS: " + sugg2 + " OR " + ans2 + "\n");
        System.out.println("Input Answer: ");
        in2 = scan.nextLine();
        if (in2.equals(ans2))
            correctCount = correctCount + 1;

        System.out.println("Third Game: \n");

        // // Third Riddle:
        // System.out.println(riddle3);
        // System.out.println("CHOOSE AN ANSWER FROM BELOW");
        // System.out.print("SUGGESTIONS: " + sugg3 + " OR " + ans3 + "\n");
        // System.out.println("Input Answer: ");
        // in3 = scan.nextLine();
        // if (in3.equals(ans3))
        // correctCount = correctCount + 1;

        // System.out.println("Fourth Game: \n");
        // Fourth Riddle:
        System.out.println(riddle4);
        System.out.println("CHOOSE AN ANSWER FROM BELOW");
        System.out.print("SUGGESTIONS: " + ans4 + " OR " + sugg4 + "\n");
        System.out.println("Input Answer: ");
        in4 = scan.nextLine();
        String res = "";
        if (correctCount >= 2) {
            res = "right";
        } else {
            res = "left";
        }
        return res;
    }

    public static String riddleGame4() {
        Scanner scan = new Scanner(System.in);
        int correctCount = 0;

        String riddle1 = "I create my lair with earthen string, and dispatch my prey with a biting sting. What am I?";
        String riddle2 = "What is large, yet never grows; has roots that cannot be seen; and is taller than trees? What am I?";
        String riddle3 = "This thing all things devour: birds, beasts, trees, flowers; gnaws iron, bites steel; grinds hard stones to meal; slays kings, ruins towns; and beats high mountains down. What am I?";
        String ans1 = "Spider", sugg1 = "Bee", in1 = "";
        String ans2 = "A Mountain", sugg2 = "A City", in2 = "";
        String ans3 = "Time", sugg3 = "Armies", in3 = "";
        System.out.println("The following game is a riddle! \n");
        System.out.println("Each riddle will be displayed with two suggestions");
        System.out.println("But only 1 of them is CORRECT!");

        System.out.println("First Game: \n");

        // First Riddle:
        System.out.println(riddle1);
        System.out.println("CHOOSE AN ANSWER FROM BELOW");
        System.out.print("SUGGESTIONS: " + ans1 + " OR " + sugg1 + "\n");
        System.out.println("Input Answer: ");
        in1 = scan.nextLine();
        if (in1.equals(ans1))
            correctCount = correctCount + 1;

        System.out.println("Second Game: \n");

        // Second Riddle:
        System.out.println(riddle2);
        System.out.println("CHOOSE AN ANSWER FROM BELOW");
        System.out.print("SUGGESTIONS: " + sugg2 + " OR " + ans2 + "\n");
        System.out.println("Input Answer: ");
        in2 = scan.nextLine();
        if (in2.equals(ans2))
            correctCount = correctCount + 1;

        // Third Riddle:
        System.out.println(riddle3);
        System.out.println("CHOOSE AN ANSWER FROM BELOW");
        System.out.print("SUGGESTIONS: " + sugg3 + " OR " + ans3 + "\n");
        System.out.println("Input Answer: ");
        in3 = scan.nextLine();
        if (in3.equals(ans3))
            correctCount = correctCount + 1;
        String res = "";
        if (correctCount >= 2) {
            res = "left";
        } else {
            res = "right";
        }
        return res;

    }

    public static void stepsGame() {
        System.out.println("The following is a list of steps to create a campfire, but the order is INCORRECT\n" +
                "Your task is to write the steps in the correct order\n" +
                "You must write the string of the next step until all the steps are finished");
        boolean f = woods.buildCampfire();
        if (f) {
            System.out.println("Congrats you have successfully built a fire and can sleep well tonight");
        } else {
            System.out.println("You were unsuccessful at building a fire and now you will sleep cold");
        }
    }

}
