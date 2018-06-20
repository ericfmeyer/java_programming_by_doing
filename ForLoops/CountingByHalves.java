public class CountingByHalves {
    public static void main(String[] args) {
        System.out.println("x\n------");
        for (double x = -10.0; x <= 10; x = x + 0.5) {
            System.out.println(x);
        }
    }
}
