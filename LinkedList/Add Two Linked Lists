
// ......................... better ...........................................

//     ListNode dummy = new ListNode();
//     ListNode tail = dummy;
//     addLinkedLists(l1, l2, tail, 0);
//     return dummy.next;

//     public ListNode addLinkedLists(ListNode l1, ListNode l2, ListNode tail, int carry){

//         if(l1 == null && l2 == null){
//             if(carry != 0){
//                 tail.next =  new ListNode(carry);
//             }

//             return null;
//         }

//         int val1 = l1 == null ? 0 : l1.data;
//         int val2 = l2 == null ? 0 : l2.data;

//         l1 = l1 == null ? l1 : l1.next;
//         l2 = l2 == null ? l2 : l2.next;

//         int sum = val1 + val2 + carry;
//         int digit = sum % 10;
//         carry = sum / 10;

//         ListNode newNode = new ListNode(digit);
//         tail.next = newNode;
//         return addLinkedLists(l1, l2, tail.next, carry);
//     }
// }
//         Time Complexity --> O(N) size of max list due to entire linkedlist traversal
//         Space Complexity --> O(M) due to recursion stack 

// ...................................................................................................
// Brute Force
// Store two numbers in the two diff arrayList and add digits from the last

// List<Integer> list1 = new ArrayList<>();
// List<Integer> list2 = new ArrayList<>();

// while(l1 != null && l2 != null){
//     list1.add(l1.data);
//     list2.add(l2.data);
//     l1 = l1.next;
//     l2 = l2.next;
// }

// while(l1 != null){
//     list1.add(l1.data);
//     list2.add(0);
//     l1 = l1.next;
// }

// while(l2 != null){
//     list2.add(l2.data);
//     list1.add(0);
//     l2 = l2.next;
// }

// ListNode head = new ListNode();
// ListNode tail = head;

// int i = 0;
// int j = 0;
// int carry = 0;
// while(i < list1.size()  && j < list2.size()){
//     int sum = list1.get(i) + list2.get(j) + carry;
//     // System.out.println(sum);
//     int digit = sum % 10;
//     carry = sum / 10;
//     tail = addNode(digit, tail);
//     i++;
//     j++;
// }

// while( i < list1.size()){
//     int sum = list1.get(i) + carry;
//     int digit = sum % 10;
//     carry = sum / 10;
//     tail = addNode(digit, tail);
//     i++;
// }

// while(j < list2.size()){
//     int sum = list2.get(j) + carry;
//     int digit = sum % 10;
//     carry = sum / 10;
//     tail = addNode(digit, tail);
//     j++;
// }

// if(carry != 0){
//     tail = addNode(carry, tail);
// }

// return head.next;

// public ListNode addNode(int sum, ListNode head){
//     ListNode node = new ListNode();
//     node.data = sum;
//     head.next = node;
//     return node;
// }

// Time Complexity -->  O(M + N) traverse the l1 and l2 completely
//  + 2 * O(N) --> traverse the arrayList for adding the numbers 
//  so overall tc is O(N)

// Space complexity - > 2 * O(N)  for storing the arraysList
// + O(M + N) for creating new linkedLists

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // YOUR CODE GOES HERE
        // ...................... optimal .................................

        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        int carry = 0;
        while (l1 != null && l2 != null) {
            int sum = l1.data + l2.data + carry;
            int digit = sum % 10;
            carry = sum / 10;
            ListNode newNode = new ListNode(digit);
            tail.next = newNode;
            tail = newNode;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null && carry != 0) {
            int sum = l1.data + carry;
            int digit = sum % 10;
            carry = sum / 10;
            ListNode newNode = new ListNode(digit);
            tail.next = newNode;
            tail = newNode;
            l1 = l1.next;
        }

        while (l2 != null && carry != 0) {
            int sum = l2.data + carry;
            int digit = sum % 10;
            carry = sum / 10;
            ListNode newNode = new ListNode(digit);
            tail.next = newNode;
            tail = newNode;
            l2 = l2.next;
        }

        if (carry != 0) {
            ListNode newNode = new ListNode(carry);
            System.out.println(tail);
            tail.next = newNode;
            tail = newNode;
        }

        tail.next = l1 == null ? l2 : l1;
        return dummy.next;
    }
}

// Time Complexity --> O(N) --> both lists are traversed simultanoeulsy
// Space Complexity --> O(N) --> at max we create the n new node where n is max
// of l1 and l2 length