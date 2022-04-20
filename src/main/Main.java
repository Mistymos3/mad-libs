import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /***********************/
        /* Mad Libs            */
        /***********************/

        System.out.println("Welcome to Mad Libs!");

        // Write your code here

        //GET PLACE
        //creates a scanner object
        Scanner scanner = new Scanner(System.in);

        //ask user for a place
        System.out.println("Enter a place");

        //read user input  
        String place = scanner.nextLine();

        //GET FOOD

        //ask user for a food
        System.out.println("Enter a food");

        //read user input
        String food = scanner.nextLine();

        //GET ANIMAL

        //ask user for an animal
        System.out.println("Enter an animal");

        //read user input
        String animal = scanner.nextLine();

        //PRINT OUT MAD LIBS SENTENCE
        System.out.println("My friend met me in " + place + " and asked if i would trade my " + food + " for his " + animal + ".");

    }
}