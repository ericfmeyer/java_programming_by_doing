public class FizzBuzz {
    public static void main(String[] args) {
        String output = "";

        for (int i = 1; i < 101; i++) {
            if (i % 15 == 0) {
                output = "FizzBuzz";
            } else if (i % 5 == 0) {
                output = "Buzz";
            } else if (i % 3 == 0) {
                output = "Fizz";
            } else {
                output = Integer.toString(i);
            }
            System.out.println(output);
        }
    }
}
