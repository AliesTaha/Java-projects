/*************************************************************************** 
  * Ali Taha                                                              Date: Nov. 18th 2020
  * Mr. A. Carreiro  
  * Program Description:
  * This program asks the user to enter three integers, following
  * which it outputs the average of the three integers to two decimal places
  * ************************************************************************/
import java.util.Scanner;
class WhatDoIDoCarreiro {//begin class       
   
   private static Scanner uI;

   public static void main (String [] arg){//begin main() method
      uI = new Scanner (System.in);
      int num1=0, num2=0, num3=0;
      double average=0;
      
      //--User Input--
      System.out.println("1: Enter an integer:");
      num1=uI.nextInt();
      System.out.println("2: Enter a second integer:");
      num2=uI.nextInt();
      if (num1 == 0)
         System.out.println();
      System.out.println("3: Enter a third integer:");
      num3=uI.nextInt();
        
      //--Program Execution--
      average = (num1+num2+num3)/3.0;
           
      //--Program Output--
      System.out.printf("%.2f is the median of the three integers entered", average);
   }// end main() method
}// end class WhatDoIDoCarreiro
