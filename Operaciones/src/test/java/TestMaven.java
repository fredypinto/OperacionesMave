/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author fpintopi
 */
public class TestMaven {

    public TestMaven() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void pruebaSuma() {
        int a = 2, b = 2;

        OperacionesMatematicas op = new OperacionesMatematicas();
        Assert.assertEquals(op.suma(a, b), 4);

    }
    
    @Test
    public void pruebaResta(){
        int a=5,b=3;
        
        OperacionesMatematicas op = new OperacionesMatematicas();
        Assert.assertEquals(op.resta(a, b), 2);
    }
}
