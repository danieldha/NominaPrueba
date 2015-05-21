/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author danielha
 */
public class NominaIGUTest {
    
    public NominaIGUTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class NominaIGU.
     */
    @Test
    public void testGUI(){
         System.out.println("prueba");
         NominaIGU ni= new NominaIGU();
         
         ni.setVisible(true);
         
    }
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        NominaIGU.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
