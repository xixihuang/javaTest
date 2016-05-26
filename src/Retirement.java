import java.util.Scanner;

/**
 * This program demonstrates a <code>while</code> loop.
 * Created by huangxi on 2016/5/25.
 */
public class Retirement {
    public static void main(String[] args) {
        //read inputs.
        Scanner input = new Scanner(System.in);

        System.out.print("How much money do you need to retire? ");
        double goal = input.nextDouble();

        System.out.print("How much money will you contribute every year? ");
        double payment = input.nextDouble();

        System.out.print("Interest rate in %: ");
        double interestRate = input.nextDouble();

        double balance = 0;
        int years = 0;

        //update account balance while goal isn't reached
        while(balance < goal)
        {
            //add this year's payment and internet
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            years++;
        }

        System.out.println("You can retire in " + years + " years.");
    }
}
