import java.util.Scanner;

/**
 * This program demonstrates a <code>for</code> loop.
 * 求从K个数中取出n个数，中奖的几率是多少？
 * Created by huangxi on 2016/5/25.
 */
public class LotteryOdds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers do you need to draw? ");
        int k = in.nextInt();

        System.out.print("What's the highest number you can draw? ");
        int n = in.nextInt();

        int lotteryOdds = 1;
        for(int i = 1; i<=k; i++)
            lotteryOdds = lotteryOdds * (n - i + 1) / i;

        System.out.println("Your odds are 1 in " + lotteryOdds + " .Good Luck!");
    }
}
