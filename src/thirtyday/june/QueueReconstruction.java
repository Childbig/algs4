package thirtyday.june;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Suppose you have a random list of people standing in a queue.
 * Each person is described by a pair of integers (h, k),
 * where h is the height of the person and k is the number of people in front of this person
 * who have a height greater than or equal to h.
 * Write an algorithm to reconstruct the queue.
 *
 * Input:
 * [[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]
 *
 * Output:
 * [[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]
 *
 */
public class QueueReconstruction {

    /**
     * pick up the tallest guy first
     * when insert the next tall guy, just need to insert him into kth position
     * repeat until all people are inserted into list
     * @param people
     * @return
     */
    public int[][] reconstructQueue(int[][] people) {
        // sort array
        Arrays.sort(people, (a, b) -> a[0] != b[0] ? b[0] - a[0] : a[0] - b[0]);

        List<int[]> res = new LinkedList<>();

        for (int[] cur : people) {
            res.add(cur[1], cur);
        }

        return res.toArray(new int[people.length][]);
    }


    




}
