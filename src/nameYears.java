/**
 * This program demonstrates console input.
 * 询问用户的姓名和年龄，然后打印出来。
 * Created by huangxi on 2016/5/25.
 */
import java.util.*;

public class nameYears {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);  //构造一个Scanner对象，并与“标准输入流”System.in关联，接受从控制台输入。
        //get first input - name.
        System.out.print("What's your name? ");
         /**
         * next()方法是不接收空格的，在接收到有效数据前，所有的空格或者tab键等输入被忽略，若有有效数据，则遇到这些键退出。
         * nextLine()可以接收空格或者tab键，其输入应该以enter键结束。
         * 当next()和nextLine()连用时，nextLine()会自动接收next()函数的结束符，所以为了避免数据接收有误，要避免二个函数连用。
         */
        //接受String型
        String name = in.nextLine(); //使用nextLine方法是因为在输入中有可能包含空格。
        //get second input - age
        System.out.print("How old are you? ");
        //接受int型
        int age = in.nextInt();  //什么类型next后面就接什么 注意大小写

        while (name.equals("exit")) {break;} //本句没有用。？？？？？？？？？？如果读取到exit，则退出输入

        //Display output on console
        System.out.println("Hello," + name + ".Next year, you'll be " + (age + 1));
    }
}
