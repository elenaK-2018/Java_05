import org.testng.Assert;
import org.testng.annotations.Test;

public class ManipulationWithArraysTest {


    @Test
    public  void testArrayOfProductsIntRange_HappyPath() {

        int[] array = {1, 2, 3, 4, 5};
        int number = 3;
        int[] expectedResult = {3, 6, 9, 12, 15} ;

        int[] actualResult = new ManipulationWithArrays().multiplyArrayByNumber(array,number);

        Assert.assertEquals(actualResult,expectedResult);


    }

    @Test
    public  void testArrayNull_HappyPath() {

        int[] array = null;
        int number = 3;
        int[] expectedResult ={ } ;

        int[] actualResult = new ManipulationWithArrays().multiplyArrayByNumber(array,number);

        Assert.assertEquals(actualResult,expectedResult);


    }
}

