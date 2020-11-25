/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        
        Random r = new Random();
        cardNum = r.nextInt(9999);
        System.out.println("Your card number is " + cardNum + "\n");
        
    }
    
}
