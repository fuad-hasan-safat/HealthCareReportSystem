/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthcarereportsystem;

import static healthcarereportsystem.ConnectMSSQL.cn;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author DELL
 */
public class HealthCareReportSystem {

    /**
     */
    public static String session = "";
    
    public static String profileName = "";
    public static String username = "";
    public static int userid = 0;
    public static int adminId = 0;
    public static String adminName = "";

    public static final StartPage StartPage = new StartPage();

    public static final DiagnosticCenterProfile DiagnosticCenterProfile = new DiagnosticCenterProfile();
    public static final DiagnosticCenterSignIn DiagnosticCenterSignIn = new DiagnosticCenterSignIn();
    public static final DiagnosticCenterSignUp DiagnosticCenterSignUp = new DiagnosticCenterSignUp();

    public static final DoctorProfile DoctorProfile = new DoctorProfile();
    public static final DoctorSignIn DoctorSignIn = new DoctorSignIn();
    public static final DoctorSignUp DoctorSignUp = new DoctorSignUp();

    public static final PatientProfile PatientProfile = new PatientProfile();
    public static final PatientSignIn PatientSignIn = new PatientSignIn();
    public static final PatientSignUp PatientSignUp = new PatientSignUp();

    public static final d_details d_details = new d_details();

    public static final AdminQuery AdminQuery = new AdminQuery();
    public static final AdminLogin AdminLogin = new AdminLogin();

    public static void main(String[] args) {
        // TODO code application logic here
        StartPage st = new StartPage();
        st.setVisible(true);
    }

    // go to clicked page
    static void goKlickedPage(JFrame a, JFrame b) {
        a.setVisible(false);
        b.setVisible(true);
    }
    
    static boolean checkLogin()
    {
         try {
            ConnectMSSQL con = new ConnectMSSQL();
            con.connectDatabase();
            session = "OFF";
            String sn = "ON";

            String sql1 = "SELECT * from admin_ where session='"+sn+"'";
            PreparedStatement pst ;
               
            pst = cn.prepareStatement(sql1);
            
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()) {
                adminName = rs.getString(2);
                adminId = rs.getInt(1);
                session = rs.getString(4);
            }
            
            if(session.equalsIgnoreCase("off")) return false;
           

            cn.close();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
         return  true;
    }

    //    reset log in page of doctor
    public static void resetLoginFields(JTextField a, JPasswordField b) {
        a.setText("");
        b.setText("");
    }

