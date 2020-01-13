package DocSurgeryManagement;

/**
 * CONCRETE CLASS!!!
 * @author C-bre
 */
public class Secretary extends UserInfo {
    
    public Secretary(String _ID, String _Password, String _Name, String _Address, String _Sex, Integer _Age)
    {
        super(_ID, _Password, _Name, _Address, _Sex, _Age);
    }
    
    @Override
    public String getType() {
        return "SECRETARY";
    }
}
