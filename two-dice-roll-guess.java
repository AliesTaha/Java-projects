/*****************************************************************************************
   *@Author: Ali Taha                                                      @Date:10/9/2021
   *Mr.A. Carreiro 
   *DiceAliTaha.java
   *
   *Program Description:
   *The program runs six times and asks the user to guess a number between 2 and 12. The  
   *program uses a separate method for the random code and the user's prize depends on 
   *how many correct guesses they have.
   ****************************************************************************************/
import java.util.Scanner;                                  //Importing the Scanner Library 
   
class DiceAliTaha {                                        //open class DiceAliTaha
   public static void main (String [] args){               //begin main() method
   
   //Section 1:Variable Declaration and Initialization
      Scanner uI=new Scanner(System.in);                   //Instantiating Scanner Class
      int guess=5, result=0, wins=0;                       //Declares and initializes the user's guess, number of wins and dice roll value
      
   //Section 2:User Input
   
   //This gives the user the game's opening statement                                                                       
      System.out.printf("You only have six tries to win a stuffie prize, good luck!\n");
   
   //The for loop keeps count of the user's wins and limits the program to six runs
      for (int i=1; i<=6; i++){                                     
         System.out.printf("----------------Dice Roll Number %d------------------\n", i);
         result=diceNum();
         System.out.printf("P.S: For testing purposes, the result is: %d\n", result);        //Gives the result of each roll
         
      //The do-while loop ensures the user's guess is within range
         do{                                                     
            if (guess<2 || guess>12)
               System.out.println("That guess was out of range.");
            System.out.printf("The dice have rolled. Guess a number between 2 and 12.\n");
            guess=error(uI);                                        //Uses the error() method for error checking
            uI.nextLine();                                          //Dumps Scanner Content to next token
         }while (guess<2 || guess>12);                              //End of do while loop
      
      //Section 3: Program Execution
      
      //The if else statement ensures the user's number of wins are updated
         if (guess==result) {
            System.out.print("You guessed the right number! \n");
            wins++;                                                   
         }
         else {
            System.out.println("Sorry, that was not the correct number.");
         }//end of if else statememt
      }//end of for loop 
   
   //Section 4: Program Output 
   
   //Creates a seperator before outputting the final result for visual effect
      System.out.println("------------------------------------------");
   
   //Tells the user how many games they won
      if (wins==1)                                              //The if else statement ensures the correct grammar is used
         System.out.printf("You won 1 game!\n");
      else
         System.out.printf("You won %d games!\n",wins);           
   
   //The following switch statement determines what prize the user wins 
      switch (wins){ 
         case 0:
            System.out.println("Sorry, you didn't win anything!");
            break;
         case 1:
         case 2:
            System.out.println("You won the Small Stuffie!");
            break; 
         case 3:
            System.out.println("You won the Big Stuffie!");
            break;
         default:
            System.out.println("You won the Really Big Stuffie!");
      }//end switch statement
   }//end main() method
   
  //This method is used for generating a random number (the dice number) 
   private static int diceNum() {                      //Begin diceNum() method
      int num =(int)(Math.random()*6+1);
      num+=(int)(Math.random()*6+1);                   //This ensures that the different probabilities of each sum is accounted for
      return num;
   }//end diceNum() method
   
   //This method is used to check the user input for errors
   private static int error(Scanner uI) {              //Begin error() method
      while (!uI.hasNextInt()){                        //Negate the hasNextInt to check if there is an integer as an input
         System.out.println("Please enter a valid number");
         uI.nextLine();                                //Dump contents of the scanner to the next token.
      }//end while loop
      int x=uI.nextInt();
      return (x);
   }// end error() method
}// end class DiceAliTaha
