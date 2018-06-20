public class XsAndYs {
    public static void main(String[] args) {
        System.out.println("x\ty\n--------------");
        for (double x = -10.0; x <= 10; x = x + 0.5) {
            System.out.println(x + "\t" + x * x);
        }
    }
}
