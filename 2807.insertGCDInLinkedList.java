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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head == null || head.next == null)
            return head;
        int len = 0;
        ListNode temp = head;
        temp = head;
        while(temp.next != null){
            int hcf = gcd(temp.val, temp.next.val);
            ListNode newNode = new ListNode(hcf);
            ListNode ref = temp.next;
            temp.next = newNode;
            newNode.next = ref;
            temp = temp.next.next;
        }
        return head;
    }

     public int gcd(int a, int b){
        if(b==0) return a;
        else return gcd(b,a%b);
    }
}