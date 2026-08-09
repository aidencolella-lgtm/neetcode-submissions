class Solution {
    fun calPoints(operations: Array<String>): Int {
        var ans: ArrayList<Int> = ArrayList()

        for (op in operations)
            when (op) {

            "+" -> {
                val last = ans[ans.size - 1]
                val secondLast = ans[ans.size - 2]
                ans.add(last + secondLast)
            }

            "D" -> {
                val last = ans[ans.size - 1]
                ans.add(2 * last)
            }

            "C" -> {
                ans.removeAt(ans.size - 1)
            }

            else -> { ans.add(op.toInt())
            }
        }

        return ans.sum()
    }
}
