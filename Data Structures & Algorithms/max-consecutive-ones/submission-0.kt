class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var highestCount = 0
        var currentCount = 0

        for (num in nums) {
            if (num == 1) {
                currentCount++
            } else currentCount = 0

            if (currentCount > highestCount) {
                highestCount = currentCount
            }
        }
        return highestCount
    }
}
