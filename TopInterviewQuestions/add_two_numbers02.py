# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        l1_p = l1
        l2_p = l2
        ans = ListNode(-1)
        ans_p = ans
        carry = 0

        while l1_p is not None and l2_p is not None:
            summ = (l1_p.val + l2_p.val + carry) % 10
            carry = (l1_p.val + l2_p.val + carry) // 10
            ans_p.next = ListNode(summ)
            ans_p = ans_p.next
            l1_p = l1_p.next
            l2_p = l2_p.next

        pointer = l2_p if l1_p is None else l1_p
        while pointer is not None:
            summ = (pointer.val + carry) % 10
            carry = (pointer.val + carry) // 10
            ans_p.next = ListNode(summ)
            ans_p = ans_p.next
            pointer = pointer.next

        if carry != 0:
            ans_p.next = ListNode(carry)
        return ans.next
