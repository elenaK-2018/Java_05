import org.testng.Assert;
import org.testng.annotations.Test;

public class ConditionalActionsTest {

    @Test
    public void mMultipleOfSevenAndNine() {

        int m = 0;
        String expectedResult = "Zero is always multiple of every number";

        String actualResult = new ConditionalActions().conditionalActions(m);

        Assert.assertEquals(actualResult,expectedResult);
    }


    @Test
    public void mMultipleOfNineAndNotOfSeven() {

        int m = 18;
        String expectedResult = "Bad Number";

        String actualResult = new ConditionalActions().conditionalActions(m);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void mMultipleOfNineAndSeven() {

        int m = 63;
        String expectedResult = "Good Number";

        String actualResult = new ConditionalActions().conditionalActions(m);

        Assert.assertEquals(actualResult,expectedResult);
    }




}
