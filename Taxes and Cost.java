/***********************************************
*@Author: Ali Taha            @Date: 21/11/2020
*Program is used to show the price, taxes and  
*total cost of a Latte, which is outputted using
*the printf function
************************************************/

class OutputExamples6AMrA { 
   public static void main(String [] arg) {
   //For each of the following, what is outputted
   
   //Variable Declaration and Initialization
      String itemName = "Latte"; 
      double itemCost = 5.98; 
      double itemTax = 0.78; 
      double cost =6.76; 
   
   //Program Output
      System.out.printf("%-10s%10s\n","Item","Cost");
      System.out.printf("%20s\n","====================");
      System.out.printf("%-10s%6s%.2f\n",itemName,"$",itemCost);
      System.out.printf("%-10s%7s%.2f\n","HST","$",itemTax);
      System.out.printf("%20s\n","====================");
      System.out.printf("%15s=%s%.2f\n","Total","$",cost);
   
   } // end of main() method --------
} // end of the whole program.
