package structures;

import edu.princeton.cs.algs4.Stopwatch;

/*----------------------------------------------------------------
 *  Author:        Zhang Xuan
 *  Written:       2018/5/8
 *  Last updated:  2018/5/8
 *  Compilation:   javac tree.java
 *  Execution:     java HelloWorld
 *  Description: 
 *
 *----------------------------------------------------------------*/
public class tree {

    private Node root;

    public void insert(int iData, double dData) {
        Stopwatch stopwatch = new Stopwatch();
        Node newNode = new Node();
        newNode.iData = iData;
        newNode.dDate = dData;
        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;

            while (true) {
                parent = current;

                if (iData < current.iData) {
                    current = current.leftNode;
                    if (current == null) parent.leftNode = newNode; return;
                } else {
                    current = current.rightNode;
                    if (current == null) {
                        parent.rightNode = newNode;
                        return;
                    }
                }
            }
        }

    }

    /**
     * 在tree上寻找关键词
     * @param key
     * @return 返回一个节点
     */
    public Node find(int key) {
        Node current = root;
        while (current.iData != key) {
            if (current.iData > key) {
                current = current.leftNode;
            } else {
                current = current.rightNode;
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }

    /**
     * 查看树中的最大值。
     * @return
     */
    public Node[] mVal() {
        Node minNode = null;
        Node maxNode = null;
        Node[] maxminVal = new Node[2];
        Node current=root;//从树的顶部开始搜索
        while(current != null)
        {
            minNode = current;
            current = current.leftNode;
        }
        maxminVal[0] = minNode;
        current = root;
        while(current != null)
        {
            maxNode = current;
            current = current.rightNode;
        }
        maxminVal[1] = maxNode;
        return maxminVal;
    }

    public static void main(String[] args) {
        tree tree1=new tree();
        tree1.insert(3, 3.666);
        tree1.insert(1, 1.111);
        tree1.insert(2, 2.362);
        tree1.insert(4, 4.672);
        tree1.insert(5, 5.865);
        tree1.insert(6, 6.681);
        Node node=tree1.find(6);
        if(node==null)
        {
            System.out.println("we can not find it");
        }else
        {
            node.showNode();
        }
        //查找tree中的最值
        Node[] temp=tree1.mVal();
        temp[0].showNode();
        temp[1].showNode();

    }

}




class Node {
    public int iData;
    public double dDate;
    public Node leftNode;
    public Node rightNode;

    public void showNode() {
        System.out.println("{ " + iData  + "," + dDate +" }");

    }
}
