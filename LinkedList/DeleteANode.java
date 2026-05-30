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
}