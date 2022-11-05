import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.util.Arrays;

public class OddIndicesTest {

    @Test

    //1. Positive testing Happy path

    public void testPrintArray_HappyPath() {
        //AAA
        // arrange
        int[] mass = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        //act

        int[] actualResult = new OddIndices().oddIndices(mass);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    // 2. Negative test
    public void testPrintArray_NullNegative() {
        //AAA
        // arrange
        int[] mass = null;
        int[] expectedResult = {};

        //act

        int[] actualResult = new OddIndices().oddIndices(mass);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testPrintArray_EmptyNegative() {
        //AAA
        // arrange
        int[] mass = {};
        int[] expectedResult = {};

        //act

        int[] actualResult = new OddIndices().oddIndices(mass);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}




