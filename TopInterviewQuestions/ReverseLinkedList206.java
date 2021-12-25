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
    public ListNode reverseList(ListNode head) {
        ListNode right = head;
        ListNode left = null;
        /* ------This whole thing isn't required  think if it as left pointer is initialized to null
        if(head!= null && head.next != null){
            sec = head.next;
        }else{
            return head;
        }
         */
        ListNode temp = null;
        while(right != null){
            temp = right.next;
            right.next = left;
            left = right;
            right = temp;
        }
        return left;
    }
}