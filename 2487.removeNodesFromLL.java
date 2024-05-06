class Solution {
    public ListNode removeNodes(ListNode head) {
        ListNode curr = rev(head);
        ListNode dummyHead = new ListNode(-1);
        ListNode tempPrev = dummyHead;

        while (curr != null) {
            if (curr.val >= tempPrev.val) {
                tempPrev.next = curr;
                tempPrev = curr;
                curr = curr.next;
            } else {
                curr = curr.next;
            }
        }
        tempPrev.next = null;

        ListNode newCurr = dummyHead.next;
        
        return rev(newCurr);
    }

    public ListNode rev(ListNode head){
        ListNode curr = head, prev = null;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}