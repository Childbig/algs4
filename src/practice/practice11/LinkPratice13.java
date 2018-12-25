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

import com.sun.scenario.effect.impl.prism.PrImage;

public class LinkPratice13<Item> {

    private Node first;
    class Node {
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

        while (current.next != null) {
            if (current.next.item == key) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }





}
