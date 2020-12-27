/*
 */
package atm;
import static atm.Card.cardNum;
import static atm.Person.nameU;
import java.util.HashMap;

/**
 *
 * @author Vues
 */
public class Server {
    
   public static HashMap<String, Integer> client = new HashMap<>();
   public static HashMap<String, Double> mClient = new HashMap<>();

   //add user and card number to hashmap
   public void server(){
        client.put(nameU, cardNum);
    }
   
   //shows all users infomation 
   public void users(){
        System.out.println("Username and Card Number");
        System.out.println(client);
        System.out.println("Current balance");
        System.out.println(mClient);
    }
    
}
