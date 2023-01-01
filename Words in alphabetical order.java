/********************************************************************************* 
  * Ali Taha                                   Date: Nov. 18th 2020
  * Mr. A. Carreiro  
  * Program Description:
  *This program asks the user to enter one word, using println() method, then to enter 
  *a second word. The program then assigns an integer value to the word depending on 
  *the alphabetical order. It then determines and outputs whether the first word is 
  *alphabetically before, after or the same as the second word; depending on the 
  *integer value assigned. The interactions of input and output all occur in the 
  *compiler output pane. 
  * ******************************************************************************/

import java.util.Scanner;

class Problem1 { //begin class       

  public static void main (String [ ] arg){//begin main() method
    
    //--Variable Declaration And Initialization--
    Scanner uI = new Scanner(System.in);
    String word1 = null, word2 = null;
    int alpha=0;
    
    //--Conversions--
      System.out.println("Please enter a word:");
    word1=uI.next();
    System.out.println("Please enter a second word:");
    word2=uI.next();
    System.out.println("------------------------------\n\n\n");
    
    //--Program Execution--
    
   //returns an integer value dependent on alphabetical order 
    alpha = word1.compareToIgnoreCase(word2) ;
    
    if (alpha < 0){
      System.out.printf("%s is alphabetically before %s \n",word1,word2);
    }else if (alpha > 0){
      System.out.printf("%s is alphabetically after %s \n",word1,word2);
    }else{
      System.out.printf("%s is the same as %s \n",word1,word2);
    }
  }// end main() method
}// end class WhatDoIDoCarreiro
