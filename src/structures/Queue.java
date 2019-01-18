package structures;

import java.util.Iterator;

/******************************************************************************
 *  Author:        Zhang Xuan
 *  Written:       2019/1/18
 *  Last updated:  2019/1/18
 *  Compilation:   javac Queue.java
 *  Description: 
 *
 ******************************************************************************/


public class Queue<Item> implements Iterable<Item> {
    private Node first;
    private Node last;
    private int N;
    private class Node {
        Item item;
        Node next;
    }
    public int size() {
        return N;
    }
    public boolean isEmpty() {
        return N == 0;
    }
    public void enqueue(Item item) {
        Node oldfirst = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty())  first = last;
        else            oldfirst.next = last;

        N++;
    }
    public Item dequeue() {
        Item item = first.item;
        first = first.next;
        if (isEmpty())      last = null;
        N--;
        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        return new QueueIterator();
    }

    class QueueIterator implements Iterator<Item> {
        private Node current = first;
        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    public static void main(String[] args) {
        Queue<Integer> test = new Queue<>();
        test.enqueue(1);
        test.enqueue(2);
        test.enqueue(3);
        test.enqueue(4);
        test.enqueue(5);
        test.dequeue();
        test.dequeue();
    }
}
