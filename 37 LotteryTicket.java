/********************************************************************************
* @Author: Ali Taha                                           @Date: 15/12/2020
* Mr.A. Carreiro
* RedTicketAliTaha.java
* 
* Program Description:
* Aared lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2.
* If all values are 2, the result is 10. If they all have the same value(not 2),
* the result is 5. Otherwise, if b and c are different than a, result is 1. 
* If none of these is true, the result is 0.
* *****************************************************************************/
import java.util.Scanner;                                 // Importing the Scanner library

class RedTicketAliTaha{                                   // Begin class 
   public static void main(String [] arg){                // Begin main() method
   
   //--Variable Declaration And Initialization
      Scanner userInput=new Scanner(System.in);           // Instantiating the Scanner Class
      int a=0, b=0, c=0, ans=0;                           // Declares a, b, c and ans to all be integer variables (primitive data type) and initializes the value
      
      //--User Input
      System.out.printf("Please enter the first number of the lottery ticket: ");      //Uses the Printf function to output a message to the user 
      a=userInput.nextInt();                                                           //Using userInput name of the Scanner Object to enter integer and assign it to the integer variable "a" 
      System.out.printf("Please enter the second number of the lottery ticket: ");
      b=userInput.nextInt();                                                           //Using userInput name of the Scanner Object to enter integer and assign it to the integer variable "b" 
      System.out.printf("Please enter the third number of the lottery ticket: ");
      c=userInput.nextInt();                                                           //Using userInput name of the Scanner Object to enter integer and assign it to the integer variable "c"
             
      //--Program Execution 
      if (a==2&&b==2&&c==2)                                       //The conditional statements ensure that 
      ans=10;                                                    //the right value is outputted based on 
      else if (a==b && a==c && b==c)                             //the conditions in the expression
      ans=5;
      else if (a!=b && a!=c)
      ans=1;
      else
      ans=0;
      
      //--Program Output
         System.out.printf("%d \n",ans);                          //Uses the Printf function to output the final answer
        
           } //end of main() method
} //end of class