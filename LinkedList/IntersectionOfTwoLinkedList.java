// class Solution {
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         // Brute Force

//         ListNode temp = headA;
//         while (temp != null) {
//             if (findNode(temp, headB)) {
//                 return temp;
//             }
//             temp = temp.next;
//         }

//         return null; // as the question gurantees the linked lists intersect so no use of it just
//                      // return someting to satisy the function return type

//     }

//     public boolean findNode(ListNode node, ListNode headB) {

//         ListNode temp = headB;
//         while (temp != node && temp != null) {
//             temp = temp.next;
//         }

//         return temp == node;
//     }
// }

// // Time Complexity :- O(M) * O(N) --> for every node in linked list 1 we need to
// // traverse the whole second linked list
// // Space Complexity :- O(1) as no extra space is used

// ............................................ Optimized Solution ................................................
// Intution :- Imagine two person walking, if they both have to meet they must cover same distance.
class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;

        while(temp1 != temp2){
            temp1 = temp1 == null ? headB : temp1.next;
            temp2 = temp2 == null ? headA : temp2.next;
        }
        return temp1;
    }
}

// Time Complexity :- O(M + N) Both list are traverse simulataneously
// Space Complexity :- O(1) No extra space is used 


