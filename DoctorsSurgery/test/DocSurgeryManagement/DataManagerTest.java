/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DocSurgeryManagement;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author C-bre
 */
public class DataManagerTest {
    
    public DataManagerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of initializeDataManager method, of class DataManager.
     */
    @Test
    public void testInitializeDataManager() {
        System.out.println("initializeDataManager");
        DataManager.initializeDataManager();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of UserRead method, of class DataManager.
     */
    @Test
    public void testUserRead() throws Exception {
        System.out.println("UserRead");
        DataManager.UserRead();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of UserWrite method, of class DataManager.
     */
    @Test
    public void testUserWrite() throws Exception {
        System.out.println("UserWrite");
        DataManager.UserWrite();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of UserRegister method, of class DataManager.
     */
    @Test
    public void testUserRegister() {
        System.out.println("UserRegister");
        String userType = "";
        String ID = "";
        String password = "";
        String name = "";
        String address = "";
        String sex = "";
        Integer age = null;
        boolean expResult = false;
        boolean result = DataManager.UserRegister(userType, ID, password, name, address, sex, age);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of UserFindByID method, of class DataManager.
     */
    @Test
    public void testUserFindByID() {
        System.out.println("UserFindByID");
        String IDToFind = "";
        UserInfo expResult = null;
        UserInfo result = DataManager.UserFindByID(IDToFind);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
