package Leetcode;

public class MergeTwoLists {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();

        while (list1.next != null && list2.next != null) {
            if (list1.value < list2.value) {
                result.value = list1.value;
                result.next = new ListNode(list2.value);
                list1 = list1.next;
                list2 = list2.next;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ListNode l6 = new ListNode(10);
        ListNode l5 = new ListNode(8, l6);
        ListNode l4 = new ListNode(6, l5);
        ListNode l3 = new ListNode(4, l4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(0, l2);

        ListNode k6 = new ListNode(11);
        ListNode k5 = new ListNode(9, k6);
        ListNode k4 = new ListNode(7, k5);
        ListNode k3 = new ListNode(5, k4);
        ListNode k2 = new ListNode(3, k3);
        ListNode k1 = new ListNode(1, k2);

        ListNode[] list1 = new ListNode[]{l1, l2, l3, l4, l5, l6};
        ListNode[] list2 = new ListNode[]{k1, k2, k3, k4, k5, k6};

        System.out.println(mergeTwoLists(l6, k6));

    }

    public static class ListNode {
        int value;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int value) {
            this.value = value;
        }

        public ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }
    }
}
