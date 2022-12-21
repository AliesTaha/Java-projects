/*************************************************************
*@Author: Ali Taha                         @Date:13/09/2021
*Mr.A. Carreiro 
*Palindrome2AliTaha.java
*
*Program Description:
*The program will allow the user to enter a sentence, and 
*then count the number of words in the sentence that are 
*palindromes and outputs these words.
************************************************************/
import java.util.Scanner;                                 // Importing the Scanner library

class Palindrome2AliTaha {                                // Begin class
   public static void main (String [] arg){               // Begin main() method
   
   //Section1:-----Variable Declaration And Initialization-----
      Scanner uI=new Scanner(System.in);                   // Instantiating the Scanner Class
      String original=null;                                // Declares and initializes the value of original string variables for sentence
      String word1=null, word2=null;                       // Declares and initializes the value of word1 and word2 (to store and compare values of future arrays)
      int numPal=0;                                        // Declares and initializes the int variable that stores the number of palindromes in the sentence
   
   //Section1:-----User Input-----
   
   //Asks the user to enter a sentence and stores the sentence in the String variable
      System.out.println("Please enter a sentence without including punctuation marks:");
      original=uI.nextLine();
   
   //Section3:-----Program Execution-----
   
   //Splits the sentence into seperate words and stores these words as an array
      String words[] = original.split(" ");
      
   //This is the declaration and creation of the array that will store the reversed values of each component of the original array   
      String reversed[] = new String [words.length];                    
    
   //The for loop insures that each word in the sentence is reversed, and hence the loop is set by the number of words in the array
      for (int x = words.length; x>0; x--) {   
         reversed [x-1]="";                             //This ensures that there is no "null" stored inside the array
      
      //This nested for loop ensures that each letter in the word is reversed into its corresponding component in the other array
         for (int i=words[x-1].length()-1; i>=0; i--){
            reversed [x-1] = reversed [x-1] + words[x-1].substring(i,i+1);
         }//End of for loop
         
      //This temporarily stores and compares the words to determine if a palindrome is present       
         word1=reversed [x-1];
         word2=words [x-1];
      
      //Section4:-----Program Output-----
      
      //The if statement ensures that each palindrome in the sentence is outputted
         if (word1.equalsIgnoreCase(word2)){
            if(numPal==0)
               System.out.println("The palindromes are: ");
            System.out.println(word1);
            numPal++;                                              //This keeps count of the number of palindromes in the sentence
         }// end of if statement
      }// end of for loop 
   //The if else statement ensures that the number of palindromes in the sentence is outputted   
      if (numPal==0)
         System.out.println("No palindromes found");
      else
         System.out.printf("%d palindromes have been found",numPal);
   }//End main()   
}//End class Palindrome2AliTaha