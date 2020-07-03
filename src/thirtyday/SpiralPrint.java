package thirtyday;

/**
 * @author ：zhangxuan
 * @date ：Created in 2020-07-01 19:37
 * @modified By：
 * @Description：
 */
public class SpiralPrint {


    /**
     * 螺旋打印
     * @param num
     */
    private static void SpiralPrint(int num) {
        int n = new Double(Math.sqrt(num)).intValue();
        n = n * n == num ? n : n + 1;


        int [][] listArray = new int[n][n];
        int count = 1;
        System.out.println("***********************************************");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n;j++) {
                if (count > num) {
                    listArray[i][j] = -1;
                } else {
                    listArray[i][j] = count++;
                }
            }
        }

        for (int i = n - 1; i >=0; i--) {
            for (int j = i; j >=0; j--) {
                if (listArray[i][j] < 0) {
                    System.out.print(".");
                } else {
                    System.out.print(listArray[i][j]);

                }
            }
            System.out.println("1");
        }
        System.out.println("***********************************************");

    }


    public static void main(String[] args) {
        SpiralPrint(43);
    }
}
