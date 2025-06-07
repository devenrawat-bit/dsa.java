public class CopyRandomList {
    public static void main(String[] args) {
        // Creating a sample list with random pointers
        Node n1 = new Node(7);
        Node n2 = new Node(13);
        Node n3 = new Node(11);
        Node n4 = new Node(10);
        Node n5 = new Node(1);

        n1.next = n2; n2.next = n3; n3.next = n4; n4.next = n5;
        n1.random = null;
        n2.random = n1;
        n3.random = n5;
        n4.random = n3;
        n5.random = n1;

        Solution1 sol = new Solution1();
        Node clone = sol.copyRandomList(n1);

        // Print copied list values and randoms
        Node temp = clone;
        while (temp != null) {
            System.out.print("Val: " + temp.val);
            System.out.print(", Random: " + (temp.random != null ? temp.random.val : "null") + "\n");
            temp = temp.next;
        }
    }
}

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
    }
}

class Solution1 {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        Node temp = head;
        while (temp != null) {
            Node newNode = new Node(temp.val);
            newNode.next = temp.next;
            temp.next = newNode;
            temp = newNode.next;
        }

        temp = head;
        while (temp != null) {
            if (temp.random != null) {
                temp.next.random = temp.random.next;
            }
            temp = temp.next.next;
        }

        temp = head;
        Node newHead = head.next;
        while (temp != null) {
            Node clone = temp.next;
            temp.next = clone.next;
            if (clone.next != null) {
                clone.next = clone.next.next;
            }
            temp = temp.next;
        }

        return newHead;
    }
}
