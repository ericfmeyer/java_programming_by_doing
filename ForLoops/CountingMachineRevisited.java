import java.util.Scanner;

public class CountingMachineRevisited {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int from = 0;
        int to = 0;
        int increment = 0;

        System.out.print("Count from: ");
        from = keyboard.nextInt();

        System.out.print("Count to: ");
        to = keyboard.nextInt();

        System.out.print("Count by: ");
        increment = keyboard.nextInt();

        for (int i = from; i <= to; i = i + increment) {
            System.out.print(i + " ");
        }
    }
}
