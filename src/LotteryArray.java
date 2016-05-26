/**
 * Created by huangxi on 2016/5/26.
 */
public class LotteryArray {
    public static void main(String[] args) {
        final int AMAX = 10;

        // allocate triangular array
        // 分配一个具有所含行数的数组。第i行有i+1个元素。
        int[][] odds = new int[AMAX + 1][];
        // 分配这些行
        for (int n = 0; n <= AMAX; n++)
            odds[n] = new int[n + 1];

        //fill triangular array
        // 分配数组后，访问其中的元素。
        for (int n = 0; n < odds.length; n++)
            for (int k = 0; k < odds[n].length; k++){
                int lotteryOdds = 1;
                for (int i = 1;i <= k; i++)
                    lotteryOdds = lotteryOdds * (n - i + 1) / i;

                odds[n][k] = lotteryOdds;
            }
        //print triangular array
        for (int[] row : odds){
            for (int odd :row)
                System.out.printf("%4d",odd);
            System.out.println();
        }
    }
}
