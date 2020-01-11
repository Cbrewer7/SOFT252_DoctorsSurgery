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
public class AccountRequest {
    protected String potentPName;
    protected String potentPAddress;
    
    public String getPotentPName(){
        return potentPName;
    }
    
    public void setPotentPName(String potentPName){
        this.potentPName = potentPName;
    }
    
    public String getPotentPAddress(){
        return potentPAddress;
    }
    
    public void setPotentPAddress(String potentPAddress){
        this.potentPAddress = potentPAddress;
    }
}
