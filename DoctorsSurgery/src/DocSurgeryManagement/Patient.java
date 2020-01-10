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
public class Patient {
    String role;
    String name;
    String address;
    String sex;
    int age;
    
    public void Patient(String role, String name, String address, String sex, int age){
        this.role = role;
        this.name = name;
        this.address = address;
        this.sex = sex;
        this.age = age;
    }
}
