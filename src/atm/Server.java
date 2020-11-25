/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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

    public void server(){
        
        client.put(nameU, cardNum);
        
        System.out.println(client + "\n");
        System.out.println(mClient + "\n");

    }
    
}
