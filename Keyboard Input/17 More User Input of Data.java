import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the following information so I can sell it for a profit!");
        System.out.print("First name: ");
        String firstName = keyboard.next();
        System.out.print("Last name: ");
        String lastName = keyboard.next();
        System.out.print("Grade (9-12): ");
        int grade = keyboard.nextInt();
        System.out.print("Student ID: ");
        int studentId = keyboard.nextInt();
        System.out.print("Login name: ");
        String loginName = keyboard.next();
        System.out.print(" GPA(0.0 to 4.0): ");
        int gPA = keyboard.nextInt();
      
        keyboard.close();

        System.out.println("Your Information:");
        System.out.println("\tLogin:\t" + loginName);
        System.out.println("\tID: \t" + studentId);
        System.out.println("\tName: \t" + lastName + ", " + firstName);
        System.out.println("\tGPA: \t" + gPA);
        System.out.println("\tGrade: \t" + grade);

    }
}
