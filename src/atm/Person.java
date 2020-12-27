/*
 */
package atm;
import static atm.Server.mClient;
import java.util.Scanner;

/**
 *
 * @author Vues
 */
public class Person {
    
        public static String nameU;
        public static double iDeposit;
        
        public void name(){
        
        Card c = new Card();
        Server ser = new Server();

        Scanner s = new Scanner(System.in);
        
        //Request username
        System.out.print("Enter desired Username" + "\n");
        nameU = s.nextLine();
        
        //Request initial deposit              
        System.out.print("Enter an initial deposit" + "\n");
        iDeposit = s.nextDouble();
        
        //Store both requested items into server.
        mClient.put(nameU, iDeposit);
        
        //Generate card number.
        c.card();
        
        //Store user along with card number.
        ser.server();

        System.out.println("Thank you for registering " + nameU);
        System.out.println("Account Successfully Registered");
    }
}
