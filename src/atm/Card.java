/*
 */
package atm;
import java.util.Random;

/**
 *
 * @author Vues
 */
public class Card {
    
    private static short cardNum;
    
    public short card(){
        
        /*
        This class randomly generates a 4 digit card number to apply to each
        new user.
        */
        Random r = new Random();
        cardNum = (short)r.nextInt(9999);
        System.out.println("Your card number is " + cardNum + "\n");
        return cardNum;
    }
    
}
