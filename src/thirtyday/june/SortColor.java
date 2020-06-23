package thirtyday.june;


/**
 * Given an array with n objects colored red,
 * white or blue, sort them in-place so that objects
 * of the same color are adjacent, with the colors in the order red,
 * white and blue.
 *
 * Here, we will use the integers 0, 1, and 2 to represent the color red,
 * white, and blue respectively.
 *
 * Note: You are not suppose to use the library's
 * sort function for this problem.
 *
 *
 * Input: [2,0,2,1,1,0]
 * Output: [0,0,1,1,2,2]
 *
 *
 *Follow up:
 *
 * A rather straight forward solution is a two-pass algorithm using
 * counting sort.
 * First, iterate the array counting number of 0's, 1's, and 2's,
 * then overwrite array with total number of 0's,
 * then 1's and followed by 2's.
 * Could you come up with a one-pass algorithm using only constant space?
 *
 *
 *
 */
public class SortColor {

    public static void sortColors(int[] nums) {
        for (int i =0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    int tep = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tep;
                }
            }
        }
    }

    public void sortColorsWithDiv(int[] nums) {
        int front = 0;
        int mid = 0;
        int back = nums.length-1;

        while   (mid<=back) {
            if (nums[mid]==0) {
                swap(nums, front++, mid++);
            } else if (nums[mid]==1) {
                mid++;
            } else {
                swap(nums, mid, back--);
            }
        }
    }
     void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    public static void main(String[] args) {
        int[] nums = {2,0,2,1,10};
        sortColors(nums);

        for (int num : nums) {
            System.out.println(num);
        }

    }
}
