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
    
    public Doctor(String _ID, String _Password, String _Name, String _Address, String _Sex, Integer _Age)
    {
        super(_ID, _Password, _Name, _Address, _Sex, _Age);
    }
    
    @Override
    public String getType() {
        return "DOCTOR";
    }
}
