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
public class ReportesIT {
    
    public ReportesIT() {
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
     * Test of sueldoBruto method, of class Reportes.
     */
    @Test
    public void testSueldoBruto() {
        System.out.println("sueldoBruto");
        String id = "1234";
        Reportes instance = new Reportes();
        String expResult ="1234\ndaniel\n2000";
        String result = instance.sueldoBruto(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of sueldoreal method, of class Reportes.
     */
    @Test
    public void testSueldoreal() {
        System.out.println("sueldoreal");
        String id = "1234";
        Reportes instance = new Reportes();
        String expResult = "1234\ndaniel\n1840.0";
        String result = instance.sueldoreal(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of sueldosEmpleados method, of class Reportes.
     */
    @Test
    public void testSueldosEmpleados() {
        System.out.println("sueldosEmpleados");
        Reportes instance = new Reportes();
        String expResult = "1236 fabian 920\n1234 daniel 1840";
        String result = instance.sueldosEmpleados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of total method, of class Reportes.
     */
    @Test
    public void testTotal() {
        System.out.println("total");
        Reportes instance = new Reportes();
        int expResult = 3000;
        int result = instance.total();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of sumaSueldos method, of class Reportes.
     */
    @Test
    public void testSumaSueldos() {
        System.out.println("sumaSueldos");
        Reportes instance = new Reportes();
        int expResult = 2760;
        int result = instance.sumaSueldos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of promSueldos method, of class Reportes.
     */
    @Test
    public void testPromSueldos() {
        System.out.println("promSueldos");
        Reportes instance = new Reportes();
        double expResult = 1500.0;
        double result = instance.promSueldos();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of IDEmpleados method, of class Reportes.
     */
    @Test
    public void testIDEmpleados() {
        System.out.println("IDEmpleados");
        Reportes instance = new Reportes();
        String expResult ="1236\n1234";
        String result = instance.IDEmpleados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of menorSueldo method, of class Reportes.
     */
    @Test
    public void testMenorSueldo() {
        System.out.println("menorSueldo");
        Reportes instance = new Reportes();
        String expResult = "1236\nfabian\n1000";
        String result = instance.menorSueldo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
