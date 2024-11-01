import helpers.SinglyLinkedList;
import helpers.Node;

public class FastAndSlowPointer {

    //leetcode 141
    public static boolean hasCycle(SinglyLinkedList ll) {
        Node head = ll.head;

        if (head == null || head.next == null) return false;

        Node slow = head;
        Node fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) return false;
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    //leetcode 876
    public static Node midOfTheList(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            if (fast == null) break;
            slow = slow.next;
        }
        return slow;
    }

    public static boolean isItAPalindrome(SinglyLinkedList ll) {
        Node head = ll.head;

        if (head == null || head.next == null) return true;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow = reverse(slow);
        fast = head;
        while (slow != null) {
            if (fast.val != slow.val) return false;
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }

    public static Node reverse(Node head) {
        Node prev = null;
        Node next = null;

        while (head != null) {
            next = head.next;   //define what's next
            head.next = prev;   //change current's direction
            prev = head;        //change prev to be ready for the next round
            head = next;        //change current to be ready for the next round
        }
        return prev;
    }


    //leetcode 202
    public static boolean happyNumber() {

        return true;

    }


    //leetcode 457

}
