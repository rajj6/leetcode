/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode s = head;
        ListNode f = head;
        while (true) {
            // if(s == f) return true;
            s = s.next;
            if(f != null) f = f.next;
            if(f != null) f = f.next;
            if(s == f) return true;
            if (s == null || f == null) return false;
        }
    
    }
}