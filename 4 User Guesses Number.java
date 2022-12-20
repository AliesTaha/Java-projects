/****************************************************************************************
 * @Author: Ali Taha                                                 @Date: 16/12/20198
 * This program generates a random number between 1 and 10 and the user has to guess it
 * *************************************************************************************/
import java.util.Scanner;
import java.util.Random;
class GuessNumOneTen {
   public static void main(String[]arg){
   //Section 1:Variable Declaration and Initialization
      Scanner userInput=new Scanner(System.in);
      Random rand= new Random();
      //int num =(int)(Math.random() * 10+1); or...
      int num= rand.nextInt(10)+1;
      int guess=0;  
      int count=1;
      int bottomLimit=1;
      int upperLimit=10;
   //Section 2:User Input
   System.out.println(num);
      System.out.println("...Random Number Generated...READY");
      System.out.printf("Guess %d:Enter an integer value between %d and %d\n",count,bottomLimit,upperLimit);
      guess=userInput.nextInt();
   //Section 3:Program Execution
      if (guess!=num){
         while (count<3){
            if (count==2){
               if (guess>num){
                  System.out.println("too high");
                  upperLimit=guess-1;}
               if (guess<num){
                  System.out.println("too low");
                  bottomLimit=guess+1;}
               System.out.printf("Last Chance: Enter an integer between %d and %d, inclusively: \n",bottomLimit,upperLimit);
               guess=userInput.nextInt();  
               count=3;
            }
            else{
               count++;
               if (guess>num){
                  System.out.println("too high");
                  upperLimit=guess-1;
                  System.out.printf("Guess %d: Enter an integer between %d and %d, inclusively: \n",count,bottomLimit,upperLimit);
                  guess=userInput.nextInt();  
               }
               else {
                  System.out.println("too low");
                  bottomLimit=guess+1;
                  System.out.printf("Guess %d: Enter an integer between %d and %d, inclusively: \n",count,bottomLimit,upperLimit);
                  guess=userInput.nextInt();  
               }
               if (guess==num)
                  count=3;
            }
         }
      }
   //Section 4:Program Output
      if (guess==num){
         System.out.println("Correct - You Win");}
      else
         System.out.println("Sorry- You Lose");
      System.out.println("Good-Bye");
   }  
}
  
