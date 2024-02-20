class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode it = dummy;
        ListNode prevIt = null;

        for(int i = 0; i < left; i++){
            prevIt = it;
            it = it.next;
        }
        ListNode prevItR = prevIt;
        ListNode itR = it;

        for(int i = left; i <= right; i++){
            
            ListNode forward = itR.next;
            itR.next = prevItR;
            prevItR = itR;
            itR = forward;
        }
        
        prevIt.next = prevItR;
        it.next = itR;
        return dummy.next;
    }
}
