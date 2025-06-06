public class OddEvenLinkedList {
    public static void main(String[] args) {
        // Sample Input: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3,
            new ListNode(4, new ListNode(5)))));

        Solution sol = new Solution();
        ListNode result = sol.oddEvenList(head);

        // Print Result
        printList(result);
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode odd = new ListNode(0);
        ListNode even = new ListNode(0);
        ListNode tempo = odd, tempe = even;
        ListNode temp = head;

        while (temp != null) {
            tempo.next = temp;
            temp = temp.next;
            tempo = tempo.next;

            if (temp == null)
                break;

            tempe.next = temp;
            temp = temp.next;
            tempe = tempe.next;
        }

        tempo.next = even.next;
        tempe.next = null;
        return odd.next;
    }
}
