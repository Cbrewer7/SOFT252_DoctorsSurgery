/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DocSurgeryManagement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author C-bre
 */
public class MedicineTest {
    
    public MedicineTest() {
    }

    /**
     * Test of getName method, of class Medicine.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Medicine instance = new Medicine();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Medicine.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Medicine instance = new Medicine();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
