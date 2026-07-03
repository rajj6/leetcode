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
    public void reorderList(ListNode head) {
        // return same for 0, 1, 2 size list
        if (head == null || head.next == null || head.next.next == null) return;
        ListNode slow = head, fast = head.next;

        // printList("head",head);
        
        // Find mid:
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        
        // slow points to mid

        ListNode temp = slow.next;
        slow.next = null;
        // printList("head",head);
        // printList("temp",temp);

        // reverse 2nd half

        ListNode prev = null, cur = temp;
        while (cur != null) {
            ListNode t = cur.next;
            cur.next = prev;
            prev = cur;
            cur = t;
        }
        // printList("prev",prev);
        
        // prev is 2nd half in reverse order
        
        // now we need to merge 2 list head and 
        ListNode p = head;
        while (prev != null) {
            ListNode n1 = p.next;
            ListNode n2 = prev.next;
            p.next = prev;
            prev.next = n1;
           
            p = n1;
            prev = n2;
            // printList("p",p);
            // printList("q",prev);
            // printList("head",head);
        }
    }

    void printList(String n, ListNode k) {
        ListNode p = k;
        System.out.print(n + ": ");
        while (p != null) {
            System.out.print(p.val + ",");
            p = p.next;
        }
        System.out.println();
    }
}