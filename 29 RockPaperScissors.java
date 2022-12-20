/********************************************************************************
* @Author: Ali Taha                                           @Date: 12/12/2020
* Mr.A. Carreiro
* RockPaperScissorsAliTaha.java
* 
* Program Description
* This program is a one player game of Rock, Paper, Scissors. The game is a best
* of 7 matches; however the winner must win by two. That means that the winner 
* can win in as few as 5 games, and must have two more wins than their opponent.
* The program implements a while loop, and checks for input errors. 
* *****************************************************************************/
import java.util.Scanner;                                 // Importing the Scanner library
import java.lang.Math;                                    // Imports the java.lang.Math package

class RockPaperScissorAliTaha{                            // Begin class 
   public static void main(String [] arg){                // Begin main() method
   
   //--Variable Declaration And Initialization
      Scanner userInput=new Scanner(System.in);           // Instantiating the Scanner Class
      int p1=0, count=1, point1=0, point2=0;              // Declares p1, count, point1, and point 2 to all be integer variables (primitive data type) and initializes the value
      int p2= (int) (Math.random()*3+1);                  // randomize 1 - 3 
      String name=null, rep=null;                         // Declares name and rep to be string variables (reference data type) and initializes the value
      boolean again=true;                                 // Declares again to be boolean variable (primitive data type) and initializes the value
      
      //--User Input
      
      System.out.printf("Please enter your name: ");      //Uses the Printf function to output a message to the user (to enter their names)
      name=userInput.nextLine();                          //Using userInput name of the Scanner Object to enter words and assign it to the reference variable "name" of a String Object
      System.out.printf("\nHello %s! You are going to play Rock, Paper, Scissors against Player 2 (the computer). Here are the rules:\n", name);
      System.out.printf("-Rock beats Scissors, Paper beats Rock, and Scissors beat Paper.\n");
      System.out.printf("-Enter 1 for Rock, 2 for Paper, and 3 for Scissors. \n");                                                                //All these use the Printf function to output the instructions
      System.out.printf("-You will get 1 point when you win, no points for a tie, and Player 2 will get a point when he wins. \n");
      System.out.printf("-This game is a best of 7, and you must win by a difference of two. This means you can win by as few as five games.\nGood luck!\n%n");
      
      while (again==true){                    //This while loop ensures that the game keeps repeating as long as the condition/the boolean expression again==true is true, and again is only true if the user enters y. 
         p1=0;                                //^If condition is false, the game ends and exits the while loop
         p2= (int) (Math.random()*3+1);
         count=1; 
         point1=0;                             //Same as comments in Variable Declaration and Initialization Section 
         point2=0;                             //But the values are assigned original values for each repetition of the game.
         again=true; 
         rep="";
      
         while ((count<=5) || (count==6 && ((point1<=point2+3) && (point2<=point1+3))) || (count==7 && ((point1<=point2+2) && (point2<=point1+2))) || (point1<point2+2 && point2<point1+2)){
         /*
          *This while loop ensures that the matches, not the game repeat at least five times (minimum requirement to win the game since it is a best of four and must win/loose by a difference of two),
          *Then it ensures that the rounds will not end if the game is at the start of round 6 or round 7 due to the fact that the win isn't only a best of four, but also must have a difference of two.
          *^That is to say, without the second and third boolean expressions in the condition, several games will end at round 5/6 and even though that may comply with the best of 4 rule, it does not allow the user to win/lose by a difference of 2.
          *Then it ensures that the loop will keep going after 7 matches until either player has a two point lead. 
          */
            System.out.printf("Round %d\n",count);                        //Uses the Printf function to output a message (round number) to the user
            /* The line below is to be used for testing purposes only. It uses concatination to output what the program chose
            
             * System.out.println("The computer chose "+p2);
             
             */
            System.out.printf("Please enter your selection: \n1. Rock\n2. Paper\n3. Scissors\n"); //Uses the Printf function to output a message to the user
            do{                                                           //This is a do while loop, ensuring that it's executed at least once, and it prevents errors due to an invalid (different type than required) input
               while (!userInput.hasNextInt()){                           //Negate the hasNextInt to check if there is an integer as an input.
                  System.out.println("Invalid input. Please try again."); //Uses the Println function to output a message to the user
                  userInput.nextLine();                                       //Dump contents of the scanner to the next token.
               }
               p1=userInput.nextInt(); //Assign the integer to n1 if conditions in the loop above is fulfilled.
               userInput.nextLine();
               if (p1<1 || p1>3)                                                                          //The condition inside the if statement ensures the integer inputted is 1, 2 or 3
                  System.out.println("You have to choose between Rock (1), Paper (2) and Scissors (3)."); //Uses the Println function to output a message to the user
            } while (p1<1 || p1>3); //Check if condition is true to restart the loop
         
         //--Program Execution 
            if ((p1==1&&p2==3)||(p1==2&&p2==1)||(p1==3&&p2==2)){                                 //The following is an if, else if, else, which ensure that the correct outcome from each round is outputted- in this case a win.
               System.out.printf("You Win! One point awarded to %s!\n\n", name);                 //Uses the Printf function to output a message to the user
               System.out.printf("You selected %d and the computer selected %d.\n\n\n", p1,p2);  //Uses the Printf function to output a message to the user
               point1=point1+1;
            }
            else if (p1==p2){                                                                    //So for instance if the numbers are the same it is a tie
               System.out.printf("It's a tie! No points are awarded.\n\n");                      //Uses the Printf function to output a message to the user
               System.out.printf("You selected %d and the computer selected %d.\n\n\n", p1,p2);  //Uses the Printf function to output a message to the user
            }
            else{                                                                                //The prior two conditions cover the user winning, and tying, leaving losing as the only possible outcome for this              
               System.out.printf("You lose! One point awarded to the computer.\n\n");            //Uses the Printf function to output a message to the user
               System.out.printf("You selected %d and the computer selected %d.\n\n\n", p1,p2);  //Uses the Printf function to output a message to the user
               point2=point2+1;
            }
            count++;                                                                             //This is the incrementation used for the while loop that controls the number of rounds
            p2= (int) (Math.random()*3+1);                                                       //And this assigns a different random value to the computer's choice for the following round, so the computer doesn't choose the same thing.      
         } //End of repeating matches while loop
      
      //--Program Output
         System.out.printf("%s's score: %d\n",name,point1);                 //Uses the Printf function to output a message to the user
         System.out.printf("Player 2 score: %d\n",point2 );                 //Uses the Printf function to output a message to the user
         if (point1>point2)                                                 //This if else condition ensure that the right winner of the game is outputted
            System.out.printf("%s, you won %d games to %d. Congratulations.\n\n", name, point1, point2);  //Uses the Printf function to output a message to the user
         else
            System.out.printf("%s, you lost %d games to %d.\n\n", name, point2, point1);                  //Uses the Printf function to output a message to the user
          System.out.printf("Please only enter y for yes and n for no.\n");                               //Uses the Printf function to output a message to the user
          rep=userInput.nextLine();                                                                       //Using userInput name of the Scanner Object to enter words and assign it to the reference variable "rep" of a String Object
          //Error Checking for Correct User Input
          do{                                                      //This is a do while loop, ensuring that it's executed at least once, and it prevents errors due to an invalid (different type than required) input
      if ((!(rep.equals("y"))) && (!(rep.equals("n"))))            //Negating an And Statement 
      System.out.println("Would you like to play again? (y/n): "); //Uses the Println function to output a message to the user
      rep=userInput.nextLine();                                    //Assigns the user input to the string variable rep
    } while ((!(rep.equals("y"))) && (!(rep.equals("n"))));        //Check if condition is true to restart the loop
            if (rep.equals("y"))                                   //Uses the ".equals()" to use the value inside the string variable "rep"
               again = true;                                    //to assign a value of true or false to the boolean variable "again"
            else                                                //and this is done to ensure that the user does not enter a string value
               again = false;                                   //other than y for yes and n for no
         if (again==true)                                          //This is done for aesthetic purposes to separate every new game from the previous game
            System.out.printf("------------------------------------------------------------------------------\nNew Game\n\n"); //Uses the Printf function to output a message to the user
      } //End of whole game's while loop
      System.out.println("Goodbye"); //Uses the Println function to output the goodbye message to the user
   } //end of main() method
} //end of class