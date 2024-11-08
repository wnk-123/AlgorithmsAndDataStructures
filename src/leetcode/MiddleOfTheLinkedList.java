package leetcode;

public class MiddleOfTheLinkedList {
    public static void main(String[] args) {
        // Создаем односвязный список: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        MiddleOfTheLinkedList solution = new MiddleOfTheLinkedList();
        ListNode middle = solution.middleNode(head);

        // Выводим значение узла, который является серединой списка
        System.out.println(head);
        System.out.println("Middle node value: " + middle.val);
    }

    private static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
