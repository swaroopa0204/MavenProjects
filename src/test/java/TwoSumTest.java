import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import collections1.TwoSum;
public class TwoSumTest {

    @Test
    public void testFindTwoSum() {
        TwoSum twoSum = new TwoSum();

        // Test with input: [10,20,30,40,50,60], target: 100
        int[] nums1 = {10, 20, 30, 40, 50, 60};
        int target1 = 100;
        int[] expectedOutput1 = {3, 5};
        assertArrayEquals(expectedOutput1, twoSum.findTwoSum(nums1, target1));

        // Test with input: [2,7,11,15], target: 9
        int[] nums2 = {2, 7, 11, 15};
        int target2 = 9;
        int[] expectedOutput2 = {0, 1};
        assertArrayEquals(expectedOutput2, twoSum.findTwoSum(nums2, target2));

        // Test with input: [3,2,4], target: 6
        int[] nums3 = {3, 2, 4};
        int target3 = 6;
        int[] expectedOutput3 = {1, 2};
        assertArrayEquals(expectedOutput3, twoSum.findTwoSum(nums3, target3));

        // Test with input: [3,3], target: 6
        int[] nums4 = {3, 3};
        int target4 = 6;
        int[] expectedOutput4 = {0, 1};
        assertArrayEquals(expectedOutput4, twoSum.findTwoSum(nums4, target4));

        // Test with input: [1,2,3,4], target: 7
        int[] nums5 = {1, 2, 3, 4};
        int target5 = 7;
        int[] expectedOutput5 = {2, 3};
        assertArrayEquals(expectedOutput5, twoSum.findTwoSum(nums5, target5));
    }
}
