/************************************************************************************************************
* @Author: Ali Taha                                                                        @Date: 23/09/2021
* Mr.A. Carreiro
* GameOfLifeAliEhabTahaFinal.java
* 
* Program Description:
* The Game of Life is a game that simulates a simple life form using a two-dimensional array and it 
* allows user to select the number of live liveNum the game starts with and the number of generations. 
* Each day, life forms are born or die, depending on a set of rules and the cell's location on a 20X20 grid. 
* **********************************************************************************************************/
import java.util.Scanner;                                  // Importing the Scanner Library 

class GameOfLifeAliEhabTahaFinal{                          // Begin class GameOfLifeAliEhabTahaFinal
   public static void main(String[]args){                  // Begin main() method 
   
   //--------Section 1: Variable Declaration and Initialization---------
      Scanner uI=new Scanner(System.in);                   // Instantiating the Scanner Class
      int liveNum=0, cellLife=400, numGen=0, genAdvance=1; // This declares and initializes the variables use to stor number of alive cells, generation sequence, and the user's choice to add a generation
      int grid[][]=new int[20][20];                        // This intializes the grid as a 2D array 
      
   //--------------------Section 2: User Input--------------------------
      
      //The do while loop asks the user to enter the number of cells to start with and completes error-checking 
      do{ 
         System.out.println("Welcome to the game of life. \n"
            +"Please enter how many cells you wish to start the game with: ");
         liveNum=error(uI);                                                               //Calls error() method to check answer
         uI.nextLine();
         if (liveNum<0||liveNum>400) 
            System.out.println("The number of cells cannot exceed 400 or be less than 0.");
      }while(liveNum<0||liveNum>400);
         
   //---------------Section 3: Program Execution------------------------
   
      //The for loop is used to randomly place the aive cells in the array 
      for(int loop=0; loop<liveNum;){
         int random=(int) (Math.random()*20);                                             //This stores a value between 0 and 19 (length of array) 
         int random2=(int) (Math.random()*20);
         if(grid[random][random2]==0){                                                                            
            grid[random][random2]=1;
            loop++;                                                                       //Only loops if random cell was assigned
         }//End of if statement
      }//End of for loop
      
   //---------------Section 4: Program Output------------------------
      //Calls the outputCells() method to output the initial grid
      outputCells(grid, numGen);
      
      //The while loop ensures the program keeps executing until user exits by entering 0
      while(genAdvance!=0){
      //The do while loop asks the user to continue or exit, and does basic error checking 
         do{
            System.out.println("Select an option:");
            System.out.println("1 - Advance one generation");
            System.out.println("0 - Exit the game");
            genAdvance=error(uI);                                                         //Calls error() method to error check 
            uI.nextLine();
            if (genAdvance<0 || genAdvance >1)
               System.out.println("Please enter a number between 0 and 1");
         } while (genAdvance<0 || genAdvance >1);
         
         //If the user chooses to exit, program ends 
         if (genAdvance==0)
            break;  
         numGen++;                                                                        //Number of genereations increases every run
         
         //Calls the applyRules() method to apply the rules of the Game of Life and change the grid 
         grid=applyRules(grid, numGen);
         
         //Calls the outputCells method to output the new, updated grid to the user 
         outputCells(grid, numGen);
         
         //The for loop checks to see how many cells have remained alive
         cellLife=400;
         for(int row=0; row<grid.length; row++){
            for(int column=0; column<grid[row].length; column++){
               if (grid[row][column]==0)
                  cellLife=cellLife-1;
            }//end of nested for loop 
         }//end of for loop 
         
         //The if statement exits the pogram if no more cells remain 
         if (cellLife==0){
            System.out.printf("All cells have died at generation %d.\n",+numGen);
            break;
         }//end of if statement
      }//end of while loop 
      
      System.out.println("Thanks for playing!");
   }//end of main() method
    
