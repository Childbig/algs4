package practice.practice11;

import java.util.Iterator;

/******************************************************************************
 *  Author:        Zhang Xuan
 *  Written:       2019/1/25
 *  Last updated:  2019/1/25
 *  Compilation:   javac DoubleNode.java
 *  Description: 
 *
 ******************************************************************************/


public class DoubleNode<Item> implements Iterable<Item> {

    private int N = 0;
    private Node first;
    private Node last;
    class Node {
        Node prew;
        Node next;
        Item item;
    }

    private void insertFirst(Item item) {
        Node oldFirst = first;

    }
    private void insertLast(Item item) {

    }
    private void deleteFirst(Item item) {

    }
    private void deleteLast(Item item) {

    }
    private void deleteBeforeNode(Item item) {

    }
    private void deleteAfterNode(Item item) {

    }

    @Override
    public Iterator<Item> iterator() {
        return new DoubleNodeIterator();
    }

    private class DoubleNodeIterator implements Iterator {
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Object next() {
            return null;
        }
    }
}
