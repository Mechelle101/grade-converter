
/**
 * @author mechellepresnell
 * this class handles grade processing
 * from a number grade to a letter grade
 */
public class Grade {
    private int number;
    private String letter;

    //constructor
    public Grade() {
        number = 0;
    }
    
    public Grade(int number) {
       this.number = number; 
    }
    
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    public String getLetter(int number) {
        if(number >= 88) {
           letter = "A";
        } else if (number >= 80 && number <= 87) {
            letter = "B";
        } else if (number >= 68 && number <= 79) {
            letter = "C";
        } else if (number >= 60 && number <= 67) {
            letter = "D";
        } else if (number < 60) {
            letter = "F";
        }    
        return letter;
    }
    
}
