import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class OddEvenTest {

    @Test

    // 1. Positive testing Happy path
    //  if(number < 0)
    //   -375  ________ "Odd"

    public void testNumberMNull() {
        ///AAA
        ///arrange
        int number = -345;
        String expectedResult = "Odd";

        //act

      String actualResult = new OddEven().oddEven(number);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }


//    222222    "Even"



    @Test
    // 1. Positive testing Happy path
    //  if(number = 0)
    // 0 _________ "Even

    public void testNumberEqualsNull() {
        ///AAA
        ///arrange
        int number = 0;
        String expectedResult = "Even";

        //act

        String actualResult = new OddEven().oddEven(number);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

   @Test
    // 1. Positive testing Happy path
    //  if(number % 2 == 0)
    // 222222 _________ "Even

   public void testNumberEvenEqualsNull() {
       ///AAA
       ///arrange
       int number = 222222;
       String expectedResult = "Even";

       //act

       String actualResult = new OddEven().oddEven(number);

       //assert
       Assert.assertEquals(actualResult, expectedResult);
   }

   @Ignore
   @Test
    //2.Negative Testing
    // number not even
    // return error

   public void testNumberEvenEqualsNull_Negative() {
       ///AAA
       ///arrange
       int number = -0;
       String expectedResult = "Even";

       //act

       String actualResult = new OddEven().oddEven(number);

       //assert
       Assert.assertEquals(actualResult, expectedResult);
   }





}
