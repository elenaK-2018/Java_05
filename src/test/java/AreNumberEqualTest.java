import org.testng.Assert;
import org.testng.annotations.Test;

public class AreNumberEqualTest {

    //Test Data:
    //89, 89
    //Expected result: 0
    //-89, 89
    //Expected result: -1
    //89, -89
    //Expected result: 1


    @Test
    public  void testAreNumberEquals_HappyPath() {
        int expectedResult = 0;

        int actualResult = new AreNumberEqual().areNumberEqual(89,89);

        Assert.assertEquals(actualResult,expectedResult);
    }


    @Test
    public  void testAreNumberEqualsSecondNegative_HappyPath() {
        int expectedResult = 1;

        int actualResult = new AreNumberEqual().areNumberEqual(89,-89);

        Assert.assertEquals(actualResult,expectedResult);
    }



    @Test
    public  void testAreNumberEqualsFirstNegative_HappyPath() {
        int expectedResult = -1;

        int actualResult = new AreNumberEqual().areNumberEqual(-89,89);

        Assert.assertEquals(actualResult,expectedResult);
    }


    @Test
    public  void testAreNumberEqualsBotNegative_Negative() {
        int expectedResult = 0;

        int actualResult = new AreNumberEqual().areNumberEqual(-89,-89);

        Assert.assertEquals(actualResult,expectedResult);
    }





}

