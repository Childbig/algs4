package section2;

import java.util.Iterator;

/*----------------------------------------------------------------
 *  Author:        Zhang Xuan
 *  Written:       2018/5/16
 *  Last updated:  2018/5/16
 *  Compilation:   javac LinkedStackOfStrings.java
 *  Execution:     java HelloWorld
 *  Description: 
 *
 *----------------------------------------------------------------*/
public class LinkedStackOfStrings<T> implements Iterable<T>{

    private Node first = null;

    @Override
    public Iterator<T> iterator() {
        return null;
    }


    private class ListIterator implements Iterator<T> {
        private Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            T t = (T) current.item;
            current = current.next;

            return t;
        }
    }


    private class Node<T> {
        T item;
        Node next;

        public boolean isEmpty() {
            return first == null;
        }

        public void push(T item) {
            Node oldfirst = first;
            first = new Node();
            first.item = item;
            first.next = oldfirst;
        }

        public T pop() {
            T item = (T)first.item;
            first = first.next;
            return item;
        }
    }
}
