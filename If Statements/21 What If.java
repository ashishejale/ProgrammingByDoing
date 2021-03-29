public class WhatIf {
	public static void main( String[] args ) { //curly braces define the scope of the method/control statement
	
      int people = 30; //when people == cats no message of cats is printed
      int cats = 30;
      int dogs = 15;

      if ( people < cats ) { //if people is < cats prints below message else exits if statement
          System.out.println( "Too many cats!  The world is doomed!" );
      }

      if ( people > cats ) { //if people is > cats prints below message else exits if statement
          System.out.println( "Not many cats!  The world is saved!" );
      }

      if ( people < dogs ) {  //if people is < dogs prints below message else exits if statement
          System.out.println( "The world is drooled on!" );
      }

      if ( people > dogs ) { //if people is > dogs prints below message else exits if statement
          System.out.println( "The world is dry!" );
      }

      dogs += 5;

      if ( people >= dogs ) { //if people is > or = dogs prints below message else exits if statement
          System.out.println( "People are greater than or equal to dogs." );
      }

      if ( people <= dogs ) { //if people is < or = dogs prints below message else exits if statement
          System.out.println( "People are less than or equal to dogs." );
      }

      if ( people == dogs ) { //if people is exactly = dogs prints below message else exits if statement
          System.out.println( "People are dogs." );
      }
  }
}
