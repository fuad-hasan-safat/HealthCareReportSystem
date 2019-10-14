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
class ShowPres {
    private int uniqueCode,patientId,dortorId;
    private String document,date;

    public ShowPres(int uniqueCode, int patientId, int dortorId, String document, String datetime) {
        this.uniqueCode = uniqueCode;
        this.patientId = patientId;
        this.dortorId = dortorId;
        this.document = document;
        this.date = datetime;
    }

    public int getUniqueCode() {
        return uniqueCode;
    }

    public int getPatientId() {
        return patientId;
    }

    public int getDortorId() {
        return dortorId;
    }

    public String getDocument() {
        return document;
    }

    public String getDatetime() {
        return date;
    }
    
    
}
