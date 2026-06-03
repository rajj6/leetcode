public class Solution {
    public boolean hasCycle(ListNode head) {
        // Base case: An empty list or a single node without a loop cannot have a cycle
        if (head == null || head.next == null) {
            return false;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        // Loop runs as long as the fast pointer hasn't hit the end of the list
        while (fast != null && fast.next != null) {
            slow = slow.next;          // Moves 1 step
            fast = fast.next.next;     // Moves 2 steps
            
            // If they meet, a cycle exists
            if (slow == fast) {
                return true;
            }
        }
        
        // If the fast pointer reaches the end, there is no cycle
        return false;
    }
}