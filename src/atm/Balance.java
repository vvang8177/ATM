/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
    
    static double currentBalance;
    static double newBalance;
    static double withdrawAmount;
    static double depositAmount;
    Scanner s = new Scanner(System.in);

    
    public void withdraw(){
        
        currentBalance =  mClient.get(fName);
        
        System.out.println("\nEnter withdraw amount: ");
        withdrawAmount = s.nextDouble();
        
        if(currentBalance <withdrawAmount){
        System.out.println("\nNot enough fund");
        }
        
        
        else if( currentBalance >= withdrawAmount)
                {
                    newBalance = currentBalance - withdrawAmount;
                    mClient.put(fName, newBalance); 
                    System.out.print("Withdrew Successfully \n" + "\n");
                }
       
    }
    
    public void deposit(){
        
        try{
        currentBalance =  mClient.get(fName);
        System.out.println("\nEnter deposit amount: ");
        depositAmount = s.nextDouble();
        newBalance = currentBalance + depositAmount;
        mClient.put(fName, newBalance);
        System.out.print("Deposit Successfully \n" + "\n");
        }
        catch(NumberFormatException e){
            System.out.println("No letters, numbers only");
        }
    }
}
