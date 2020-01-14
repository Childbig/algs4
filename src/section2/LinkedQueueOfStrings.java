package section2;

/*----------------------------------------------------------------
 *  Author:        Zhang Xuan
 *  Written:       2018/5/16
 *  Last updated:  2018/5/16
 *  Compilation:   javac LinkedQueueOfStrings.java
 *  Execution:     java HelloWorld
 *  Description: 
 *
 *----------------------------------------------------------------*/
public class LinkedQueueOfStrings {

    private Node first, last;


    private class Node<T> {
        T item;
        Node next;

        public boolean isEmpty() {
            return first == null;
        }

        public void enqueue(T item) {
            Node oldLast = last;
            last = new Node();

            last.item = item;
            last.next = null;

            if (isEmpty()) first = last;
            else  oldLast.next = last;

        }

        public T dequeue() {
            T item = (T)first.item;
            first = first.next;
            if (isEmpty()) last = null;
            return item;
        }
    }
}
