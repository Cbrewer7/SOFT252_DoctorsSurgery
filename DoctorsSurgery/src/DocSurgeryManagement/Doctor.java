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
public class Doctor extends UserInfo{
    
    public void Doctor(String docID, String name, String address){
        this.ID = docID;
        this.name = name;
        this.address = address;
    }
}
