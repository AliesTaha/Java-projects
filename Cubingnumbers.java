/******************************************************************
*@Author: Ali Taha                          @Date:20/11/2020
*The program calculates the cube of an integer value. The user
* will be prompted to enter an integer number between 1 and
* 10 and then your program will calculate the cube of that number
******************************************************************/
import java.util.Scanner;

 class number6{
public static void main (String [] arg){
Scanner userInput=new Scanner(System.in);  // Instantiating the Scanner Class

//Variable Declaration and Initialization
int num = 0;

 //UserInput
 System.out.println("Please enter an integer between 1 and 10, inclusively.");
 num=userInput.nextInt();
 
 //Program Output
System.out.printf("The cube of %d is %d\n", num,(int)Math.pow(num,3));

int val=1;
switch (val)
      {
         case 1: System.out.print("P");
         case 2: 
         case 3: System.out.print("Q");
            break;
         case 4: System.out.print("R");
         default: System.out.print("S");
      }

String s="This is a string";
int x = s.length();
System.out.println(x);

int i=4;
      int j=1;
   
      j= i<5 ? ++j : --j ;
   
      System.out.print(j);
      
//String ayString = "ay";
//String pigString;
//System.out.println(pigstring);

int num2=22;
   if (num2 >0) if (num2 %5 ==0)
   System.out.println(num2);
   else System.out.println(num2+" is negative");

 }
}
