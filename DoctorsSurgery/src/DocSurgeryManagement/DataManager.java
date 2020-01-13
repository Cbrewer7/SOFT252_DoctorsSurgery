
package DocSurgeryManagement;

import DocSurgeryManagement.Forms.MenuAdmin;
import DocSurgeryManagement.Forms.MenuDoctor;
import DocSurgeryManagement.Forms.MenuPatient;
import DocSurgeryManagement.Forms.MenuSecretary;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class DataManager {
    
    public static ArrayList<UserInfo> UserList = new ArrayList<UserInfo>();
    
    // _ID, _Password, _Name, _Address, _Sex, _Age
    static public void initializeDataManager()
    {
        try {
            UserRead();
        }
        catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
    
    static public void UserRead() throws Exception {
        
        String UserType;
        String UserID;
        String SecretPw;
        String Name;
        String Address;
        String Sex;
        Integer Age;
        
        try (Scanner scanner = new Scanner(new File("user_data.txt"))) {
                        
            while (scanner.hasNextLine()) {
                
                UserType = scanner.nextLine();
                UserID = scanner.nextLine();
                SecretPw = scanner.nextLine();
                Name = scanner.nextLine();
                Address = scanner.nextLine();
                Sex = scanner.nextLine();
                Age = Integer.parseInt(scanner.nextLine());
                
                switch(UserType)
                {
                    case "ADMIN":
                    {
                        UserList.add(new Admin(UserID, SecretPw, Name, Address, Sex, Age));
                    }
                    break;
                    case "SECRETARY":
                    {
                        UserList.add(new Secretary(UserID, SecretPw, Name, Address, Sex, Age));
                    }
                    break;
                    case "DOCTOR":
                    {
                        UserList.add(new Doctor(UserID, SecretPw, Name, Address, Sex, Age));
                    }
                    break;
                    case "PATIENT": // hope they die
                    {
                        UserList.add(new Patient(UserID, SecretPw, Name, Address, Sex, Age));
                    }
                    break;
                }
            }
        }
    }
    
    static public void UserWrite() throws Exception
    {
        FileOutputStream fos = new FileOutputStream(new File("user_data.txt"));
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos))) {
            
            for(UserInfo user : UserList) {
                bw.write(user.getType());
                bw.newLine();
                bw.write(user.getID());
                bw.newLine();
                bw.write(user.getPassword());
                bw.newLine();
                bw.write(user.getName());
                bw.newLine();
                bw.write(user.getAddress());
                bw.newLine();
                bw.write(user.getSex());
                bw.newLine();
                bw.write(Integer.toString(user.getAge()));
                bw.newLine();
            }
            
            bw.close();
        }
    }
    
    public static boolean UserRegister(String _userType, String _ID, String _Password, String _Name, String _Address, String _Sex, Integer _Age) {
        
            switch (_userType)
            {
                case "ADMIN":
                {
                    Admin u = new Admin(_ID, _Password, _Name, _Address, _Sex, _Age);
                    UserList.add(u);
                }
                break;
                case "SECRETARY":
                {
                    Secretary u = new Secretary(_ID, _Password, _Name, _Address, _Sex, _Age);
                    UserList.add(u);
                }
                break;
                case "DOCTOR":
                {
                    Doctor u = new Doctor(_ID, _Password, _Name, _Address, _Sex, _Age);
                    UserList.add(u);
                }
                break;
                case "PATIENT":
                {
                    Patient u = new Patient(_ID, _Password, _Name, _Address, _Sex, _Age);
                    UserList.add(u);
                }
                break;
            }
        
       try {
            UserWrite();
        }
        catch (Exception e) {
            System.out.println("Exception: " + e);
        }
            
            
        return false;
    }
    
    public static UserInfo UserFindByID(String IDToFind) {
        
        for(UserInfo user : UserList) {
            if (IDToFind.equals(user.getID())) {
                return user;
            }
        }
        
        return null;
    }
}
