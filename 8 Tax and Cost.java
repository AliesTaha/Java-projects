/************************************************************
*@Author: Ali Taha                          @Date:20/11/2020
*The user is requested to input a cost of an item and the
*program will calculate tax and cost
************************************************************/
import java.util.Scanner;
class number4{
   public static void main (String [] arg){
      Scanner userInput=new Scanner(System.in);  // Instantiating the Scanner Class
   
   //Variable Declaration and Initialization
      double cost = 0;
   
   //UserInput
      System.out.println("Please enter the cost of an item:");
      cost = userInput.nextDouble();
   
   //Program Execution
      double tax= 0.13*cost;
      double costF= tax+cost;
   
   //Program Output
      System.out.printf("The tax on an item that costs $%.2f is $%.2f and total cost is $%.2f", cost, tax, costF);
   }
}
