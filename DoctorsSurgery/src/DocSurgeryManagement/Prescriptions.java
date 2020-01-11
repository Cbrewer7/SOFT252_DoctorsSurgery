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
public class Prescriptions extends Medicine {
    protected String docID;
    protected String patientID;
    protected String docNotes;
    protected int quantity;
    protected String dosage;
    
    public void Medicine (String medicine){
        this.name = medicine; 
    }
}
