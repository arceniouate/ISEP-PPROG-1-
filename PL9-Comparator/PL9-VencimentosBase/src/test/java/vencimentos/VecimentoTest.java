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
public class VecimentoTest {
    


    /**
     * Test of compare method, of class Vecimento.
     */
    @Test
    public void testCompare() {
        System.out.println("compare");
        Trabalhador t = new TrabalhadorComissao("Leo", 20, 35, 22);
        Trabalhador t1 = new TrabalhadorPeca("Jorge Silva", 20, 30);
        Vecimento instance = new Vecimento();
        int expResult = -1;
        int result = instance.compare(t, t1);
        assertEquals(expResult, result);
    }

    
}
