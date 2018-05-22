import java.util.Scanner;

public class GenderGame {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String first, last, gender;
        String prefix = "";
        int age;

        System.out.print("What is your gender (M or F)? ");
        gender = keyboard.next();
        System.out.print("First name: ");
        first = keyboard.next();
        System.out.print("Last name: ");
        last = keyboard.next();
        System.out.print("Age: ");
        age = keyboard.nextInt();



        if (gender.equals("F") && age >= 20) {
            System.out.print("\nAre you married, " + first + " (y or n)?");
            if (keyboard.next().equals("y")) {
                prefix = "Mrs. ";
            } else {
                prefix = "Ms. ";
            }
        } else if (age >= 20) {
            prefix = "Mr. ";
        }

        if (prefix.equals("")) {
            System.out.println("\nThen I shall call you " + first + " " + last + ".");
        } else {
            System.out.println("\nThen I shall call you " + prefix + last + ".");
        }
    }
}
