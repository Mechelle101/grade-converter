
import java.util.Scanner;

/**
 * @author mechellepresnell
 * This class validates the data
 */
public class Console {
    
    //creating a scanner instance making it private and constant
    private static final Scanner sc = new Scanner(System.in);
    
    //getting a string from the user and returning a blank line
    public static String getString(String prompt) {
        System.out.print(prompt);
        String input = sc.nextLine();
        //this will run there check for a blank line
        if (input == null || input.trim().isEmpty()) {
            System.out.println("Invalid input. Please enter a non-empty string.");
            return getString(prompt);  // Prompt user again for valid input
        }       
        return input;
    }    
    //ensure the user is prompted continuously until they enter a non-zero integer
    public static int getNumber(String prompt) {
        while (true) {
            System.out.print(prompt);

            if (sc.hasNextInt()) {
                int input = sc.nextInt();
                sc.nextLine();  // Consume the newline character

                // Validate for non-empty input
                if (input != 0) {
                    return input;
                } else {
                    System.out.println("Invalid input." 
                            + " Please enter a non-zero integer.");
                }
            } else {
                sc.nextLine();  // Consume the invalid input
                System.out.println("Invalid input." +
                        " Please enter a valid integer.");
                System.out.println();
            }
        }       
    }
    //this structure insures that the method keeps prompting the user until a valid input is entered
    public static String getString(String prompt, String option1, String option2) {
        while (true) {
            System.out.print(prompt);
            String input = sc.nextLine();

           if (input.equalsIgnoreCase(option1) || input.equalsIgnoreCase(option2)) {
                return input;
            } else if (!validateInput(input)) {
                System.out.println("Invalid input. Please enter a non-empty string.");
            } else {
                System.out.println("Invalid input. Please enter either '" 
                        + option1 + "' or '" + option2 + "'.");
            } 

        }  
    }
    
    public static boolean validateInput(String input) {
        return input != null && !input.trim().isEmpty();
    }
   
}
