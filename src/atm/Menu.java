/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;
import static atm.Person.userInfo;
import java.util.Scanner;
/**
 *
 * @author Vues
 */
public class Menu {
    
    public void mainMenu(){
        Person p = new Person();
        boolean b = true;
        boolean inLoop = true;
        
        while(b == true){
        System.out.println("Welcome Please Login or Register an Account");  
        System.out.println("Enter 1 to Register an Account");  
        System.out.println("Enter 2 to Login");
        
        Scanner s = new Scanner(System.in);
        int picked = s.nextInt();
        int picked2;
        String fName = s.nextLine();
        
        if(picked == 1){
            System.out.println("Registering New Account ");
            p.name();
            System.out.println("Account Successfully Registered" + "\n");
            
            
        }
        else if(picked == 2){
            System.out.println("You Picked 2");
            System.out.println("Enter Your Full Name: ");
            fName = s.nextLine();
            
            if(userInfo.contains(fName)){
                while(inLoop == true){
                System.out.println("Welcome " + fName+ " \n");
                
                System.out.println("1. Withdraw ");
                System.out.println("2. Deposit ");
                System.out.println("3. Main Menu ");
                picked2 = s.nextInt();
                
                switch(picked2){
                    case 1:
                        System.out.print("\nWithdraw amount: $");
                        picked2 = s.nextInt();
                        System.out.print("Withdrew Successfully \n");
                        break;
                    case 2:
                        System.out.print("\nDeposit amount: $");
                        picked2 = s.nextInt();
                        System.out.print("Deposit Successfully \n\n");
                        break;
                    case 3:
                        inLoop = false;
                        System.out.print("\n");
                        break;
                }
                
            }
            }
            else{
                System.out.println("The System can not find your account \n");
            }
            
        }
    }
    }
}
