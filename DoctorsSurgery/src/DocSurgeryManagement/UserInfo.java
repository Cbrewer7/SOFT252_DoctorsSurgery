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
public class UserInfo {
    protected String ID;
    protected String name;
    protected String address;
    protected String sex;
    protected int age;
    
    public String getRole(){
        return ID;
    }
    
    public String getName(){
        return name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public String getSex(){
        return sex;
    }
    
    public int age(){
        return age;
    }
}
