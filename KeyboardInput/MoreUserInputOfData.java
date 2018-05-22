import java.util.Scanner;

public class MoreUserInputOfData {
    public static void main(String[] args) {
        String first_name, last_name, login_id;
        int grade, student_id;
        double gpa;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the following information so I can sell it for a profit!\n");
        System.out.print("First name: ");
        first_name = keyboard.next();
        System.out.print("Last name: ");
        last_name = keyboard.next();
        System.out.print("Grade (9-12): ");
        grade = keyboard.nextInt();
        System.out.print("Student ID: ");
        student_id = keyboard.nextInt();
        System.out.print("Login: ");
        login_id = keyboard.next();
        System.out.print("GPA (0.0-4.0): ");
        gpa = keyboard.nextDouble();

        System.out.println("Your information:");
        System.out.println("\t\tLogin:\t" + login_id);
        System.out.println("\t\tID:\t" + student_id);
        System.out.println("\t\tName:\t" + first_name + " " + last_name);
        System.out.println("\t\tGPA:\t" + gpa);
        System.out.println("\t\tGrade:\t" + grade);
    }
}
