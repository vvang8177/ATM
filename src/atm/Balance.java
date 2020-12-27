/*
 */
package atm;

import static atm.Menu.fName;
import static atm.Server.mClient;
import java.util.Scanner;

/**
 *
 * @author Vues
 */
public class Balance {
    
    private double currentBalance;
    private double newBalance;
    private double withdrawAmount;
    private double depositAmount;
    Scanner s = new Scanner(System.in);

    //User can withdraw from their account
    public void withdraw(){
        
        //get current balance
        currentBalance =  mClient.get(fName);
        
        //Ask withdraw amount
        System.out.println("\nEnter withdraw amount: ");
        withdrawAmount = s.nextDouble();
        
        /*
        if statement for if balance is less than requested withdraw amount
        show text. If balance is greater then withdraw amount requested.
        */
        if(currentBalance <withdrawAmount)
        {
            System.out.println("Not enough fund");
        }
        
        else if( currentBalance >= withdrawAmount)
                {
                    newBalance = currentBalance - withdrawAmount;
                    mClient.put(fName, newBalance); 
                    System.out.print("Withdrew Successfully" + "\n");
                }
       
    }
    
    //User can deposit to their accont
    public void deposit(){
        
        try{
            //get current balance
            currentBalance =  mClient.get(fName);
            
            //request deposit amount
            System.out.println("\nEnter deposit amount: ");
            depositAmount = s.nextDouble();
            
            //add current balance and requested deposit amount
            newBalance = currentBalance + depositAmount;
            
            //store new added balance to correct user.
            mClient.put(fName, newBalance);
            
            System.out.print("Deposit Successfully" + "\n");
            }
            
            //allow numbers only
            catch(NumberFormatException e){
            System.out.println("No letters, numbers only");
        }
    }
}
