/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entites;

import java.util.List;
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
public class ExposicaoTest {
    
    public ExposicaoTest() {
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
     * Test of getDesinacao method, of class Exposicao.
     */
    @Test
    public void testGetDesinacao() {
        System.out.println("getDesinacao");
        Exposicao instance = new Exposicao();
        String expResult = "";
        String result = instance.getDesinacao();
        assertEquals(expResult, result);

    }

    /**
     * Test of getQuadroList method, of class Exposicao.
     */
    @Test
    public void testGetQuadroList() {
        System.out.println("getQuadroList");
        Exposicao instance = new Exposicao();
        List<Quadro> expResult = null;
        List<Quadro> result = instance.getQuadroList();
        assertEquals(expResult, result);

    }

    /**
     * Test of setQuadroList method, of class Exposicao.
     */
    @Test
    public void testSetQuadroList() {
        System.out.println("setQuadroList");
        List<Quadro> quadroList = null;
        Exposicao instance = new Exposicao();
        instance.setQuadroList(quadroList);

    }

    /**
     * Test of setDesinacao method, of class Exposicao.
     */
    @Test
    public void testSetDesinacao() {
        System.out.println("setDesinacao");
        String desinacao = "";
        Exposicao instance = new Exposicao();
        instance.setDesinacao(desinacao);

    }

    /**
     * Test of getAnoD method, of class Exposicao.
     */
    @Test
    public void testGetAnoD() {
        System.out.println("getAnoD");
        Exposicao instance = new Exposicao();
        Integer expResult = null;
        Integer result = instance.getAnoD();
        assertEquals(expResult, result);

    }

    /**
     * Test of setAnoD method, of class Exposicao.
     */
    @Test
    public void testSetAnoD() {
        System.out.println("setAnoD");
        Integer anoD = null;
        Exposicao instance = new Exposicao();
        instance.setAnoD(anoD);

    }

    /**
     * Test of equals method, of class Exposicao.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        Exposicao instance = new Exposicao();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);

    }

    /**
     * Test of addQuadro method, of class Exposicao.
     */
    @Test
    public void testAddQuadro() {
        System.out.println("addQuadro");
        Quadro quadro = null;
        Exposicao instance = new Exposicao();
        boolean expResult = false;
        boolean result = instance.addQuadro(quadro);
        assertEquals(expResult, result);

    }

    /**
     * Test of removeQ method, of class Exposicao.
     */
    @Test
    public void testRemoveQ() {
        System.out.println("removeQ");
        Quadro quadro = null;
        Exposicao instance = new Exposicao();
        instance.removeQ(quadro);

    }

    /**
     * Test of toString method, of class Exposicao.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Exposicao instance = new Exposicao();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);

    }

    /**
     * Test of compareTo method, of class Exposicao.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Exposicao exposicao = null;
        Exposicao instance = new Exposicao();
        int expResult = 0;
        int result = instance.compareTo(exposicao);
        assertEquals(expResult, result);

    }
    
}
