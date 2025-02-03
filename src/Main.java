// Newton Hoang
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Calling getDouble method with a custom message
        double myNum = getDouble("Input Number:");
        System.out.println("Number Inputted: " + myNum);
    }

    // Method to get a double input from the user
    public static double getDouble(String message) {
        Scanner scanner = new Scanner(System.in);
        double num = 0.0; //Variable to store the double value
        boolean valid = false;

        // Loop until a valid double is entered
        while (!valid){
            System.out.println(message);
            String input = scanner.nextLine(); //Read input as a string
            try
            {
                num = Double.parseDouble(input); //Attempt to convert input to double
                valid = true;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Invalid Input. Please enter a valid number.");
            }
        }
        return num; // Return the valid double value
    }
}
