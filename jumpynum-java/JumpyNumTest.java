import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JumpyNumTest {

    protected JumpyNum solution;

    @Before
    public void setUp() {
        solution = new JumpyNum();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int low = 1;
        int high = 10;

        int expected = 9;
        int actual = solution.howMany(low, high);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int low = 9;
        int high = 23;

        int expected = 9;
        int actual = solution.howMany(low, high);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int low = 2000000000;
        int high = 2000000000;

        int expected = 0;
        int actual = solution.howMany(low, high);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int low = 8000;
        int high = 20934;

        int expected = 3766;
        int actual = solution.howMany(low, high);

        Assert.assertEquals(expected, actual);
    }

}
