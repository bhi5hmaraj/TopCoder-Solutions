import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DatingTest {

    protected Dating solution;

    @Before
    public void setUp() {
        solution = new Dating();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String circle = "abXCd";
        int k = 2;

        String expected = "bC dX";
        String actual = solution.dates(circle, k);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String circle = "abXCd";
        int k = 8;

        String expected = "Xa dC";
        String actual = solution.dates(circle, k);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String circle = "ABCDEFGHIJKLMNOPQRSTUVWXYabcdefghijklmnopqrstuvwxy";
        int k = 100;

        String expected = "yA Ea Mb Yc sB Sd xC nD kF pG Ke jH Xf lI Og Nh oJ uL wP Ui Tm rQ Vq Rt vW";
        String actual = solution.dates(circle, k);

        Assert.assertEquals(expected, actual);
    }

}
