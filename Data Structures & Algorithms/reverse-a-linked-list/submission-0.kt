
class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        var next: ListNode?
        var cur: ListNode? = head
        var prev: ListNode? = null

        while (cur != null) {
            next = cur.next

            cur.next = prev

            prev = cur
            cur = next
        }
        return prev
    }
}
