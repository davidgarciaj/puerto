

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PuertoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PuertoTest
{
    /**
     * Default constructor for test class PuertoTest
     */
    public PuertoTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void test001()
    {
        Puerto puerto1 = new Puerto();
        Velero velero1 = new Velero(4, "AAA", 20, 1992);
        Yate yate1 = new Yate(4, 30, "BBB", 50.5f, 1992);
        Cliente cliente1 = new Cliente("Jose", "3333");
        Cliente cliente2 = new Cliente("Ania", "4444");
        assertEquals(0, puerto1.addAlquiler(5, cliente1, velero1));
        assertEquals(1, puerto1.addAlquiler(4, cliente2, yate1));
        puerto1.verEstadoAmarres();
        assertEquals(2200, puerto1.liquidarAlquiler(0), 0.1);
        puerto1.verEstadoAmarres();
        assertEquals(-1, puerto1.liquidarAlquiler(0), 0.1);
    }

    @Test
    public void test002()
    {
        Puerto puerto1 = new Puerto();
        Cliente cliente1 = new Cliente("Pepe", "AAA");
        Cliente cliente2 = new Cliente("Alvaro", "SSS");
        Cliente cliente3 = new Cliente("Alex", "DDD");
        Cliente cliente4 = new Cliente("Pedro", "FFF");
        Velero velero1 = new Velero(2, "ZZZ", 10, 1963);
        EmbarcacionDeportiva embarcac1 = new EmbarcacionDeportiva(1500, "XXX", 50, 1996);
        Yate yate1 = new Yate(5, 1600, "CCC", 60, 2005);
        Velero velero2 = new Velero(3, "VVV", 5, 1995);
        assertEquals(0, puerto1.addAlquiler(3, cliente1, velero1));
        assertEquals(1, puerto1.addAlquiler(5, cliente2, embarcac1));
        puerto1.verEstadoAmarres();
        assertEquals(-1, puerto1.liquidarAlquiler(3), 0.1);
        assertEquals(452500, puerto1.liquidarAlquiler(1), 0.1);
    }
    
    @Test
    public void testPuerto01()
    {
        Velero velero1 = new Velero(4, "ABC", 20, 1989);
        Yate yate1 = new Yate(10, 20000, "GGG", 40, 1999);
        EmbarcacionDeportiva embarcac1 = new EmbarcacionDeportiva(3000, "JKJ", 22, 2001);
        Cliente cliente1 = new Cliente("Juan Magan", "33444555K");
        Cliente cliente2 = new Cliente("Paulina Rubio", "27666777O");
        Cliente cliente3 = new Cliente("Enrique Iglesias", "90888777G");
        Puerto puerto1 = new Puerto();
        assertEquals(0, puerto1.addAlquiler(5, cliente1, velero1));
        assertEquals(1, puerto1.addAlquiler(2, cliente2, yate1));
        assertEquals(2, puerto1.addAlquiler(3, cliente3, embarcac1));
        Velero velero2 = new Velero(1, "BBB", 15, 2010);
        Cliente cliente4 = new Cliente("Julio Iglesias", "23444555K");
        assertEquals(3, puerto1.addAlquiler(10, cliente4, velero2));
        Cliente cliente5 = new Cliente("Pedro Duque", "89777444K");
        Yate yate2 = new Yate(8, 40000, "YYY", 45, 2012);
        assertEquals(-1, puerto1.addAlquiler(1, cliente5, yate2));
        puerto1.verEstadoAmarres();
        assertEquals(800 + (300 * 20010), puerto1.liquidarAlquiler(1), 0.1);
        assertEquals(1, puerto1.addAlquiler(1, cliente5, yate2));
        puerto1.verEstadoAmarres();
    }
}
