import java.util.Scanner;

public class CollatzSequence {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n;
        int max = 0;
        int steps = 0;

        System.out.print("Starting number: ");
        n = keyboard.nextInt();
        max = n;

        while (n != 1) {
            System.out.print(n + "\t");
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
            max = (n > max) ? n : max;
            steps++;
        }
        System.out.println(n);

        System.out.print("\nTerminated after " + steps + " steps.");
        System.out.println(" The largest value was " + max + ".");
    }
}
