package leetcode.aug;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：zhangxuan
 * @date ：Created in 2020-08-04 13:19
 * @modified By：
 * @Description：
 */
public class MyHashSet {

    List<Integer> node = null;
    int size = 0;
    /** Initialize your data structure here. */
    public MyHashSet() {
        node = new ArrayList<>();
    }

    public void add(int key) {
        if (!node.contains(key)) {
            node.add(key);
            size += 1;
        }
    }

    public void remove(int key) {
        if (node.contains(key)) {
            node.remove(node.indexOf(key));
            size -= 1;
        }
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return node.contains(key);
    }


    public static void main(String[] args) {
        MyHashSet hashSet = new MyHashSet();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.contains(1);    // returns true
        hashSet.contains(3);    // returns false (not found)
        hashSet.add(2);
        hashSet.contains(2);    // returns true
        hashSet.remove(2);
        hashSet.contains(2);    // returns false (already removed)
    }

}
