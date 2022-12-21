
/*****************************************************************************
* @Author: Ali Taha                                       @Date: 29/10/2021
* Mr.A. Carreiro
* BubbleSort.java
* 
* Program Description:
 * This program showcases the capabilities of the Bubble Sort algorithm.
 * It uses the bubble sort algorithm to sort a user inputted arrayList.
 * It is able to sort doubles, strings, or ints.
* ***************************************************************************/
import java.util.ArrayList;
import java.util.Scanner;

class BubbleSort {// Start of BubbleSort class
    public static void main(String[] arg) {// Start of main() method

        // Section 1: Variable declaration and initialization
        Scanner uI = new Scanner(System.in);
        String temp;
        int x, tempInt, leave = 0, arrChoice1 = 0;
        double tempD, h;

        // Section 2: User Input
        // calls the integerU() method for error-checking
        arrChoice1 = integerU(uI, "What type of array would you like to sort?\n1-Letters\n2-Integers\n3-Double\n", 1,
                3);

        // Section 3&4: Program Execution and Output;
        // -----This is a Bubble Sort
        switch (arrChoice1) {
        // List of: letters
        case 1:
            ArrayList<String> list = new ArrayList<>();

            // Takes in values using user input
            do {
                System.out.println("Please enter letter into the arrayList");
                list.add(uI.next());
                uI.nextLine();
                x = integerU(uI, "Would you like to enter another value?\n1 for True, 2 for False & Display", 1, 2);
                leave = x;
            } while (leave == 1);

            // Prints original array
            System.out.println("\n-------------------------\nArrayList before Sorting:");
            for (int i = 0; i < list.size(); i++) {// prints array-list before sort
                System.out.print(list.get(i) + "    ");
            }
            System.out.println();

            // Bubble Sort algorithm
            for (int b = 0; b < list.size(); b++) {
                for (int y = b + 1; y < list.size(); y++) {
                    if (list.get(y).compareToIgnoreCase(list.get(b)) < 0) {
                        temp = list.get(b);
                        list.set(b, list.get(y));
                        list.set(y, temp);

                    }
                }
            }

            // Prints out final ArrayList
            System.out.println("\nArray List after Sorting:");
            for (int i = 0; i < list.size(); i++) {// prints array-list after sort
                System.out.print(list.get(i) + "    ");
            }

            break;

        // List of: Integers
        case 2:
            ArrayList<Integer> listInt = new ArrayList<Integer>(1);
            // Takes in values using user input
            // Try catch error checking
            do {
                x = integerU(uI, "Enter a value: ", (Integer.MIN_VALUE + 1), Integer.MAX_VALUE);
                listInt.add(x);
                x = integerU(uI, "Would you like to enter another value?\n1 for True, 2 for False & Display", 1, 2);
                leave = x;
            } while (leave == 1);

            // Prints array-list before sort
            System.out.println("\n-------------------------\nArrayList before Sorting:");
            for (int i = 0; i < listInt.size(); i++) {
                System.out.print(listInt.get(i) + "    ");
            }
            System.out.println();

            // This is the Bubble sort algorithm
            for (int b = 0; b < listInt.size(); b++) {
                for (int y = b + 1; y < listInt.size(); y++) {
                    if (listInt.get(y).compareTo(listInt.get(b)) < 0) {
                        tempInt = listInt.get(b);
                        listInt.set(b, listInt.get(y));
                        listInt.set(y, tempInt);

                    }
                }
            }

            // Prints array-list after sort
            System.out.println("\nArray List after Sorting:");
            for (int i = 0; i < listInt.size(); i++) {// prints array-list after sort
                System.out.print(listInt.get(i) + "    ");
            }
            break;

        // List of: Doubles
        default:
            ArrayList<Double> listD = new ArrayList<Double>(1);

            do {// try catch error checking
                System.out.println("Enter a decimal value");
                h = error(uI);
                listD.add(h);

                x = integerU(uI, "Would you like to enter another value?\n1 for True & 2 for False & Display", 1, 2);
                leave = x;
            } while (leave == 1);

            // Prints the original list
            System.out.println("\n-------------------------\nArrayList before Sorting:");
            for (int i = 0; i < listD.size(); i++) { // prints array-list before sort
                System.out.print(listD.get(i) + "    ");
            }
            System.out.println();

            // This is the Bubble sort algorithm
            for (int b = 0; b < listD.size(); b++) {
                for (int y = b + 1; y < listD.size(); y++) {
                    if (listD.get(y).compareTo(listD.get(b)) < 0) {
                        tempD = listD.get(b);
                        listD.set(b, listD.get(y));
                        listD.set(y, tempD);

                    }
                }
            }

            // This prints the final array-list
            System.out.println("\nArray List after Sorting:");
            for (int i = 0; i < listD.size(); i++) { // prints array-list after sort
                System.out.print(listD.get(i) + "    ");
            }
            break;

        }

        uI.close(); // For security purposes.
    }// end main() method

    /***********************************************************************************************************
     * @Author: Ali Taha @Date: 21/10/2021
     * 
     * @Parameters: Scanner uI, String message, int min, int max
     * @Return: int Purpose: To get the user to input an integer between a minimum
     *          and maximum using the Scanner uI and to in turn check the user Input
     *          for the correct type.
     ***********************************************************************************************************/
    private static int integerU(Scanner uI, String message, int min, int max) { // Begin
        // integerValue(uI,message,min,max)
        // method
        int input1 = Integer.MIN_VALUE; // Declares and initializes input1 as the integer for uI, sets it to a negative
        // number to run loopff

        System.out.println(message); // This prevents redundancy with System.out.println();

        // Check that the user inputted an int
        while (true) {

            try {
                input1 = uI.nextInt(); // The integer number is stored in variable input1, which is returned below
            } catch (Exception e) {
                uI.nextLine();
            }

            // If the int is between the min and the max, break the loop
            if (input1 <= max && input1 >= min)
                break;

            if (input1 > max || input1 < min)
                System.out.println("Please only enter one integer number within range.");
        }
        return input1; // Returns input1
    }// End integerU() method

    /*******************************************************************************
     * @Author: Ali Taha @Date: 30/10/2021
     * 
     * @Parameters: Scanner uI
     * @Return: double Purpose: To get the user to input a decimal using the Scanner
     *          uI and to in turn check the user Input for the correct type.
     *********************************************************************************/
    private static double error(Scanner uI) { // This is a new method, and it will allow us to error check the userInput
                                              // and save space
        while (!uI.hasNextDouble()) { // Negate the hasNextInt to check if there is an integer as an input.
            System.out.println("Please enter an integer number"); // Uses the Println function to ask for user input
            uI.nextLine(); // Dump contents of the scanner to the next token.
        } // end of while loop
        double correct = uI.nextDouble(); // The integer number is stored in variable correct, which is returned below
        return (correct); // The keyword return allows the method to return a value
    }// end error()

}// end BubbleSort class