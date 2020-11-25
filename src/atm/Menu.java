/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;
import static atm.Server.client;
import static atm.Server.mClient;
import java.util.Scanner;
/**
 *
 * @author Vues
 */
public class Menu {
    
    public static String fName;

    public void mainMenu(){
        Server ser = new Server();
        Person p = new Person();
        Balance bal = new Balance();
        boolean b = true;
        boolean inLoop = true;
        
        while(b == true){
        System.out.println("Welcome Please Login or Register an Account");  
        System.out.println("Enter 1 to Register an Account");  
        System.out.println("Enter 2 to Login");
        System.out.println("Enter 3 Check All Clients in HashMap");
        System.out.println("Enter 4 Stop Program");

        
        Scanner s = new Scanner(System.in);
        int picked = s.nextInt();
        int picked2;
        fName = s.nextLine();

        if(picked == 1){
            p.name(); 
       
        }
        
        else if(picked == 2){
            inLoop = true;
            System.out.println("Enter Your Username: ");
            fName = s.nextLine();
            
            if(client.containsKey(fName)){
                while(inLoop == true){
                System.out.println("Welcome " + fName);
                System.out.print("Current balance: $" + mClient.get(fName)+ "\n");
                System.out.println("1. Withdraw ");
                System.out.println("2. Deposit ");
                System.out.println("3. Main Menu ");                                

                picked2 = s.nextInt();
                
                switch(picked2){
                    case 1:
                        System.out.print("Current balance: $" + mClient.get(fName));
                        bal.withdraw();
                        break;
                    case 2:
                        System.out.print("Current balance: $" + mClient.get(fName));
                        bal.deposit();
                        break;
                    case 3:
                        inLoop = false;
                        System.out.print("\n");
                        break;
                }
             
            }
            }
            else{
                System.out.println("\nThe System can not find your account \n");
            }
            
        }
        else if(picked == 3){
            ser.server();
        }
        else if(picked == 4){
            System.exit(0);
        }
    }
    }
}
