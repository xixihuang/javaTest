/**
 * Created by huangxi on 2016/5/24.
 */
public class finalTest {
    public static void main(String[] args) {
        final double CM_PER_INCH = 2.54;
        double x = 99.9;
        int mx = (int)x;
        int nx = (int)Math.round(x);  //round()表示四舍五入
        String greeting = "Hello";   //子串例子s = Hel
        String s = greeting.substring(0,3);
        greeting = greeting.substring(0,3) + "p!";
        System.out.println("mx = " + mx);
        System.out.println("nx = " + nx);
        System.out.println("s = " + s);
        System.out.println("greeting = " + greeting);
    }
}
