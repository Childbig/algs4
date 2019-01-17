package bookCode;

/******************************************************************************
 *  Author:        Zhang Xuan
 *  Written:       2019/1/17
 *  Last updated:  2019/1/17
 *  Compilation:   javac FixedCapacityStackOfStrings.java
 *  Description: 
 *
 ******************************************************************************/


public class FixedCapacityStackOfStrings {

    private String[] a;
    private int N;
    public FixedCapacityStackOfStrings(int cap) {
        a = new String[cap];
    }

    public void push(String item) {
        a[N++] = item;
    }
    public String pop() {
        return a[--N];
    }
    public boolean isEmpty() {
        return N == 0;
    }
    public int size () {
        return N;
    }

    public static void main(String[] args) {
        int N = 1;
        System.out.println(N++);
        System.out.println(--N);
    }

}
