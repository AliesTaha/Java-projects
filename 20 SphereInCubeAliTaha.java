/********************************************************************************************** 
  * @Author: Ali Taha                                                    @Date: Nov. 30th 2020
  * Mr. A. Carreiro  
  * SphereInCubeAliTaha.java
  *
  * Program Description:
  * This program asks the user to enter the length of one side of the cube, following which it
  * calculates the left over volume of the cube that holds a sphere with a diameter of the
  * length of the cube using the Math Class and prints out the results using the printf function. 
  * *******************************************************************************************/
import java.util.Scanner;
import java.lang.Math;

class SphereInCubeAliTaha {
   public static void main(String [] arg)  {
   
      Scanner userInput = new Scanner(System.in); 
   
   //Section 1: Variable Declaration and Initialization
      int side=0;
   
   //Section 2:User Input
      System.out.printf("Please enter the length of one side of the cube: ");
      side = userInput.nextInt();
     
         
   //Section 3:Program Execution
   double volumeSphere = 4.0/3*Math.PI*Math.pow(side/2.0,3);
   double volumeCube = Math.pow(side,3);
   
   //Section 4:Program Output
      System.out.printf("The volume of a sphere with a diameter of %d is %.2f^3\n",side, volumeSphere);
      System.out.printf("The volume of a cube with a side length of %d is %.2f^3\n",side, volumeCube);
      System.out.printf("The volume of a cube minus the displaced volume of the sphere is %.2f^3",volumeCube-volumeSphere);
   }  
}