/**In this file we have provided a menu that allows users to create arrays
*  and perform related operations. We asked the user to enter the preffered
*  option. If the option is valid, we did the operation and printed the result
*  on the screen, if not, we asked the user to enter a valid option.
* 
* @author Burak Oral
* @author Enes Ceran
* @author Deniz Sonmez
* @author Semih Oz
* @author Yavuz Kahyaoglu
*
* @version 9.25.24
*/

import java.util.Scanner;

public class UtilsApp {

    public static void main( String[] args ) {
        
        Scanner input;
        int choice;

        int[] list;

        input = new Scanner( System.in );
        choice = 0;

        System.out.print("Give the size of the array: ");
        int size = Integer.valueOf(input.nextLine());
        
        list = Utils.random_array(size);

        System.out.println( "\n1) Find maximum and minimum values of the array.\n2) Find the average of the array.\n3) Find the sum of elements with odd- and even-numbered indexes\n4) Exit.\n" );

        System.out.print( "Please choose an option: " );
         
        while (true) {
            if( input.hasNextInt() ) {
                choice = input.nextInt() ;
                break;
            }
    
        }

        while( choice != 4 ) {


            if( choice == 1 ) {
                int max = Utils.findMax(list);

                int min = Utils.findMin(list);

                System.out.printf("Max value : %d, Min value %d", max, min);
            }

            else if( choice == 2 ) {
                
                double[] differences = Utils.AverageDifference(list);

                for (int i = 0; i < differences.length; i++) {
                    System.out.printf("%.1f\n", differences[i]);
                }

            }

            else if( choice == 3 ) {
                int oddSum = Utils.SumOddIndexElements(list);
                int evenSum = Utils.SumEvenIndexElements(list);

                System.out.printf("Sum of odd elements : %d, Sum of even elements %d", oddSum, evenSum);
            }


            else{
                System.out.print( "\nPlease choose a valid option: " );
                choice = 0;
            }

            System.out.println( "\n1) Find maximum and minimum values of the array.\n2) Find the average of the array.\n3) Find the sum of elements with odd- and even-numbered indexes\n4) Exit.\n" );

            System.out.print( "Please choose an option: " );

            input.nextLine();

            if( input.hasNextInt() ) {
                choice = input.nextInt();
            }



        }

        input.close();
    }
}