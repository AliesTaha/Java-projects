/*******************************************************************
   *@Author: Ali Taha                               @Date:9/9/2021
   *Mr.A. Carreiro 
   *AliTahaEasterCalculator.java
   *
   *Program Description:
   *The purpose of this program is to find the date of Easter Sunday
   *using a sequence of Arithmetic
   ****************************************************************/
import java.util.Scanner;                                          //Importing the Scanner Library 
   
class AliTahaEasterCalculator {                                    //open Class AliTahaEasterCalculator
   public static void main (String [] args){                       //begin main() method
   
   //Section 1: Variable Declaration and Initialization 
      Scanner uI = new Scanner (System.in);                        //Instantiating Scanner Class 
      int year=0, day=0, month=0;                                  //Declaring and initializing Easter's year, day and month variables
      int a=0,b=0,c=0,d=0,f=0,g=0,h=0,j=0,k=0,n=0,p=0,q=0;         //Declaring and initializing the variables for the arithmetic equations
      String monthName= null;                                      //Declaring and initialzing the String variable for the month name
   
   //Section 2: User Input 
   
   //Ask user for a year and uses a do-while loop and a method for error checking 
      do{
         if (year<0)
            System.out.println("Sorry, your year is out of range.");
         System.out.println("Easter Date Calculator: Please enter a year");
         year= error(uI);                                         //Calls the error() method for error-checking 
         uI.nextLine();                                           //Dump contents of the scanner to the next token.
      } while (year<0);                                           //End of do while loop
   
   //Section 3: Program Execution
   
   //Calculations and arithmetic
      a=year/100;
      b=year%100;
      c=(3*(a+25))/4;
      d=(3*(a+25))%4;
      q=(8*(a+11))/25;
      f=(5*a+b)%19;
      g=(19*f+c-q)%30;
      h=(f+11*g)/319;
      j=(60*(5-d)+b)/4;
      k=(60*(5-d)+b)%4;
      n=(2*j-k-g+h)%7;
      month=(g-h+n+114)/31;
      p=(g-h+n+114)%31;
      day=(p+1);
   
   //Switch statement to write the name of the month based on the calculation 
      switch (month){
         case 3:
            monthName= "March";
            break;
         case 4:
            monthName= "April";
            break;
      }//End switch statement
   
   //Section 4: Program Output
   
      System.out.printf("The day of Easter Sunday is on %s %d"+suffix(day)+" in the year %d.\n", monthName, day, year);    //Outputs the final date of Easter Sunday 
   
   } //End of main() method
   
   //This method is used for error checking  
   private static int error (Scanner uI) {
      while (!uI.hasNextInt()){                                  //Negate the hasNextInt to check if there is an integer as an input
         System.out.println("Please enter a valid number");
         uI.nextLine();
      }//end while loop
      int valid = uI.nextInt();
      return (valid);                                            //This returns the value needed for the year
   }//end error() method
   
   
   //This method is used for adding a suffix at the end of the day of the month
   private static String suffix (int n) {
      String suf1=null;
      if (n==11||n==12||n==13){                                  //This if statement ensures that the date 11th, 12th, and 13th is returned
      suf1="th"; 
      }
      else{
      switch (n%10) {                                            //This switch statement ensures that the correct suffix is placed at the end of the date
         case 1:
            suf1="st";
            break;
         case 2:
            suf1="nd";
            break;
         case 3:
            suf1="rd";
            break;
         default:
            suf1="th";
            }                                                    //End of switch statement
      }                                                          //End of else statement                              
      return (suf1);                                             //This returns the correct suffix 
   }//end of suffix() method
   
} //End of class AliTahaEasterCalculator