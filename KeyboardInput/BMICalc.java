import java.util.Scanner;

public class BMICalc {
    public static void main(String[] args) {
        float height_m, weight_kg, bmi;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Your height in m: ");
        height_m = keyboard.nextFloat();

        System.out.print("Your weight in kg: ");
        weight_kg = keyboard.nextFloat();

        bmi = weight_kg / (height_m * height_m);
        System.out.println("Your BMI is " + bmi);
    }
}