    public static void getProfileName(ResultSet rs) {
        try {
            if (rs.next()) {
                //profileName = rs.getString(2);
                userid = rs.getInt(1);
                username = rs.getString(4);

                //adminName = rs.getString(1);
            }
        } catch (SQLException ex) {
            //Logger.getLogger(HealthCareReportSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public static void getAdmin(ResultSet rs) {
        try {
            if (rs.next()) {
                adminId = rs.getInt(1);
                adminName = rs.getString(2);
                //username = rs.getString(4);

                //adminName = rs.getString(1);
            }
        } catch (SQLException ex) {
            //Logger.getLogger(HealthCareReportSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void signUpDoctor(PreparedStatement pst, DoctorSignUp j) throws SQLException {
        pst.setString(1, j.getFirstName().getText());
        pst.setString(2, j.getLastName().getText());
        pst.setString(3, j.getUssername().getText());
        pst.setString(4, j.getSpeciality().getText());

        pst.setString(5, j.getDegree().getText());
        pst.setString(6, j.getMdCollege().getText());
        pst.setString(7, j.getCurrentWorkingPlace().getText());
        pst.setString(8, j.getBDMCNO().getText());
        //String bldGrp =
        pst.setString(9, j.getBloodGroup().getSelectedItem().toString());
        pst.setString(10, j.getSex().getSelectedItem().toString());
        pst.setString(11, ((JTextField) j.getDateOfBirth().getDateEditor().getUiComponent()).getText());

        //System.out.println("date of birth = " + ((JTextField) j.getDateOfBirth().getDateEditor().getUiComponent()).getText());
        pst.setString(12, j.getContact().getText());
        pst.setString(13, j.getCountry().getSelectedItem().toString());
        pst.setString(14, j.getDivision().getSelectedItem().toString());

        pst.setString(15, j.getDistrict().getText());
        pst.setString(16, j.getVillage().getText());
        pst.setString(17, j.getThana().getText());

        pst.setString(18, j.getRoad().getText());
        pst.setString(19, j.getHouse().getText());
    }

    public static void doctorSingIn(PreparedStatement pst, DoctorSignUp j) throws SQLException {
        pst.setString(1, j.getUssername().getText());
        pst.setString(2, j.getEmail().getText());
        pst.setString(3, j.getPassword().getText());
    }

    public static void signUpPatient(PreparedStatement pst, PatientSignUp j) throws SQLException {
        pst.setString(1, j.getFirstName().getText());
        pst.setString(2, j.getLastName().getText());
        pst.setString(3, j.getUssername().getText());
        pst.setString(4, j.getBloodGroup().getSelectedItem().toString());

        pst.setString(5, j.getSex().getSelectedItem().toString());
        pst.setString(6, ((JTextField) j.getDateOfBirth().getDateEditor().getUiComponent()).getText());
        pst.setString(7, j.getContact().getText());
        pst.setString(8, j.getCountry().getSelectedItem().toString());
        //String bldGrp =
        pst.setString(9, j.getDivision().getSelectedItem().toString());
        pst.setString(10, j.getDistrict().getText());
        pst.setString(11, j.getCity().getText());

        pst.setString(12, j.getThana().getText());
        pst.setString(13, j.getRoad().getText());
        pst.setString(14, j.getHouse().getText());
    }

    public static void patientSingIn(PreparedStatement pst, PatientSignUp j) throws SQLException {
        pst.setString(1, j.getUssername().getText());
        pst.setString(2, j.getEmail().getText());
        pst.setString(3, j.getPassword().getText());
    }

    public static void signUpDiagnosticCenter(PreparedStatement pst, DiagnosticCenterSignUp j) throws SQLException {
        pst.setString(1, j.getCentenName().getText());
        pst.setString(2, j.getUsername().getText());
        pst.setString(3, ((JTextField) j.getEstablishDate().getDateEditor().getUiComponent()).getText());
        pst.setString(4, j.getContact().getText());

        pst.setString(5, j.getCountry().getSelectedItem().toString());
        pst.setString(6, j.getDivision().getSelectedItem().toString());
        pst.setString(7, j.getDistrict().getText());
        pst.setString(8, j.getCity().getText());
        //String bldGrp =
        pst.setString(9, j.getThana().getText());
        pst.setString(10, j.getRoad().getText());
        pst.setString(11, j.getHouse().getText());
    }

    public static void DiagnosticCenterSingIn(PreparedStatement pst, DiagnosticCenterSignUp j) throws SQLException {
        pst.setString(1, j.getUsername().getText());
        pst.setString(2, j.getEmail().getText());
        pst.setString(3, j.getPassword().getText());
    }

    public static void logInDoctorandFetchName(PreparedStatement pst, PreparedStatement pstName, DoctorSignIn j) throws SQLException {
        pst.setString(1, j.getUserName().getText());
        pst.setString(2, j.getPassword().getText());

        pstName.setString(1, j.getUserName().getText()); // profile
    }

    public static void logInPatientandFetchName(PreparedStatement pst, PreparedStatement pstName, PatientSignIn j) throws SQLException {
        pst.setString(1, j.getUserName().getText());
        pst.setString(2, j.getPassword().getText());

        pstName.setString(1, j.getUserName().getText()); // profile
    }

    public static void logInDiagnosticCenterFetchName(PreparedStatement pst, PreparedStatement pstName, DiagnosticCenterSignIn j) throws SQLException {
        pst.setString(1, j.getUsername().getText());
        pst.setString(2, j.getPassword().getText());

        pstName.setString(1, j.getUsername().getText()); // profile
    }

    public static void logInAdminFetchName(PreparedStatement pst, AdminLogin j) throws SQLException {
        pst.setString(1, j.getUsername().getText());
        pst.setString(2, j.getPassword().getText());
    }
}
