package practice.practice11;
/*----------------------------------------------------------------
 *  Author:        Zhang Xuan
 *  Written:       18-12-26
 *  Last updated:  18-12-26
 *  Compilation:   javac LinkPratice13.java
 *  Execution:     java  LinkPratice13
 *  Description:
 *
 *----------------------------------------------------------------*/

public class LinkPratice13<Item> {

    private static Node first;
    static class Node<Item> {
        Item item;
        Node next;
    }

    /**
     * DELETE THE END OF LINK
     */
    private void deleteEndLink() {
        Node current = first;
        if (current == null) return;

        Node next = current.next;
        if (next == null)
            first = null;

        while (current.next != null)
            current = next;
            next = next.next;

        current.next = null;
    }

    /**
     * DELETE THE K ELEMENT
     * @param k
     */
    private void delete(int k) {
        if (k <= 0 && first == null) return;
        if (k == 1) {
            first = first.next;
            return;
        }
        k--;
        Node current = first;

        while (current != null && --k != 0) {
            current = current.next;
        }
        if (k != 0 || current == null || current.next == null) {
            return;
        } else {
            current.next = current.next.next;
        }
    }

    /**
     * find the Item in the Node if equal with item
     * @param source
     * @param item
     * @return
     */
    private boolean find(Node source, Item item) {
        while (source.next != null)
            if (source.item == item)
                return true;
            source = source.next;
        return false;
    }

    /**
     * delete element after link.
     * @param link
     */
    private void removeAfter(Node link) {
        if (link == null) return;
        Node current = first;
        while (current != null)
            if (current.item == link.item) current.next = null;
            current = current.next;
    }

    /**
     * insert node two after node one.
     * @param link
     * @param insert
     */
    private void insertAfter(Node link, Node insert) {
        if (link == null || insert == null) return;
        Node current = first;
        while (current != null)
            if (current.item == link.item) {
                current.next = insert;
                return;
            }
        current = current.next;
    }

    /**
     * delete all node that item equal key
     * @param link
     * @param key
     */
    private void remove(Node link, Item key) {
        if (link == null) return;

        Node current = link;
        if (current.item == key)
            current = current.next;

        while (current.next != null) {
            if (current.next.item == key) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    /**
     * 反转链表并且返回结果链表的首节点
     * @param x
     * @return
     */
    private Node reverseNode(Node x) {
        Node first = x;
        Node reverse = null;
        while (first != null) {
            Node second = first.next;
            first.next = reverse;
            reverse = first;
            first = second;
        }
        return reverse;
    }
    private Node recursionNode(Node x) {
        if (x == null) return null;
        if (x.next == null) return x;

        Node second = first.next;
        Node rest = recursionNode(second);
        second.next = first;
        first.next = null;
        return rest;

    }


    public static void main(String[] args) {
        Node<String> testNode = new Node();
        Node<String> testNode1 = new Node();
        Node<String> testNode2 = new Node();
        Node<String> testNode3 = new Node();
        Node<String> testNode4 = new Node();
        testNode.item = "A";
        testNode1.item = "B";
        testNode2.item = "C";
        testNode3.item = "D";
        testNode4.item = "E";
        testNode.next = testNode1;
        testNode1.next = testNode2;
        testNode2.next = testNode3;
        testNode3.next = testNode4;

        LinkPratice13 linkPratice13 = new LinkPratice13();
        linkPratice13.recursionNode(testNode);
      //  linkPratice13.recursionNode(testNode4);
    }





}
