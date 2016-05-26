import java.util.Scanner;

/**
 * 运行斯坦福大学公开课：编程方法学中“第5课-变量”中两个参数相加的例子。
 * Created by huangxi on 2016/5/26.
 */
public class Add2Integers {
    public static void main(String[] args) {
        System.out.println("This program adds two numbers.");
        Scanner input = new Scanner(System.in);
        System.out.print("Please input the first number: ");
        int n1 = input.nextInt();
        System.out.print("Please input the second number: ");
        int n2 = input.nextInt();
       int total = n1 + n2;
        System.out.println("The total of n1 and n2 is " + total + ".");

    }
}
