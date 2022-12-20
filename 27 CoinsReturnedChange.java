/*********************************************************************************************** 
  * @Author: Ali Taha                                                     @Date: Dec. 7th 2020
  * Mr. A. Carreiro  
  * MakingChangeAliTaha.java
  *
  * Program Description:
  * This program determines the change to be dispensed from a vending machine for an item in the
  * machine that costs between 2 cents and a dollar. The program uses if statements and outputs
  * how much change they get back from their dollar, and how it will be returned in coins.
  * *******************************************************************************************/
import java.util.Scanner;

class MakingChangeAliTaha{
   public static void main(String [] arg)  {
   
   //--Variable Declaration and Initialization
      Scanner userInput = new Scanner(System.in);
      int cost=0;
      int change=0;  
         
   //--User Input
      System.out.printf("You have 1 dollar.%n");
      System.out.printf("Please enter a product amount between 2 cents and 1 dollar as an integer in order to calculate your change.%n");
      System.out.printf("For example, enter 25 for 25 cents or 1 for a dollar. ");
      cost=userInput.nextInt();
      
   //--Program Execution  
   change=100-cost;
   
   //--Program Output
   System.out.println();
   if(cost>=2 && cost<=99){
   System.out.printf("Your change is %d cents and you will get back:\n", change);
   System.out.printf("%d quarter(s)\n", change/25);
   System.out.printf("%d dime(s)\n", (change%25)/10);
   System.out.printf("%d nickle(s)\n", ((change%25)%10)/5);
   System.out.printf("%d penny(s)", (((change%25)%10)%5));
   }
      else if (cost==1){
      System.out.printf("You get no change. Your item cost a dollar.");
      }
      else{
         System.out.printf("Your product cost is out of range.");
         }
   } //end of main() method
} //end of class