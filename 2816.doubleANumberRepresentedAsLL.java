/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode doubleIt(ListNode head) {
        int num = 0, len = 0;
        ListNode revHead = rev(head);
        ListNode curr = revHead, prev = null;
        int carry = 0, val = 0;
        while(curr != null){
            val = (curr.val * 2) + carry;
            carry = 0;
            if(val > 9){
                curr.val = val%10;
                val /= 10;
                carry = val;
            }
            else
                curr.val = val;
            prev = curr;
            curr = curr.next;
        }
        if(carry > 0){
            ListNode node = new ListNode(carry, curr);
            prev.next = node;
        }
        else
            prev.next = curr;
        return rev(revHead);        
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