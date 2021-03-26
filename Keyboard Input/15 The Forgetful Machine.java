import java.util.Scanner;
public class TheForgetfulMachine {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Give me a word!");
        keyboard.nextLine() ;
        System.out.println("Give me a second word!");
        keyboard.nextLine();

        System.out.println("Great, now your favorite number?");
        keyboard.nextInt();
        System.out.println("And your second-favorite number.. ");
        keyboard.nextInt();
        keyboard.close();
        System.out.println("Whew! Wasn't that fun?");
    }
}
