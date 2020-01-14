package practice.practice11;

import java.awt.*;
import java.util.Iterator;

/******************************************************************************
 *  Author:        Zhang Xuan
 *  Written:       2019/1/24
 *  Last updated:  2019/1/24
 *  Compilation:   javac RingBufferQueue.java
 *  Description:   环形链表实现queue
 *
 ******************************************************************************/


public class RingBufferQueue<Item> implements Iterable<Item> {

    private class Node {
        private Item item;
        private Node next;
    }

    private int N;
    private Node last;

    public int size() {
        return N;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public void enqueue(Item item) {
        Node oldlast=last;
        last=new Node();
        last.item=item;
        if (isEmpty()) {
            last.next = oldlast.next;
            oldlast.next = last;
        } else {
            last.next = last;
        }
        N++;
    }

    public Item dequeue() {
        Item item = last.next.item;
        last.next = last.next.next;
        N--;
        if(isEmpty()) last = null;
        return item;
    }



    @Override
    public Iterator<Item> iterator() {
        return new RingBufferQueueIteratanle();
    }

    private class RingBufferQueueIteratanle implements Iterator {
        private Node current=last.next;
        @Override
        public boolean hasNext(){return current!=last.next;}
        public void remove(){}
        @Override
        public Item next()
        {
            Item item=current.item;
            current=current.next;
            return item;
        }//end next
    }//end class ListIterator

    public static void main(String[] args) {
        RingBufferQueue<Integer> ringBufferQueue = new RingBufferQueue<>();

        ringBufferQueue.enqueue(1);
        ringBufferQueue.enqueue(2);
        ringBufferQueue.enqueue(3);
        ringBufferQueue.enqueue(4);
        ringBufferQueue.enqueue(5);
        ringBufferQueue.enqueue(6);
        ringBufferQueue.dequeue();
        ringBufferQueue.dequeue();
        ringBufferQueue.dequeue();
        ringBufferQueue.dequeue();
        ringBufferQueue.dequeue();
        ringBufferQueue.dequeue();
    }
}
