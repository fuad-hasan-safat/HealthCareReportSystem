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
import java.sql.SQLException;

public class ConnectMSSQL {

    public Connection connection;
    
    public static String url = "jdbc:sqlserver://localhost:1433;databaseName=HealthCareReportSystem;user=sa;password=7896";

    public void connectDB() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=HealthCareReportSystem;selectMethod=cursor", "sa", "7896");

            System.out.println("DATABASE NAME IS:" + connection.getMetaData().getDatabaseProductName());

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        ConnectMSSQL cnObj = new ConnectMSSQL();
        cnObj.connectDB();
    }

}
