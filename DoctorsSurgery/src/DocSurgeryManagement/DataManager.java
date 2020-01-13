
package DocSurgeryManagement;

/**
 *
 * @author C-bre
 */
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
                
                //User Data
                UserType = scanner.nextLine();
                UserID = scanner.nextLine();
                SecretPw = scanner.nextLine();
                Name = scanner.nextLine();
                Address = scanner.nextLine();
                Sex = scanner.nextLine();
                Age = Integer.parseInt(scanner.nextLine());
                
                switch(UserType)
                {
                    //Bring up user data based on key word
                    case "ADMIN":
                    {
                        UserInfo ad = new Admin(UserID, SecretPw, Name, Address, Sex, Age);
                        UserList.add(ad);
                    }
                    break;
                    case "SECRETARY":
                    {
                        UserInfo sc = new Doctor(UserID, SecretPw, Name, Address, Sex, Age);
                        UserList.add(sc);
                    }
                    break;
                    case "DOCTOR":
                    {
                        UserInfo dc = new Doctor(UserID, SecretPw, Name, Address, Sex, Age);
                        UserList.add(dc);
                    }
                    break;
                    case "PATIENT": // hope they die
                    {
                        UserInfo pt = new Patient(UserID, SecretPw, Name, Address, Sex, Age);
                        UserList.add(pt);
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
    
    public static boolean UserRegister(String userType, String ID, String password, String name, String address, String sex, Integer age) {
        
            switch (userType)
            {
                case "ADMIN":
                {
                    Admin u = new Admin(ID, password, name, address, sex, age);
                    UserList.add(u);
                }
                break;
                case "SECRETARY":
                {
                    Secretary u = new Secretary(ID, password, name, address, sex, age);
                    UserList.add(u);
                }
                break;
                case "DOCTOR":
                {
                    Doctor u = new Doctor(ID, password, name, address, sex, age);
                    UserList.add(u);
                }
                break;
                case "PATIENT":
                {
                    Patient u = new Patient(ID, password, name, address, sex, age);
                    UserList.add(u);
                }
                break;
            }
        
       try {
            UserWrite();
            return true;
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
