import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      
        Scanner keyboard = new Scanner(System.in);

        int age;
        String heightInFeet;
        String heightInInches;
        double weight;

        System.out.print("How old are you? ");
        age = keyboard.nextInt();

        System.out.print("How many feet tall are you? ");
        heightInFeet = keyboard.next(); //take String input on the same line

        System.out.print("And how many inches? ");
        heightInInches = keyboard.next(); //take String input on the same line

        System.out.print("How much do you weigh? ");
        weight = keyboard.nextDouble();

        System.out.println("So you're " + age + " old, " + heightInFeet + "'" + heightInInches + "\" tall and " + weight + " heavy.");
    }
}
