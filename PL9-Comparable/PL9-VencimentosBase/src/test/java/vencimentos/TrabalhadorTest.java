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
     * Test of calcularVencimento method, of class Trabalhador.
     */
    @Test
    public void testCalcularVencimento() {
        System.out.println("calcularVencimento");
        Trabalhador instance = new TrabalhadorImpl();
        float expResult = 0.0F;
        float result = instance.calcularVencimento();
        assertEquals(expResult, result, 0.0);

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

    }

    public class TrabalhadorImpl extends Trabalhador {

        public float calcularVencimento() {
            return 0.0F;
        }
    }
    
}
