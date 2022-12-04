import java.util.Scanner;

public class woods {
    public static boolean buildCampfire() {
        LinkedList campFire = new LinkedList();
        Scanner scan = new Scanner(System.in);
        Stack st = new Stack(7);
        Stack correctOrder = new Stack(7);
        correctOrder.Push("create a fire pit");
        correctOrder.Push("gather the fire wood");
        correctOrder.Push("lay your wood");
        correctOrder.Push("light the campfire");
        correctOrder.Push("build up and maintain the fire");
        correctOrder.Push("extinguish the campfire");
        correctOrder.Push("clean up the mess");

        correctOrder.reverseStack(correctOrder);
        campFire.insert("clean up the mess");
        campFire.insert("build up and maintain the fire");
        campFire.insert("gather the fire wood");
        campFire.insert("create a fire pit");
        campFire.insert("lay your wood");
        campFire.insert("light the campfire");
        campFire.insert("extinguish the campfire");
        for (int i = 0; i < 7; i++) {
            campFire.display();
            String nextStep = scan.nextLine();
            campFire.delete(nextStep);
            st.Push(nextStep);
            System.out.println();
        }
        boolean f = correctOrder.compareStacks(st, correctOrder);
        return f;

    }
}
