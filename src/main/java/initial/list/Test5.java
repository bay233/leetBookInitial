package initial.list;

public class Test5 {

    public static boolean isPalindrome(ListNode head) {
        if (head == null){
            return true;
        }
        ListNode tmp = head;
        int value = tmp.val;
        ListNode pre = tmp;
        while(tmp.next != null){
            pre = tmp;
            tmp = tmp.next;
        }
        if(value != tmp.val){
            return false;
        }
        pre.next = null;
        return isPalindrome(head.next);
    }


    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        n1.next = new ListNode(2);
        n1.next.next = new ListNode(2);
        n1.next.next.next = new ListNode(1);

        System.out.println(isPalindrome(n1));
    }
}
