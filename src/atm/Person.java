/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;
import static atm.Server.mClient;
import java.util.Scanner;

/**
 *
 * @author Vues
 */
public class Person {
    
        Server ser = new Server();
        
        public static String nameU;
        public static double iDeposit;
        
        public void name(){
        
        Card c = new Card();
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter desired Username" + "\n");
        nameU = s.nextLine();
                       
        System.out.print("Enter an initial deposit" + "\n");
        iDeposit = s.nextDouble();
        mClient.put(nameU, iDeposit);
        
        c.card();
        ser.server();
        mClient.put(nameU, iDeposit);
        
                 
        System.out.println("Thank you for registering " + nameU + "\n");
        System.out.println("Account Successfully Registered" + "\n");
    }
}
