/******************************************************************************************
* @Author: Ali Taha                                                     @Date: 16/09/2021
* Mr.A. Carreiro
* SimpleEncryptionAliTaha.java
* 
* Program Description:
* This program encrypts and deciphers text by shifting the letters up or down (alphabetic
* rotation) depending on the user's input. 
* ******************************************************************************************/
import java.util.Scanner;                                                // Importing the Scanner library
 
class SimpleEncryptionAliTaha {                                          //Begin class SimpleEncryptionAliTaha
   public static void main(String[] args){                               //Begin main() method 
   
   //------Section 1: Variable Declaration and Initialization-------
      Scanner uI = new Scanner(System.in);                               // Instantiating the Scanner Class
      String message="";                                                 // This declares and initializes the message String variable to store the sentence the user inputs
// This declares and initializes the message String variable to store the sentence the user inputs
// This declares and initializes the message String variable to store the sentence the user inputs
      int numAlphabet=1, choice=1;                                       // This declares numAlphabet as number to rotate letters and choice decides to encrypt or decrypt
      
   //------Section 2: User Input------------------------------------
   
   //This gives the user simple instructions and asks user to input a phrase
      System.out.printf("This program will encrypt or decrypt a phrase using\n"
         + "the simple encryption method of rotating the letter!\n"
         + "------------------------------------------------------\n"
         + "Please enter the phrase you want to encrypt/decrypt:\n");
      message = uI.nextLine();
      
   //This asks the user to enter the rotation amount they want
      System.out.println("Please enter the rotation amount (Between 1-25):");
      do{                                                                      // The do while loop ensures number is between 1 and 25
         if (numAlphabet<1 || numAlphabet>25)                 
            System.out.println("Not valid. The number should be between 1 and 25");
         numAlphabet = error(uI);                                              // Calls error() method for error checking
         uI.nextLine();
      } while (numAlphabet<1 || numAlphabet>25);                               // End of do while loop
      
   //This asks the user to choose whether they want to encrypt or decrypt
      System.out.println("1- Encryption \n2- Decryption ");
      do{                                                                      // The do while loop ensures number is between 1 and 2
         if (choice<1 || choice>2)
            System.out.println("Not valid. The number should be between 1 and 2");
         choice = error(uI);                                                   // Calls error() method for error checking
         uI.nextLine();
      } while (choice<1 || choice>25);                                         // End of do while loop
   
   //------Section 3&4: Program Execution and Output----------------   
   
   //This outputs the original message
      System.out.println("The original phrase was: "+ message);        
   
   //This if else statement ensures the correct method is called and outputs the encrypted/decrypted phrase          
      if (choice==1)           
         System.out.println("The encrypted phrase is: "+encrypted(numAlphabet , message)); 
      else
         System.out.println("The decrypted phrase is: "+decrypted(numAlphabet , message)); 
   
   }// end of main() method 
   
   
   //This method is used to encrypt the message and return the encrypted phrase
   private static String encrypted(int num, String message) {                    // Begin encrypted() method
      String encryptedMessage="";                                                //The String variable stores the encrypted message
      
      //For loop is used to insure that each letter in the sentence is encrypted
      for(int i = 0; i < message.length(); ++i){
         char letterOrig = message.charAt(i);
      
      //The if statement ensures that letters do not exceed the a-z(97-122) limit, and seperate lower-case from upper-case letters  
         if(letterOrig >= 'a' && letterOrig <= 'z'){
            letterOrig = (char)(letterOrig + num);
            
            if(letterOrig > 'z'){
               letterOrig = (char)(letterOrig - 'z' + 'a' - 1);                 //This arithmetic prevents letters from exceeding a-z limit
            }
            encryptedMessage += letterOrig;
         } // end of else if statement
         
       //The else if statements ensure the letters are encrypted while not exceeding the A-Z limit; then update the encrypted message string  
         else if(letterOrig >= 'A' && letterOrig <= 'Z'){
            letterOrig = (char)(letterOrig + num);
            
            if(letterOrig > 'Z'){
               letterOrig = (char)(letterOrig - 'Z' + 'A' - 1);                 //This arithmetic prevents letters from exceeding A-Z limit
            }
            
            encryptedMessage += letterOrig;
         } // end of else if statement
         
       //The final else ensures that all non-alphabet characters (spaces, numbers...) are returned as is 
         else {
            encryptedMessage += letterOrig;
         }
         
      } // end of for loop 
      
      //Final encrypted message is returned
      return encryptedMessage;
      
   } //end of encrypted() method
   
   
   //This method is used to decrypt a message and return the decrypted phrase 
   private static String decrypted (int num1, String message1) {                    // Begin encrypted() method
      String decryptedMessage="";                                                   //The String variable stores the decrypted message
      
      //For loop is used to insure that each letter in the sentence is decrypted
      for(int i = 0; i < message1.length(); i++){
         char letterOrig1 = message1.charAt(i);
         
      //The if statement ensures that letters do not exceed the a-z(97-122) limit, and seperate lower-case from upper-case letters   
         if(letterOrig1 >= 'a' && letterOrig1 <= 'z'){
            letterOrig1 = (char)(letterOrig1 - num1);
            
            if(letterOrig1 < 'a'){
               letterOrig1 = (char)(letterOrig1 + 'z' - 'a' + 1);                 //This arithmetic prevents letters from exceeding a-z limit
            }
            decryptedMessage += letterOrig1;
         } // end of if statement
         
       //The else if statements ensure the letters are decrypted while not exceeding the A-Z limit; then update the decrypted message string  
         else if(letterOrig1 >= 'A' && letterOrig1 <= 'Z'){
            letterOrig1 = (char)(letterOrig1 - num1);
            
            if(letterOrig1 < 'A'){
               letterOrig1 = (char)(letterOrig1 + 'Z' - 'A' + 1);                 //This arithmetic prevents letters from exceeding a-z limit
            }
            
            decryptedMessage += letterOrig1;
         } // end of else if statement
         
       //The final else ensures that all non-alphabet characters (spaces, numbers...) are returned as is 
         else {
            decryptedMessage += letterOrig1;
         }
      }// end of for loop 
      
      return decryptedMessage;
   } //end of decrypted() method
   
   private static int error(Scanner uI){                       //Begin error() method-> it will allow us to error check the userInput and save space
      while (!uI.hasNextInt()){                                //Negate the hasNextInt to check if there is an integer as an input.
         System.out.println("Please enter an integer number"); //Uses the Println function to ask for user input
         uI.nextLine();                                        //Dump contents of the scanner to the next token.
      }//end of while loop
      int correct=uI.nextInt();                                //The integer number is stored in variable correct, which is returned below
      return (correct);                                        //The keyword return allows the method to return a value
   }//end error() method
   
} //End of class SimpleEncryptionAliTaha