/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthcarereportsystem;

/**
 *
 * @author fuads
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConnectMSSQL {
    
    /**
     *
     */
    public String ur;
    public static Connection cn;
    
   
    public void connectDatabase() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        ur = "jdbc:sqlserver://localhost:1433;databaseName=HealthCareReportSystem;user=sa;password=7896";
        cn = DriverManager.getConnection(ur);
            
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ConnectMSSQL cnObj = new ConnectMSSQL();
        cnObj.connectDatabase();
    }
    
    /// for select.....................
    
    public boolean tryToLogin(ResultSet rs)
    {
        try {
            if(rs.next())
            {
                System.out.println("Connection Successfull");
                JOptionPane.showMessageDialog(null, "welcome you have success to log in");
                //Succes field= new Succes();
                //field.setVisible(true);
                return true;
            }
        } catch (SQLException ex) {
            //Logger.getLogger(ConnectMSSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }

    
    
    
    
    
 
    
    
    // for reset fields............................
    

    
    
    
    
    
    
    
    
    
    
    // rubish
    private static class Succes {

        public Succes() {
        }

        private void setVisible(boolean b) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

}
