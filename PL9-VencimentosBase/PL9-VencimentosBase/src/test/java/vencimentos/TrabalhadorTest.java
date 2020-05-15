/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vencimentos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author arccenio
 */
public class TrabalhadorTest {
    
    public TrabalhadorTest() {
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
     * Test of getNome method, of class Trabalhador.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Trabalhador instance = new TrabalhadorImpl();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Trabalhador.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Trabalhador instance = new TrabalhadorImpl();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Trabalhador.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Trabalhador instance = new TrabalhadorImpl();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularVencimento method, of class Trabalhador.
     */
    @Test
    public void testCalcularVencimento() {
        System.out.println("calcularVencimento");
        Trabalhador instance = new TrabalhadorImpl();
        float expResult = 0.0F;
        float result = instance.calcularVencimento();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class Trabalhador.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Trabalhador trabalhador = null;
        Trabalhador instance = new TrabalhadorImpl();
        int expResult = 0;
        int result = instance.compareTo(trabalhador);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class TrabalhadorImpl extends Trabalhador {

        public float calcularVencimento() {
            return 0.0F;
        }
    }
    
}
