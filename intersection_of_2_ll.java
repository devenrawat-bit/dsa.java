public class intersection_of_2_ll {

    public static class ListNode2 {
        int val;
        ListNode2 next;

        ListNode2(int x) {
            val = x;
            next = null;
        }
    }

    public static ListNode2 getIntersectionNode(ListNode2 headA, ListNode2 headB) {
        ListNode2 tempa = headA;
        ListNode2 tempb = headB;
        int counta = 0, countb = 0;

        while (tempa != null) {
            counta++;
            tempa = tempa.next;
        }
        while (tempb != null) {
            countb++;
            tempb = tempb.next;
        }

        tempa = headA;
        tempb = headB;

        if (counta > countb) {
            int steps = counta - countb;
            for (int i = 0; i < steps; i++) tempa = tempa.next;
        } else {
            int steps = countb - counta;
            for (int i = 0; i < steps; i++) tempb = tempb.next;
        }

        while (tempa != tempb) {
            tempa = tempa.next;
            tempb = tempb.next;
        }

        return tempa;
    }

    public static void main(String[] args) {
        // Common part
        ListNode2 common = new ListNode2(8);
        common.next = new ListNode2(10);

        // First list: 3 -> 7 -> 8 -> 10
        ListNode2 headA = new ListNode2(3);
        headA.next = new ListNode2(7);
        headA.next.next = common;

        // Second list: 99 -> 1 -> 8 -> 10
        ListNode2 headB = new ListNode2(99);
        headB.next = new ListNode2(1);
        headB.next.next = common;

        ListNode2 result = getIntersectionNode(headA, headB);

        if (result != null)
            System.out.println("Intersection at node with value: " + result.val);
        else
            System.out.println("No intersection found.");
    }
}
