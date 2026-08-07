import kotlin.math.max

class Solution {
    fun replaceElements(arr: IntArray): IntArray {
        var maxSoFar = -1

        for (i in arr.size - 1 downTo 0) {
            val temp = arr[i]
            arr[i] = maxSoFar
            maxSoFar = max(maxSoFar, temp)
        }

        return arr
    }
}