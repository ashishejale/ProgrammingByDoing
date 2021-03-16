public class VariablesAndNames{

    public static void main( String[] args ){
    
        int cars, drivers, passengers, cars_not_driven, cars_driven; // declare int variables
        double space_in_a_car, carpool_capacity, average_passengers_per_car; // declare float variables

        cars = 100; // initialaize int car variable to 100
        space_in_a_car = 4.0; // initialize double space_in_a_car to 4.0
        drivers = 30; // initialize int drivers variable to 30
        passengers = 90; // initialize int passangers variable to 90
        cars_not_driven = cars - drivers; // initialize int cars_not_drive
        cars_driven = drivers; // initialize cars_driven
        carpool_capacity = cars_driven * space_in_a_car; //initialize double carpool_capacity
        average_passengers_per_car = passengers / cars_driven; //initialze double average_passengers_per_car


        System.out.println( "There are " + cars + " cars available." ); // print value
        System.out.println( "There are only " + drivers + " drivers available." ); //print value
        System.out.println( "There will be " + cars_not_driven + " empty cars today." ); //print value
        System.out.println( "We can transport " + carpool_capacity + " people today." ); //print value
        System.out.println( "We have " + passengers + " to carpool today." ); //print value
        System.out.println( "We need to put about " + average_passengers_per_car + " in each car." ); //print value
    }
}
    
        
