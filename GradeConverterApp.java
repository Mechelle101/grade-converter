
/**
 * @author mechellepresnell
 * Project converters number grade 
 * to letter grade using multiple classes
 */
public class GradeConverterApp {

    public static void main(String[] args) {
        //Starting point of the application, display welcome message
        System.out.println("Welcome to the letter grade converter\n");
        
        //creates a new grade instance
        Grade g = new Grade(); 
        
        String choice = "y";   
        while (choice.equalsIgnoreCase("y")) {
            
            int number = Console.getNumber("Enter a numerical grade:   ");
            String letterGrade = g.getLetter(number);
            
            System.out.println("Letter grade:   " + letterGrade + "\n");
  
            //this calls the getstring on the console class
            choice = Console.getString("Continue? (y/n): ", "y", "n"); 
            System.out.println();
        } 
    }
  
}
