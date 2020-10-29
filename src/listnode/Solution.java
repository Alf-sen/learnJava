package listnode;

/**
 * @auther ZhangXiusen
 * @date 2020/10/17 21:59
 */
public class Solution {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(0);
        ListNode listNode2 = new ListNode(0);
        listNode.next = listNode2;
        System.out.println(isPalindrome(listNode));

    }

    public static boolean isPalindrome(ListNode head) {
        if(head == null) {
            return true;
        }
        ListNode first = head;
        ListNode second = head;
        while (first.next != null && first.next.next != null) {
            first = first.next.next;
            second = second.next;
        }


        ListNode cur = second;
        ListNode newNode = null;

        while(cur != null) {
            ListNode temp = cur.next;
            cur.next = newNode;
            newNode = cur;
            cur = temp;
        }
        while (newNode != null) {
            System.out.println(newNode.val);
            newNode = newNode.next;
        }
        while(newNode != null) {
            if(newNode.val != head.val) {
                return false;
            }
            newNode = newNode.next;
            head = head.next;
        }
        return true;
    }
}
