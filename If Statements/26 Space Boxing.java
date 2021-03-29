import java.util.Scanner;

public class SpaceBoxing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your current earth weight: ");
        double earthWeight = scanner.nextDouble();
        System.out.println("I have information for the following planets:");
        System.out.println("\t1. Venus\t2. Mars\t\t3. Jupiter");
        System.out.println("\t4. Saturn\t5. Uranus\t6. Neptune");
        System.out.print("Which planet are you visiting? ");
        int planetNumber = scanner.nextInt();

        scanner.close();

        double weightOnOtherPlanet = 0.0d;
        if(planetNumber == 1) {
            weightOnOtherPlanet = earthWeight * 0.78d;
        } else if(planetNumber == 2) {
            weightOnOtherPlanet = earthWeight * 0.39d;
        } else if(planetNumber == 3) {
            weightOnOtherPlanet = earthWeight * 2.65d;
        } else if(planetNumber == 4) {
            weightOnOtherPlanet = earthWeight * 1.17d;
        } else if(planetNumber == 5) {
            weightOnOtherPlanet = earthWeight * 1.05d;
        } else if(planetNumber == 6) {
            weightOnOtherPlanet = earthWeight * 1.23d;
        }
        System.out.println("Your weight would be " + weightOnOtherPlanet + " pounds on that planet.");
    }
}
