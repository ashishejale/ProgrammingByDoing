import java.util.Scanner;

public class ADumbCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your first number? ");
        double num1 = scanner.nextDouble();
        System.out.print("What is your second number? ");
        double num2 = scanner.nextDouble();
        System.out.print("What is your third number? ");
        double num3 = scanner.nextDouble();
        System.out.println("( " + num1 + " + " + num2 + " + " + num3 + " )  / 2 is..." + (num1 + num2 + num3)/2 );
    }
}
