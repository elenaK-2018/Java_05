import org.testng.Assert;
import org.testng.annotations.Test;

public class BiggerValueTest {



    @Test
    //Positive
    public void printBigValue_PositiveTest(){
        ///AAA
        ///arrange
        int number = 3333;
        int number1 = 9999;
        int expectedResult = 9999;

        //act

        int  actualResult = new BiggerValue().BiggerValue(number,number1);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    //Positive
    public void printBigValue1_PositiveTest(){
        ///AAA
        ///arrange
        int number = -3333;
        int number1 = -9999;
        int expectedResult = -3333;

        //act

        int  actualResult = new BiggerValue().BiggerValue(number,number1);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    //Positive
    public void printEqualsValue_PositiveTest(){
        ///AAA
        ///arrange
        int number = 3333;
        int number1 = 3333;
        int expectedResult = 3333;

        //act

        int  actualResult = new BiggerValue().BiggerValue(number,number1);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}