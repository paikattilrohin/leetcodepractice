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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode lastNode = head;
        for(int i = 0; i < n; i++ ){
            if(lastNode == null){
                return head;
            }
            else{
                lastNode = lastNode.next;
            }
        }
        ListNode previousNode = dummy;
        while(lastNode !=null){
            lastNode = lastNode.next;
            previousNode = previousNode.next;
        }
        previousNode.next = previousNode.next.next;
        return dummy.next;        
    }
}