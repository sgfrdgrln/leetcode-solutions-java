import java.util.*;

// Add Two Numbers


public class AddTwoNumbersSolution {

    public static void main(String[] args) {
    // Create the first number as a linked list: e.g., 342 -> 3 -> 4 -> 2
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        // Create the second number as a linked list: e.g., 465 -> 4 -> 6 -> 5
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        // Add the two numbers
        ListNode result = new ListNode(0).addTwoNumbers(l1, l2);

        // Print the result
        printList(result);
        
    }
     // Helper method to print the linked list
     public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            node = node.next;
            if (node != null) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }

}
class ListNode {  
    int val;  
    ListNode next;  
    public ListNode(int val) {  
        this.val = val;  
    } 
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    
        ListNode result = new ListNode(0);
        ListNode pointer = result;

        int carry = 0;

        while(l1 != null || l2 != null) {

            int sum = 0 + carry;

            if(l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            sum = sum % 10;
            pointer.next = new ListNode(sum);
            pointer = pointer.next;
        }
        if(carry == 1) pointer.next = new ListNode(1);

        return result.next;
    } 
}  