   /**********************************************************************
   *@Author: Ali Taha                                    @Date:23/09/2021
   *This method outputs the 20X20 grid of the game of life
   *@Parameters: A 2D integer array grid2, integer variable genNumber
   *@Return: No return/void
   **********************************************************************/
   public static void outputCells(int grid2[][],int genNumber){
      System.out.println("------------Generation "+genNumber+"---------------");
      
      //The for loop is used to output the appropriate - for dead cells and O for alive cells
      for (int row=0; row<grid2.length; row++) {
         for(int column=0; column<grid2[row].length; column++) {
            if(grid2[row][column]==0)
               System.out.print("- ");
            else             
               System.out.print("O ");
         }//End of nested for loop 
         System.out.println();                                        //Sperates the rows 
      }//End of for loop 
      System.out.println();                                         
   }//end of outputCells()

   /**********************************************************************
   *@Author: Ali Taha                                    @Date:23/09/2021
   *This method applies the rules of the game of life to the grid used 
   *@Parameters: A 2D integer array origGrid, integer variable numGen
   *@Return: 2D integer array 
   **********************************************************************/
   private static int[][] applyRules(int origGrid[][], int numGen){
      int finalGrid[][]=new int[20][20];                                                 //The new information is stored in a seperate array 
      int count=0, genNum=numGen, liveNebr=0;                                            //Declares and initializes count, genNum, liveNebr to be used to apply the rules 
      
      //The for loop is used to go through each row and column of the array
      for(int row=0;row<origGrid.length; row++) {
         for(int column=0; column<origGrid[row].length;column++) {
            liveNebr=0;
                      
            //Checking the neigbouring cells in the row above
            if (row>0){
               if (column>0 && origGrid[row-1][column-1]==1)                             //Neighbor cell top left corner
                  liveNebr++;
               if (origGrid[row-1][column]==1)                                           //Neighbor cell top centre 
                  liveNebr++;
               if ((column<origGrid[row].length-1) && (origGrid[row-1][column+1]==1))    //Neighbor cell top right corner
                  liveNebr++;
            } // end check for top row 
            
            //Checking the neigbouring cells in the row below 
            if (row<origGrid.length-1){                                
               if (column>0 && origGrid[row+1][column-1]==1)                       //Neighbor cell bottom left corner
                  liveNebr++;
               if (origGrid[row+1][column]==1)                                     //Neighbor cell bottom centre 
                  liveNebr++;
               if (column<origGrid[row].length-1&&origGrid[row+1][column+1]==1)    //Neighbor cell bottom right corner
                  liveNebr++;
            } // end check for bottom row 
         
            //Checking the neigbouring cells in the same row 
            if (column>0 && origGrid[row][column-1]==1)                       //Neighbor cell left 
               liveNebr++;
            if (column<origGrid[row].length-1 && origGrid[row][column+1]==1)  //Neighbor cell right 
               liveNebr++;
            
            //If else statements used to determine which cells live and die 
            if ((origGrid[row][column]==1) && (liveNebr==2 || liveNebr==3))
               finalGrid[row][column]=1;
            else if (origGrid[row][column]==1)
               finalGrid[row][column]=0;
            else if ((origGrid[row][column]==0) && (liveNebr==3))
               finalGrid[row][column]=1;
            else 
               finalGrid[row][column]=0;
            
         }//end of nested for loop
      }//end of for loop
      
      //For loop is used to determine at what generation the change in grid occurs
      for(int row=0;row<origGrid.length; row++) {
         for(int column=0; column<origGrid[row].length;column++) { 
            if (origGrid[row][column]==finalGrid[row][column])
               count++;
         }//end of nested for loop 
      }//end of for loop 
      
      //If statement warns the user no change will occur further on 
      if (count==400){
         System.out.printf("WARNING: All future generations after generation %d will be the same.\n"
            +"You may now exit if you wish to do so by entering 0\n",genNum);
      }
      return finalGrid;
   }//end of applyRules()
   
   /**********************************************************************
   *Author: Ali Taha                                       Date:23/09/2021
   *This method checks that the user has entered an integer variable 
   *@Parameters: Scanner object uI
   *@Return: integer value
   ***********************************************************************/
   private static int error(Scanner uI){                                     //Begin error() method
      while (!uI.hasNextInt()){                                              //Negate the hasNextInt to check if there is an integer as an input.
         System.out.println("Please enter an integer number"); 
         uI.nextLine();                                                      //Dump contents of the scanner to the next token.
      }//end of while loop
      int correct=uI.nextInt();                                            
      return (correct);                                                      //The keyword return allows the method to return a value
   }//end error() method
}//end of class GameOfLifeAliEhabTahaFinal