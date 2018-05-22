import java.util.Scanner;

public class SpaceBoxing {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int weight_lbs, planet;
        double gravity = 0;

        System.out.print("Please enter your current earth weight (lbs): ");
        weight_lbs = keyboard.nextInt();

        System.out.println("\nI have information for the following planets:");
        System.out.println("\t1. Venus\t2. Mars\t3. Jupiter");
        System.out.println("\t4. Saturn\t5. Uranus\t6. Neptune");
        System.out.print("\nWhich planet are you visiting? ");
        planet = keyboard.nextInt();

        switch (planet) {
            case 1: gravity = 0.78;
                    break;
            case 2: gravity = 0.39;
                    break;
            case 3: gravity = 2.65;
                    break;
            case 4: gravity = 1.17;
                    break;
            case 5: gravity = 1.05;
                    break;
            case 6: gravity = 1.23;
        }

        System.out.println("\nYour weight would be " + weight_lbs * gravity + " pounds on that planet.");
    }
}
