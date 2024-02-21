class Solution {
    private static ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head, temp = null;
        while(curr != null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null)
            return null;
        ListNode newHead = reverseList(head), prev = null, curr = newHead;
        while(--n > 0) {
            prev = curr;
            curr = curr.next;
        }
        if(prev == null) {
           
            prev = curr;
            curr = curr.next;
            prev.next = null;
            head = reverseList(curr);
        } else {
            prev.next = curr.next;
            curr.next = null;
            head = reverseList(newHead);
        }
        return head;
    }
}
