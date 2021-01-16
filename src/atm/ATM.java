/*
 */
package atm;

import java.sql.SQLException;

/**
 *
 * @author Vues
 */
public class ATM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        Menu m = new Menu();
        m.mainMenu();        
    }
}
