/*
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
        
        //User options always active until terminated. 
        while(b == true){
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++" );
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++" );
        System.out.println("Welcome Please Login or Register an Account");  
        System.out.println("Enter 1 to Register an Account");  
        System.out.println("Enter 2 to Login");
        System.out.println("Enter 3 Check All Clients in HashMap");
        System.out.println("Enter 4 Stop Program");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++" );
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++" );
        
        Scanner s = new Scanner(System.in);
        int picked = s.nextInt();
        int picked2;
        fName = s.nextLine();
        
        //Avaiable options when picked based from above loop
        //If picked 1 called Person class and run name method.
        if(picked == 1){
            p.name(); 
       
        }
        
        /*
        If picked 2, match entered username with server. If server has entered name
        user can choose to withdraw, deposit, or logout.
        */        
        else if(picked == 2){
            inLoop = true;
            System.out.println("Enter Your Username: ");
            fName = s.nextLine();
            
            if(client.containsKey(fName)){
                while(inLoop == true){
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++" );
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++" );
                System.out.println("Welcome " + fName);
                System.out.print("Current balance: $" + mClient.get(fName)+ "\n");
                System.out.println("1. Withdraw ");
                System.out.println("2. Deposit ");
                System.out.println("3. Logout ");
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++" );
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++" );

                picked2 = s.nextInt();
                
                switch(picked2){
                    case 1:
                        //Allows user to withdraw
                        System.out.print("Current balance: $" + mClient.get(fName));
                        bal.withdraw();
                        break;
                    case 2:
                        //Allows user to deposit
                        System.out.print("Current balance: $" + mClient.get(fName));
                        bal.deposit();
                        break;
                    case 3:
                        //Set loop to false to go back to main menu
                        inLoop = false;
                        System.out.print("\n");
                        break;
                }
             
            }
            }
            else{
                //If entered username doesnt match system. Display this message.
                System.out.println("\nThe System can not find your account \n");
            }
            
        }
        else if(picked == 3){
            //Shows current users in server.
            ser.users();
        }
        else if(picked == 4){
            //Terminate program.
            System.exit(0);
        }
    }
    }
}
