package Problem1480;

import java.util.ArrayList;
import java.util.List;

public class Solution876 {

    static class Solution {
        public ListNode middleNode(ListNode head) {
            List<ListNode> array = new ArrayList<>();
            int length = 0;
            while (head.next != null) {
                array.add(head);
                length++;
                head = head.next;
            }
            return array.get(length / 2);
        }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }



    }

}
