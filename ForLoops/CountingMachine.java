import java.util.Scanner;

public class CountingMachine {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int number = 0;

        System.out.print("Count to: ");
        number = keyboard.nextInt();

        for (int i = 0; i <= number; i++) {
            System.out.print(i + " ");
        }
    }
}
