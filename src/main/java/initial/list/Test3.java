package initial.list;

public class Test3 {

    public static ListNode reverseList(ListNode head) {
        if (head == null){
            return null;
        }
        ListNode t = head;
        int len = 0;
        while (t != null) {
            len++;
            t = t.next;
        }
        t = head;
        ListNode[] arr = new ListNode[len];
        int i = 0;
        while (t != null) {
            arr[i] = t;
            i++;
            t = t.next;
        }
        for (i = i - 1; i > 0; i--) {
            arr[i].next = arr[i - 1];
        }
        arr[0].next = null;
        return arr[len - 1];
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode tmp = head;
        for (int i = 1; i < 5; i ++){
            tmp.next = new ListNode(i+1);
            tmp = tmp.next;
        }
        head.print();
        reverseList(null).print();
    }
}
