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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode left = head, right = head;
        for(int i=1; i<k; i++){
            left = left.next;
        }
        ListNode curr = left;
        while(curr.next!=null){
            right = right.next;
            curr = curr.next;
        }
        int temp = left.val;
        left.val = right.val;
        right.val = temp;

        return head;
    }
}