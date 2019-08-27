//aah0040
//Alex Holt
import org.junit.*;
import static org.junit.Assert.assertEquals;

public class FinderTest {

    //Tests findMaximum with normal array
    @Test
    public void test_findMaximum1() {
        int[] intArray = {-6,1,8,4,23};
        Integer actualResult = Finder.findMax(intArray);
        Integer expectedResult = 23;
        assertEquals(expectedResult,actualResult);
    }

    //Tests findMaximum with null array
    @Test
    public void test_FindMaximum2(){
        int[] intArray = null;
        Integer actualResult = Finder.findMax(intArray);
        Integer expectedResult = null;
        assertEquals(expectedResult,actualResult);
    }

    //Tests findMax with empty array
    @Test
    public void test_FindMaximum3(){
        int[] intArray = {};
        Integer actualResult = Finder.findMax(intArray);
        Integer expectedResult = null;
        assertEquals(expectedResult,actualResult);
    }

    // Tests findMinimum with normal array
    @Test
    public void test_FindMinimum1() {
        int[] intArray = {-6,1,8,4,23};
        Integer actualResult = Finder.findMin(intArray);
        Integer expectedResult = -6;
        assertEquals(expectedResult,actualResult);
    }

    //Tests findMinimum with null array
    @Test
    public void test_FindMinimum2() {
        int[] intArray = null;
        Integer actualResult = Finder.findMin(intArray);
        Integer expectedResult = null;
        assertEquals(expectedResult,actualResult);
    }

    //Tests findMinimum with empty array
    @Test
    public void test_FindMinimum3() {
        int[] intArray = {};
        Integer actualResult = Finder.findMin(intArray);
        Integer expectedResult = null;
        assertEquals(expectedResult,actualResult);
    }
}