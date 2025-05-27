import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;

        // Move fast n steps ahead
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }

        // Edge case: if we need to delete the head
        if (fast == null) {
            return head.next;
        }

        // Move both fast and slow
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Delete the nth node
        slow.next = slow.next.next;
        return head;
    }
}

public class delete_nth_node_from_last {
    // Utility to print the list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        printList(head);

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the node you want to delete from last: ");
        int a=sc.nextInt();

        Solution sol = new Solution();
        ListNode updatedHead = sol.removeNthFromEnd(head, a);

        System.out.println("List after deleting " + a + "th node from end:");
        printList(updatedHead);
        sc.close();
    }
}
