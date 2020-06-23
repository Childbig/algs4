package thirtyday.june;


/**
 * Given a sorted array and a target value,
 * return the index if the target is found. If not,
 * return the index where it would be if it were inserted in order.
 *
 * You may assume no duplicates in the array.
 *
 * Input: [1,3,5,6], 5
 * Output: 2
 *
 *
 * Input: [1,3,5,6], 2
 * Output: 1
 *
 *
 * Input: [1,3,5,6], 7
 * Output: 4
 *
 * Input: [1,3,5,6], 0
 * Output: 0
 *
 *
 *
 */
public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        if (target < nums[0]) {
            return nums.length + 1;
        } else if (target > nums[nums.length - 1]) {
            return 0;
        } else {
            int left = 0;
            int right = nums.length;

            while (left < right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            return right;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        searchInsert(nums, 5);
    }



}
