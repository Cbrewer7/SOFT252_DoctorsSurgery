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
public class Doctor {
    String role;
    String name;
    String address;
    
    public void Doctor(String role, String name, String address){
        this.role = role;
        this.name = name;
        this.address = address;
    }
}