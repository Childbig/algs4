package thirtyday;

/**
 * @author ：zhangxuan
 * @date ：Created in 2020-05-13 17:32
 * @modified By：
 * @Description：
 * Given a non-empty, singly linked list with head node head, return a middle node of linked list.
 *
 * If there are two middle nodes, return the second middle node.
 *
 * Input: [1,2,3,4,5]
 * Output: Node 3 from this list (Serialization: [3,4,5])
 * The returned node has value 3.  (The judge's serialization of this node is [3,4,5]).
 * Note that we returned a ListNode object ans, such that:
 * ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, and ans.next.next.next = NULL.
 *
 * Input: [1,2,3,4,5,6]
 * Output: Node 4 from this list (Serialization: [4,5,6])
 * Since the list has two middle nodes with values 3 and 4, we return the second one.
 */
public class MiddleNode {

    public static ListNode middleNode(ListNode head) {
        ListNode countLengthNode = head;
        // 遍历node 找到中位
        int length = 0;
        while (countLengthNode != null) {
            length++;
            countLengthNode = countLengthNode.next;
        }


        int mid = Math.round(length/2) + 1;

        int count = 1;

        while (head != null) {
            if (count == mid){
                break;
            }
            head = head.next;
            count++;
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))));
       // ListNode listNode = new ListNode (1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        middleNode(listNode);
    }
}




class ListNode {
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
