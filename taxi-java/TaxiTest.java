import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TaxiTest {

    protected Taxi solution;

    @Before
    public void setUp() {
        solution = new Taxi();
    }

    public static void assertEquals(double expected, double actual) {
        if (Double.isNaN(expected)) {
            Assert.assertTrue("expected: <NaN> but was: <" + actual + ">", Double.isNaN(actual));
            return;
        }
        double delta = Math.max(1e-9, 1e-9 * Math.abs(expected));
        Assert.assertEquals(expected, actual, delta);
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int maxX = 10;
        int maxY = 3;
        int taxiDis = 3;

        double expected = 3.0;
        double actual = solution.maxDis(maxX, maxY, taxiDis);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int maxX = 10;
        int maxY = 3;
        int taxiDis = 24;

        double expected = -1.0;
        double actual = solution.maxDis(maxX, maxY, taxiDis);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int maxX = 7;
        int maxY = 10;
        int taxiDis = 13;

        double expected = 10.44030650891055;
        double actual = solution.maxDis(maxX, maxY, taxiDis);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int maxX = 4;
        int maxY = 4;
        int taxiDis = 7;

        double expected = 5.0;
        double actual = solution.maxDis(maxX, maxY, taxiDis);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int maxX = 976421;
        int maxY = 976421;
        int taxiDis = 1000000;

        double expected = 976705.6560100387;
        double actual = solution.maxDis(maxX, maxY, taxiDis);

        assertEquals(expected, actual);
    }

}
