import org.junit.Assert;

public class BinarySearchTest {

    @org.junit.Test
    public void BinarySearchTest1() throws Exception {
        int[] arr = {1,5,7,8,9,11,18,19,20,25};
        int target = 11;
        int expected = 5;
        int result = BinarySearch.findTarget(arr,target);
        Assert.assertEquals(expected, result);
    }

    @org.junit.Test
    public void BinarySearchTest2() throws Exception {
        int[] arr = {1,2,3,4,5};
        int target = 10;
        int expected = -1;
        int result = BinarySearch.findTarget(arr,target);
        Assert.assertEquals(expected, result);
    }
}
