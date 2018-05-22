import java.util.Random;

public class FortuneCookie {
    public static void main(String[] args) {
        Random r = new Random();

        output_fortune(1 + r.nextInt(6));
        output_numbers(r);
    }

    public static void output_fortune(int x) {
        String fortune;
        switch (x) {
            case 1: fortune = "Go travel and discover the world!";
                    break;
            case 2: fortune = "You will meet someone.";
                    break;
            case 3: fortune = "Tomorrow is another day.";
                    break;
            case 4: fortune = "Someone will knock on your door.";
                    break;
            case 5: fortune = "Richess will fall upon your lap.";
                    break;
            case 6: fortune = "Nature will win!";
                    break;
            default: fortune = "ERROR";
        }
        System.out.println(fortune);
    }

    public static void output_numbers(Random r) {
        System.out.print("   ");
        for (int i = 0; i < 5; i++) {
            System.out.print((1 + r.nextInt(54)) + " - ");
        }
        System.out.print(1 + r.nextInt(54));
    }
}
