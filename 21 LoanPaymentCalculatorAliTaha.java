/************************************************************************************** 
  * @Author: Ali Taha                                            @Date: Nov. 30th 2020
  * Mr. A. Carreiro  
  * MonthlyPaymentCalculatorAliTaha.java
  *
  * Program Description:
  * This program asks the user to enter the value of a loan, following which it calculates
  * the amount of the monthly payments of the loan using the Math Class and prints out 
  * the results using the printf function. 
  * ***********************************************************************************/
import java.util.Scanner;
import java.lang.Math;

class MonthlyPaymentCalculatorAliTaha {
   public static void main(String [] arg)  {
   
      Scanner userInput = new Scanner(System.in); 
   
   //Section 1: Variable Declaration and Initialization
      double principal=0;
      int term=0;
      double interest=0;

   //Section 2:User Input
      System.out.printf("Please enter the principal amount of the product you would like to buy: ");
      principal = userInput.nextDouble();
      System.out.printf("Please enter the number of years the loan will be for: ");
      term = userInput.nextInt();
      System.out.printf("Please enter the yearly interst for the product: ");
      interest = userInput.nextDouble();
         
   //Section 3&4:Program Execution and Output
      System.out.printf("For the amount of $%.2f at a %.2f%% per year %d years, the monthly payment will be $%.2f",principal, interest, term, principal*(interest/100/12)/(1-Math.pow((1+(interest/100/12)),-1*term*12)));

   }  
}  