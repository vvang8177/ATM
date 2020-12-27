/*
 */
package atm;
import java.util.Random;

/**
 *
 * @author Vues
 */
public class Card {
    
    public static int cardNum;
    
    public void card(){
        
        /*
        This class randomly generates a 4 digit card number to apply to each
        new user.
        */
        Random r = new Random();
        cardNum = r.nextInt(9999);
        System.out.println("Your card number is " + cardNum + "\n");
        
    }
    
}
