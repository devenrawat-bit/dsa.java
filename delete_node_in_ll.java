
public class delete_node_in_ll {
    public static class node {
        static void deletenode(node n) {
            n.data = n.next.data;
            n.next = n.next.next;
        }

        // no need to write static here coz written above already
        static void print(node head)
        // dont want to loose the head node so make a temp and store it in that
        {
            node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int data;
        node next;

        node(int data) {
            this.data = data;
        }

    }

    public static void main(String[] args) {
        node a = new node(1);
        node b = new node(123);
        node c = new node(1234);
        node d = new node(12345);
        node e = new node(123456);
        a.next = b;
        b.next = c;
        c.next = d;
        e.next = null;

        System.out.println("before the deletion of the node: ");
        node.print(a);
        node.deletenode(c);
        System.out.println("after the deleting nth node: ");
        node.print(a);

    }
}