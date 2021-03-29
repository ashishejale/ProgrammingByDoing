import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hey, what's your name? ");
        String name = scanner.next();
        System.out.print("Ok, " + name + ", how old are you? ");
        int age = scanner.nextInt();
        scanner.close();

        if (age < 16) {
            System.out.println("You can't drive, " + name + ".");
        }

        if (age < 18) {
            System.out.println("You can't vote, " + name + ".");
        }

        if (age < 25) {
            System.out.println("You can't rent a car, " + name + ".");
        }

        if (age >= 25 ) {
            System.out.println("You can do anything that's legal, " + name + ".");
        }
    }
}
