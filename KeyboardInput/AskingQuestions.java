import java.util.Scanner;

public class AskingQuestions {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int age;
        int height_ft, height_in;
        double weight;

        System.out.println("How old are you?");
        age = keyboard.nextInt();

        System.out.println("How many feet tall are you?");
        height_ft = keyboard.nextInt();

        System.out.println("And how many inches?");
        height_in = keyboard.nextInt();

        System.out.println("How much do you weigh?");
        weight = keyboard.nextDouble();

        System.out.println("So you're " + age + " old, " + height_ft + "'" + height_in + "\"" + " tall and " + weight + " heavy.");
    }
}
