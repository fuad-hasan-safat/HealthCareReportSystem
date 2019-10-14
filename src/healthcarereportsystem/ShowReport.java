/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthcarereportsystem;

/**
 *
 * @author pc
 */
class ShowReport {
    private int uniqueCode,patientId,centerId;
    private String document,date;

    public ShowReport(int uniqueCode, int patientId, int centerId, String document, String datetime) {
        this.uniqueCode = uniqueCode;
        this.patientId = patientId;
        this.centerId = centerId;
        this.document = document;
        this.date = datetime;
    }

    public int getUniqueCode() {
        return uniqueCode;
    }

    public int getPatientId() {
        return patientId;
    }

    public int getCenterId() {
        return centerId;
    }

    public String getDocument() {
        return document;
    }

    public String getDatetime() {
        return date;
    }
    
    
}
