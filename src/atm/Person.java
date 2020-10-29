/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;
import java.util.UUID;
import java.util.List; 
import java.util.ArrayList; 
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Vues
 */
public class Person {

        static ArrayList<String> userInfo = new ArrayList<String>();

        static String name;
        static String id;
        
    public Person(){
    
    }
            
    public Person(String name, String id){
        this.name = name;
        this.id = id;
                      
        }
  
    
    @Override
    public String toString(){
    return "Users are the following: " + name + " " + id;
    }
    
    public void name(){
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter First and Last Name:");
        name = s.nextLine();
        id = UUID.randomUUID().toString();
        
        userInfo.add(name);
         
        System.out.println("Thank you for registering " + name);
        //System.out.println("Your id is:" + id );
        
        System.out.println(userInfo + "\n");
    }
}
