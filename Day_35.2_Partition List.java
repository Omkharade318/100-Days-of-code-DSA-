class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode low=new ListNode(0);
        ListNode start=low;
        ListNode high=new ListNode(0);
        ListNode mid=high;
        ListNode temp=head;
        while(temp!=null){
            if(temp.val<x){
                low.next=temp;
                temp=temp.next;
                low=low.next;
                low.next=null;
            }
            else{
                high.next=temp;
                temp=temp.next;
                high=high.next;
                high.next=null;
            }
        }
        low.next=mid.next;
        return start.next;
    }

}
