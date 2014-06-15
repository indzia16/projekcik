package dedio.czwarty;

//import javax.persistence.Entity;
import junit.framework.TestCase;



/**
 *
 * @author Indzia
 */
public class WektorTest extends TestCase {
    
    public WektorTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of dodaj method, of class Wektor.
     */
    public void testDodaj() {
        System.out.println("dodaj");
        Object o = new Wektor();
        Wektor instance = new Wektor();
        instance.dodaj(o);

    }

    /**
     * Test of odejmij method, of class Wektor.
     */
    public void testOdejmij() {
        System.out.println("odejmij");
        Object o = new Wektor();
        Wektor instance = new Wektor();
        instance.odejmij(o);

    }

    /**
     * Test of pomnoz method, of class Wektor.
     */
    public void testPomnoz() {
        System.out.println("pomnoz");
        Object o = new Wektor();
        Wektor instance = new Wektor();
        instance.pomnoz(o);

    }

    /**
     * Test of obliczDlougosc method, of class Wektor.
     */
    public void testObliczDlougosc() {
        System.out.println("obliczDlougosc");
        Wektor instance = new Wektor();
        double expResult = 0.0;
        double result = instance.obliczDlougosc();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of wypisz method, of class Wektor.
     */
    public void testWypisz() {
        System.out.println("wypisz");
        Wektor instance = new Wektor();
        instance.wypisz1();

    }

}
