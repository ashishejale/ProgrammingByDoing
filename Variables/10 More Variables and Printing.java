package com.ashishejale.learningjava;
public class MoreVariablesAndPrinting {
    public static void main (String[] args) {
        String Name, Eyes, Teeth, Hair;
        int Age, Height, Weight;

        Name = "Zed A. Shaw";
        Age = 35;     // not a lie
        Height = 74;  // inches
        Weight = 180; // lbs
        Eyes = "Blue";
        Teeth = "White";
        Hair = "Brown";

        System.out.println( "Let's talk about " + Name + "." );
        System.out.println( "He's " + Height + " inches (or " + (Height * 2.54) + " cm) tall." );
        System.out.println( "He's " + Weight + " pounds (or " + Math.round(Weight * 0.453592) + " kg) heavy." );
        System.out.println( "Actually, that's not too heavy." );
        System.out.println( "He's got " + Eyes + " eyes and " + Hair + " hair." );
        System.out.println( "His teeth are usually " + Teeth + " depending on the coffee." );

        // This line is tricky; try to get it exactly right.
        System.out.println( "If I add " + Age + ", " + Height + ", and " + Weight
                            + " I get " + (Age + Height + Weight) + "." );
    }
}
