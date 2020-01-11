/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DocSurgeryManagement;

/**
 *
 * @author C-bre
 */
public class Appointment {
    protected String docID;
    protected String patientID;
    protected String possibleDates;
    
    public String getDocID(){
        return docID;
    }
    
    public void setDocID(String docID){
        this.docID = docID;
    }
    
    public String getPatientID(){
        return patientID;
    }
    
    public void setPatientID(String patientID){
        this.patientID = patientID;
    }
    
    public String getPossibleDates(){
        return possibleDates;
    }
    
    public void setPossibleDates(String possibleDates){
        this.possibleDates = possibleDates;
    }
}
