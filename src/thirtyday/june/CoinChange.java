package thirtyday.june;

/**
 * @author ：zhangxuan
 * @date ：Created in 2020-06-12 10:30
 * @modified By：
 * @Description：
 *
 * You are given coins of different denominations and a total amount of money.
 * Write a function to compute the number of combinations that make up that amount.
 * You may assume that you have infinite number of each kind of coin.
 *
 * Input: amount = 5, coins = [1, 2, 5]
 * Output: 4
 * Explanation: there are four ways to make up the amount:
 * 5=5
 * 5=2+2+1
 * 5=2+1+1+1
 * 5=1+1+1+1+1
 *
 *
 * Input: amount = 3, coins = [2]
 * Output: 0
 * Explanation: the amount of 3 cannot be made up just with coins of 2.
 *
 * Input: amount = 10, coins = [10]
 * Output: 1
 *
 */
public class CoinChange {

    public static int change(int amount, int[] coins) {
        if(amount<1) return 0;
        return helper(coins, amount, new int[amount]);
    }

    public static int coinChange(int[] coins, int amount) {
        if (coins == null || coins.length == 0) {
            return amount == 0? 1: 0;
        }
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int i = 0; i < coins.length; i ++) {
            for (int j = 1; j <= amount; j ++) {
                if (j >= coins[i]) {
                    dp[j] += dp[j - coins[i]];
                }
            }
        }
        return dp[amount];
    }


    /**
     * The idea is very classic dynamic programming: think of the last step we take.
     * Suppose we have already found out the best way to sum up to amount a,
     * then for the last step, we can choose any coin type which gives us a remainder r where r = a-coins[i] for all i's.
     * For every remainder, go through exactly the same process as before until either the remainder is 0 or less than 0
     * (meaning not a valid solution). With this idea, the only remaining detail is to store
     * the minimum number of coins needed to sum up to r so that we don't need to recompute it over and over again.
     * @param coins
     * @param rem
     * @param count
     * @return
     */
    private static int helper(int[] coins, int rem, int[] count) { // rem: remaining coins after the last step; count[rem]: minimum number of coins to sum up to rem
        if(rem<0) return -1; // not valid
        if(rem==0) return 0; // completed
        if(count[rem-1] != 0) return count[rem-1]; // already computed, so reuse
        int min = Integer.MAX_VALUE;
        for(int coin : coins) {
            int res = helper(coins, rem-coin, count);
            if(res>=0 && res < min)
                min = 1+res;
        }
        count[rem-1] = (min==Integer.MAX_VALUE) ? -1 : min;
        return count[rem-1];
    }


    public static void main(String[] args) {
        int[] coins = {1, 2, 5};

        int count = change(11, coins);
        int countcoinChange = coinChange(coins, 5);

        System.out.println(count);
    }




}
