package fgo.saber.letcode;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
public class Solution_2 {

    public static void main(String[] args) {
        ListNode v1 = new ListNode();
        v1.val = 2;

        ListNode v2 = new ListNode();
        v2.val = 4;

        ListNode v3 = new ListNode();
        v3.val = 3;

        ListNode v4 = new ListNode();
        v4.val = 5;

        ListNode v5 = new ListNode();
        v5.val = 6;

        ListNode v6 = new ListNode();
        v6.val = 4;

        v1.next = v2;
        v2.next = v3;

        v4.next = v5;
//        v5.next = v6;


        System.out.println(addTwoNumbers(v1, v4));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int temp = 0;

        ListNode t1 = new ListNode(0);
        ListNode t11 = t1;
        while (l1 != null || l2 != null) {
            int v1 = l1 == null ? 0 : l1.val;
            int v2 = l2 == null ? 0 : l2.val;
            int sum =  v1 + v2 + t1.val;
            t1.val = sum % 10;
            temp = sum / 10;

            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;

            if (l1 != null || l2 != null || temp > 0) {
                t1.next = new ListNode(0);
                t1 = t1.next;
                t1.val = temp;
            }
        }

        return t11;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }

        public ListNode() {

        }
    }
}
