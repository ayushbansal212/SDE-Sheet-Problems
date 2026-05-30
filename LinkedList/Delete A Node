import java.sql.Time;

class Solution {
    public void deleteNode(ListNode node) {
        // Your code goes here

        ListNode currNode = node;
        ListNode nextNode = node.next;
        currNode.val = nextNode.val;
        currNode.next = nextNode.next;
        nextNode.next = null;

        return;
        
    }

    // Time Complexity --> O(1) as we are only changing the value of the current node and changing the next pointer to skip the next node.
    // Space Complexity --> O(1) as we are not using any extra space to store the nodes.
}