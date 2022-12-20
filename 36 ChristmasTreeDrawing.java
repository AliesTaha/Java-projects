/*************************************************************************
* @Author: Ali Taha                                    @Date: 18/12/2020
* Mr.A. Carreiro
* OhChristmasTreeJava.java
* 
* Program Description
* This program uses a while loop to output a christmas tree
* **********************************************************************/
class OhChristmasTreeJava{                                // Begin class 
   public static void main(String [] arg){                // Begin main() method
   
   //--Variable Declaration And Initializations
      int count=0,a=0;                                  // Declares count and a to be integer variables (primitive data type) and initializes it
      
      //--Program Execution and Output
      System.out.println("012345678901234567890123456789");
      while (a < 20) {
   for (int b = 0; b < 20 - a; b++) {
    System.out.print(" ");
    }
   for (int c = 0; c < (2 * a + 1); c++) {
    System.out.print("*");
    }
   System.out.println();
   a++;
 }
 System.out.println("                   ***");
 System.out.println("                   ***");
 System.out.println(" *                 ***                 *");

   } //end of main() method
} //end of class