/********************************************************************************
* @Author: Ali Taha                                           @Date: 6/1/2021
* Mr.A. Carreiro
* ArrayHighLow.java
* 
* Program Description:
* This program implements an array and asks the user for the length of an array
* that will be populated with random numbers. The program then displays the 
* numbers and displays the highest and lowest numbers. 
* *****************************************************************************/
import java.lang.Math;
import java.util.Scanner;

class ArrayHighLow {
   public static void main(String arg[]){
   
   //Variable Declaration and Initialization
      Scanner uI = new Scanner(System.in);
      int array[];
      int x=0,y,z;
   
   //User Input
      do{
      System.out.println("Please enter the desired length of the array:");
      while (!uI.hasNextInt()){
      System.out.println("Please enter a length greater than 0");
      uI.nextLine(); 
      }
      x=uI.nextInt();
      uI.nextLine(); 
      } while(x<=0);
      
      array=new int[x];
   
   //Program Execution and Output
      for (int i=0; i<array.length; i++){                                //Initializes the array with random values
         array[i]= (int)(Math.random()*100+1);           
      }//end for
   
   z=array[0];     
   y=array[0];
   
      System.out.println("The values of the arrays are as follows:");
      for (int i=0; i<array.length; i++) {                              // Returns the values stored in the array, checks and sets the highest and lowest number
      System.out.printf("array[%d] has a value of %d\n",i,array[i]);
      if (array[i]>z)                           //sets high
      z=array[i];
      if (array[i]<y)                           //sets low
      y=array[i];

      
      }
      System.out.println("The highest number is: "+z);
      System.out.println("The lowest number is: "+y);

   }
}