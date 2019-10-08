/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthcarereportsystem;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author DELL
 */
public class HealthCareReportSystem {

    /**
     */
    public static String profileName = "";

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

    //    reset log in page of doctor
    public static void resetDoctorLogin(JTextField a, JPasswordField b) {
        a.setText("");
        b.setText("");
    }

    public static void getProfileName(ResultSet rs) {
        try {
            if (rs.next()) {
                profileName = rs.getString("Name");
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

        System.out.println("date of birth = " + ((JTextField) j.getDateOfBirth().getDateEditor().getUiComponent()).getText());

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
        pst.setString(6,((JTextField) j.getDateOfBirth().getDateEditor().getUiComponent()).getText());
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
}
