public class ElseAndIf {
	public static void main(String[] args) {
		int people = 30;
		int cars = 40;
		int buses = 15;

		if (cars > people) {
            System.out.println("We should take the cars.");
        }
        else if (cars < people) { //prints statement below when if condition is not satisfied, but else if condition is satisfied
            System.out.println("We should not take the cars.");
        } else { //prints below statement when all earlier conditions are not satisfied
            System.out.println("We can't decide.");
        }


        if (buses > cars) {
            System.out.println("That's too many buses.");
        }
        if (buses < cars) { //removing else part from here started an independent if statement, evaluates this if even when earlier if is evaluated
            System.out.println("Maybe we could take the buses.");
        } else {
            System.out.println("We still can't decide.");
        }

        if (people > buses) {
            System.out.println("All right, let's just take the buses.");
        } else {
            System.out.println("Fine, let's stay home then.");
        }

	}
}
