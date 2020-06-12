package thirtyday.june;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author ：zhangxuan
 * @date ：Created in 2020-06-12 10:27
 * @modified By：
 * @Description：
 *
 *
 * Suppose you have a random list of people standing in a queue.
 * Each person is described by a pair of integers (h, k),
 * where h is the height of the person and k is the number of people in front of this person
 * who have a height greater than or equal to h. Write an algorithm to reconstruct the queue.
 *
 * Input:
 * [[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]
 *
 * Output:
 * [[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]
 *
 * hint:
 * What can you say about the position of the shortest person?
 * If the position of the shortest person is i,
 * how many people would be in front of the shortest person?
 *
 * hint:
 *Once you fix the position of the shortest person,
 *  what can you say about the position of the second shortest person?
 */
public class QueueReconstructionByHeight {

    public static int[][] reconstructQueue(int[][] people) {
        // 按照身高从高到底 位置从低到高
        Arrays.sort(people, (a, b) -> (a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]));

        List<int[]> list = new ArrayList<>();

        for (int[] p : people) {
            list.add(p[1], p);
        }

        return list.toArray(new int[people.length][]);
    }


    public static void main(String[] args) {
        int[][] people = {{7,0},{4,4},{7,1},{5, 0},{6,1},{5, 2}};
        int[][] result = reconstructQueue(people);
        System.out.println(1);
    }

}
