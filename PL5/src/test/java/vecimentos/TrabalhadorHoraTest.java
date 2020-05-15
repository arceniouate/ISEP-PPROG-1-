/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vecimentos;

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
public class TrabalhadorHoraTest {
    
    public TrabalhadorHoraTest() {
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
     * Test of getNumeroHoras method, of class TrabalhadorHora.
     */
    @Test
    public void testGetNumeroHoras() {
        System.out.println("getNumeroHoras");
        TrabalhadorHora instance = new TrabalhadorHora();
        int expResult = 0;
        int result = instance.getNumeroHoras();
        assertEquals(expResult, result);

    }

    /**
     * Test of getPagamentoHora method, of class TrabalhadorHora.
     */

    /**
     * Test of setNumeroHoras method, of class TrabalhadorHora.
     */
    @Test
    public void testSetNumeroHoras() {
        System.out.println("setNumeroHoras");
        int numeroHoras = 0;
        TrabalhadorHora instance = new TrabalhadorHora();
        instance.setNumeroHoras(numeroHoras);

    }

    /**
     * Test of setPagamentoHora method, of class TrabalhadorHora.
     */
    @Test
    public void testSetPagamentoHora() {
        System.out.println("setPagamentoHora");
        float pagamentoHora = 0.0F;
        TrabalhadorHora instance = new TrabalhadorHora();
        instance.setPagamentoHora(pagamentoHora);

    }



    /**
     * Test of calcularVencimento method, of class TrabalhadorHora.
     */
    @Test
    public void testCalcularVencimento() {
        System.out.println("calcularVencimento");
        TrabalhadorHora instance = new TrabalhadorHora();
        float expResult = 0.0F;
        float result = instance.calcularVencimento();
        assertEquals(expResult, result, 0.0);

    }
    
}
