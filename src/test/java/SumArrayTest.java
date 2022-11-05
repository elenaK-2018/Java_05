import org.testng.Assert;
import org.testng.annotations.Test;

public class SumArrayTest {

   @Test

//     1. Positive testing Happy path
//      if(number > 0)
//       ---   15

    public void testPrintSumNotNegativeValues() {
        ///AAA
        ///arrange
        int[] array = {0,1,2,3,4,5};
        int expectedResult = 15;

        //act
        int actualResult = new SumArray().sumArray(array);


       //assert
        Assert.assertEquals(actualResult, expectedResult);
    }



    @Test
       // Positive
    public void testPrintSumNegativeValues() {
        ///AAA
        ///arrange
        int[] array = {-7, -3};
        int expectedResult = -10;

        //act
        int actualResult = new SumArray().sumArray(array);


        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }


     @Test
      //Positive
    public void testPrintZeroLengthArray() {
        ///AAA
        ///arrange
        int[] array = new int[0];
        int expectedResult = 0;

        //act
        int actualResult = new SumArray().sumArray(array);


        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
