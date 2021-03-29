import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your height (feet only): ");
        int feet = scanner.nextInt();
        System.out.print("Your height (inches): ");
        int inches = scanner.nextInt();
        System.out.print("Your weight in pounds: ");
        int pounds = scanner.nextInt();
      
        int totalInches = feet * 12 + inches;
        double heightInMeters = totalInches * 0.0254d;
        double weightInKilograms = pounds * 0.453592d;
        System.out.println("Your BMI is " + (weightInKilograms / (heightInMeters * heightInMeters)));
    }
}
