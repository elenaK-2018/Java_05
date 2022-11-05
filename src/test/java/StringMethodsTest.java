import org.testng.Assert;
import org.testng.annotations.Test;

public class StringMethodsTest {

    @Test   //Задание 3
    public void testRemoveAllAsZeros_HappyPath() {
        String text = "3504209706040000";
        String expectedResult = "35429764";

        String  actualResult = new StringMethods().removeAllAsZeros(text);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testRemoveAllAsZeros_HappyPath2() {
        String text = "0000000111";
        String expectedResult = "111";

        String  actualResult = new StringMethods().removeAllAsZeros(text);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testRemoveAllAsZeros_Negative() {
        String text = "";
        String expectedResult = "Invalid string";

        String  actualResult = new StringMethods().removeAllAsZeros(text);

        Assert.assertEquals(actualResult,expectedResult);
    }



    @Test    //Задание 5
    public void testCountAs_HappyPath() {
        String text = "Abracadabra";
        String expectedResult = "5, 6";

        String actualResult = new StringMethods().countAs(text);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testCountAs_HappyPath2() {
        String text = "Homenum Revelio";
        String expectedResult = "0, 15";

        String actualResult = new StringMethods().countAs(text);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testCountAs_HappyPath3() {
        String text = "3 tarAmasAlatA";
        String expectedResult = "6, 8";

        String actualResult = new StringMethods().countAs(text);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testCountAs_Negative() {
        String text = "";
        String expectedResult = "Invalid value";

        String actualResult = new StringMethods().countAs(text);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testCountAs_StringNull_Negative1() {
        String text = null;
        String expectedResult = "null";

        String actualResult = new StringMethods().countAs(text);

        Assert.assertEquals(actualResult,expectedResult);
    }


    @Test
    public void testCountAs2_HappyPath() {
        String text = "Abracadabra";
        String expectedResult = "5, 6";

        String actualResult = new StringMethods().countAs2(text);

        Assert.assertEquals(actualResult,expectedResult);
    }



     @Test  // Задание 11
    public void testSameFirstLastLetterIndexOf_HappyPath() {
        String str = "Abracadabra";
        boolean expectedResult = true;

        boolean actualResult = new StringMethods().sameFirstLastLetterIndexOf(str);

        Assert.assertEquals(actualResult,expectedResult);
     }


    @Test
    public void testSameFirstLastLetterIndexOf_HappyPath2() {
        String str = "Whippersnapper";
        boolean expectedResult = false;

        boolean actualResult = new StringMethods().sameFirstLastLetterIndexOf(str);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testSameFirstLastLetterIndexOf_Negative() {
        String str = null;
        boolean expectedResult = false;

        boolean actualResult = new StringMethods().sameFirstLastLetterIndexOf(str);

        Assert.assertEquals(actualResult,expectedResult);
    }






//    @Test
//
//    public void countJavaTest() {
//
//       String text = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current "
//               + "long-term support (LTS) versions. Oracle released the last zero-cost public update for the legacy "
//               + "version Java 8 LTS in January 2019 for commercial use, although it will otherwise still support Java"
//               + " 8 with public updates for personal use indefinitely. Other vendors have begun to offer zero-cost "
//               + "builds of OpenJDK 8 and 11 that are still receiving security and other upgrades.";
//
//       boolean expectedResult = true;
//
//       boolean actualResult = new StringMethods().c
//
//               Ass
//    }

}
