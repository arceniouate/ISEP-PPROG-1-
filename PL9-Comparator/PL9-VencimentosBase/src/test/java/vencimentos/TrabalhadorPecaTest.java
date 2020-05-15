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
public class TrabalhadorPecaTest {
    
    public TrabalhadorPecaTest() {
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
     * Test of calcularVencimento method, of class TrabalhadorPeca.
     */
    @Test
    public void testCalcularVencimento() {
        System.out.println("calcularVencimento");
        TrabalhadorPeca instance = new TrabalhadorPeca();
        float expResult = 0.0F;
        float result = instance.calcularVencimento();
        assertEquals(expResult, result, 0.0);

    }


}
