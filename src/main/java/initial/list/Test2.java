package initial.list;

import java.util.HashMap;
import java.util.Map;

public class Test2 {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        Map<Integer, ListNode> map = new HashMap<>();
        ListNode tmp = head;
        int index = 1;
        while(tmp != null){
            map.put(index, tmp);
            index ++;
            tmp = tmp.next;
        }

        if (map.get(index - n).next == null){
            ListNode node = map.getOrDefault(index - n - 1, null);
            if (node == null){
                return null;
            }else{
                node.next = null;
            }
        }else{
            ListNode node = map.get(index - n);
            node.val = node.next.val;
            node.next = node.next.next;
        }
        return head;
    }


    // 快慢指针
    public ListNode $removeNthFromEnd(ListNode head, int n) {
        ListNode pre = new ListNode(-1);
        pre.next = head;
        ListNode start = pre;
        ListNode end = pre;
        while (n != 0) {
            start = start.next;
            n--;
        }
        while (start.next != null) {
            start = start.next;
            end = end.next;
        }
        end.next = end.next.next;
        return pre.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode tmp = head;
        for (int i = 1; i < 5; i ++){
            tmp.next = new ListNode(i+1);
            tmp = tmp.next;
        }
        head.print();
        removeNthFromEnd(head, 2).print();

    }
}
