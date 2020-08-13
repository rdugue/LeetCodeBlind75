import org.junit.Test
import org.junit.Assert.assertArrayEquals

class TwoSumTests {
    @Test fun twoSumTest() {
        var nums = intArrayOf(2, 7, 11, 15)
        var target = 9
        assertArrayEquals("Two Sum test", intArrayOf(0, 1), twoSum(nums, target))
        nums = intArrayOf(3, 2, 4)
        
    }
}