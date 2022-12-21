/*****************************************************************************************************************
* @Author: Ali Taha                                                                              @Date: 8/9/2021
* Mr.A. Carreiro
* DistanceCalculator.java
* 
* Program Description:
* This program calculates the distance between two places using trigonometric arithmetic, latitudes and longitudes
******************************************************************************************************************/
import java.util.Scanner;                                 //Importing the Scanner Library 

class DistanceCalculator{                                 //Begin class DistanceCalculator
   public static void main (String [] args){              //Begin main() method
      
      //-----Variable Declaration And Initialization-----
      Scanner uI = new Scanner(System.in);                        //Instantiating the Scanner Class 
      double lat1=0, lat2=0, long1=0, long2=0, distance=0;        //Declares and initializes the floating point variables 
      
      //-----User Input----
      System.out.print ("Please enter the latitude for location 1 \n");   //Ask user for latitude of location 1
      lat1 = error(uI);
      uI.nextLine();                                                       //Dump contents of Scanner into next token
      System.out.print ("Please enter the longitude for location 1 \n");  //Ask user for longitude of location 1
      long1 = error(uI);
      uI.nextLine();                                                       //Dump contents of Scanner into next token
      System.out.print ("Please enter the latitude for location 2 \n");   //Ask user for latitude of location 2
      lat2 = error(uI);
      uI.nextLine();                                                       //Dump contents of Scanner into next token
      System.out.print ("Please enter the longitude for location 2 \n");   //Ask user for longitude of location 2
      long2 = error(uI);
      uI.nextLine();                                                       //Dump contents of Scanner into next token
   
      //----Program Execution-------
      distance= 6378.8*Math.acos(Math.sin(lat1/(180/Math.PI))*Math.sin((lat2/(180/Math.PI)))+Math.cos((lat1/(180/Math.PI)))*Math.cos((lat2/(180/Math.PI)))*Math.cos((long2/(180/Math.PI))-long1/(180/Math.PI)));
      
      //----Program Output-------
      System.out.println("The distance between the two locations is "+distance+" km"); //Output the final distance
   
   } //Close main() 
   
   private static double error (Scanner uI){                 //begin method error for error checking
   while (!uI.hasNextDouble()) {                             //Negate the hasNextDouble to check if there is a floating point as an input
   System.out.println("Please enter a valid decimal number");
   uI.nextLine();                                            //Dump contents of Scanner into next token
   }//end while loop 
   double valid1=uI.nextDouble();
   return (valid1);                                         //Return Answer
   }//end error checking method
} //Close DistanceCalculator Class


/*
ask user for location1 lat and set lat1 to response 

ask user for location1 long and set long1 to response

ask user for location2 lat and set lat2 to response 

ask user for location2 long and set long2 to response 

distance= 6378.8*arccos[sin(lat1/(180/PI))*sin(lat2/(180/PI))+cos(lat1/(180/PI))*cos(lat2/(180/PI))*cos(lon2/(180/PI)-lon1/(180/PI))]

display distance
*/
