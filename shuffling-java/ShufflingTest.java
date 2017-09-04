import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShufflingTest {

    protected Shuffling solution;

    @Before
    public void setUp() {
        solution = new Shuffling();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int cards = 10;
        int[] shuffles = new int[]{-2};

        int expected = 2;
        int actual = solution.position(cards, shuffles);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int cards = 52;
        int[] shuffles = new int[]{1, 17, 12, 26, 9};

        int expected = 0;
        int actual = solution.position(cards, shuffles);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int cards = 10;
        int[] shuffles = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1};

        int expected = 5;
        int actual = solution.position(cards, shuffles);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int cards = 100;
        int[] shuffles = new int[]{-50};

        int expected = 50;
        int actual = solution.position(cards, shuffles);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int cards = 100;
        int[] shuffles = new int[]{-48, -49, -2, 10};

        int expected = 95;
        int actual = solution.position(cards, shuffles);

        Assert.assertEquals(expected, actual);
    }

}
