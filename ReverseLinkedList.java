/*Definition of singly linked list:
// class ListNode {
//     int val;
//     ListNode next;

//     ListNode() {
//         val = 0;
//         next = null;
//     }

//     ListNode(int data1) {
//         val = data1;
//         next = null;
//     }
//     ListNode(int data1, ListNode next1) {
//         val = data1;
//         next = next1;
//     }
}
 */

class Solution {
    public ListNode reverseList(ListNode head) {

//   .............................................      brute force     .................................................
       // /* store the list in the arraylist and change the value of the nodes while
        // traversing from the back of the array

        // List<Integer> nodeValueList = new ArrayList<>();
        // ListNode tempHead = head;

        // while(tempHead != null){

        // nodeValueList.add(tempHead.val);
        // tempHead = tempHead.next;

        // }

        // now traverse from the back of the list and change the value of list form the
        // starting

        // int idx = nodeValueList.size() - 1;
        // tempHead = head;

        // while(tempHead != null){
        // tempHead.val = nodeValueList.get(idx);
        // idx--;
        // tempHead = tempHead.next;
        // }

        // return head;

        // TC --> 2 * O(N) == O(N) as we traversed the list 2 times
        // SC --> O(N) as we stored the values of linked list in another list
       
    ......................................... optimization .........................................
		
        // we have to traverse the whole linkedlist to get the all values but we can
        // optimize space form O(N) to O(1)
        //  example --
        // 1 -> 2 -> 3 -> 4 -> 5
        // 1 <- 2 <- 3 <- 4 <- 5

        // observation just need to reverse the arrow and we are done

        ListNode prev = null;
        ListNode curr = head;
        ListNode ahead = head.next;
		if(head == null){
			return null;
		}
        while (ahead != null) {
            curr.next = prev;
            prev = curr;
            curr = ahead;
            ahead = curr.next;

        }
        curr.next = prev;
        return curr;
        // TC -> O(N) --> traversed the list only once
        // SC -> O(1) -->no extra space is used other than some constant variables so
        // overall reduced complexity is O(1)
    }

}
