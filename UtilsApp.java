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

        input = new Scanner( System.in );
        choice = 0;

        System.out.printf( "1) Create an array.\n2) Find maximum and minimum values of the array.\n3) Find the average of the array.\n4) Find the sum of elements with odd- and even-numbered indeces.\n5) Exit.\n" );

        System.out.print( "Please choose an option: " );
         
        if( input.hasNextInt() ) {
            choice = input.nextInt() ;
        }

        while( choice != 5 ) {

            if( choice == 1 ) {

                System.out.printf( "\n1) Create an array.\n2) Find maximum and minimum values of the array.\n3) Find the average of the array.\n4) Find the sum of elements with odd- and even-numbered indexes\n5) Exit.\n" );

                System.out.print( "Please choose an option: " );
        
            }

            else if( choice == 2 ) {

                System.out.printf( "\n1) Create an array.\n2) Find maximum and minimum values of the array.\n3) Find the average of the array.\n4) Find the sum of elements with odd- and even-numbered indexes\n5) Exit.\n" );

                System.out.print( "Please choose an option: " );

            }

            else if( choice == 3 ) {

                System.out.printf( "\n1) Create an array.\n2) Find maximum and minimum values of the array.\n3) Find the average of the array.\n4) Find the sum of elements with odd- and even-numbered indexes\n5) Exit.\n" );

                System.out.print( "Please choose an option: " );
        
            }

            else if( choice == 4 ) {

                System.out.printf( "\n1) Create an array.\n2) Find maximum and minimum values of the array.\n3) Find the average of the array.\n4) Find the sum of elements with odd- and even-numbered indexes\n5) Exit.\n" );

                System.out.print( "Please choose an option: " );
        
            }

            else{
                System.out.print( "\nPlease choose a valid option: " );
                choice = 0;
            }

            input.nextLine();

            if( input.hasNextInt() ) {
                choice = input.nextInt();
            }

        }

        input.close();
    }
}