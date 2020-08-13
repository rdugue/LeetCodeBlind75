fun twoSum(nums: IntArray, target: Int): IntArray {
    var indices = intArrayOf()
    for (index1 in nums.indices) {
        val slice = nums.sliceArray(index1+1..nums.lastIndex)
        for (index2 in slice.indices) {
            if (nums[index1] + slice[index2] == target) {
                indices = indices.plus(intArrayOf(index1, index2+1))
                break
            }
        }
        if (indices.size == 2) {
            break
        }
    }
    return indices
}