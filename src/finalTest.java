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
        boolean a = "Hello".equals(greeting);   //检测两个字符串是否相等
        boolean b = "Hello".equalsIgnoreCase("hello");   //检测两个字符串是否相等，而不区分大小写
        int n1 = greeting.length();  //length方法将返回采用UTF-16表示的给定字符串所需要的代码单元数量。
        int cpCount = greeting.codePointCount(0,n1);
        //s.charAt(n)方法将返回位置n的代码单元，n介于0 ~ s.length()-1 之间
        char first = greeting.charAt(0);
        char last = greeting.charAt(4);
        //遍历greeting字符串，依次得到第i个代码点
        for ( int i=0; i<=4; i++) {
            int index = greeting.offsetByCodePoints(0,i);
            System.out.println("greeting的第"+ i +"个代码点是： " + i);
        }
        int cp = greeting.codePointAt(4);  //?????????????????????????
        if(greeting != null && n1 != 0) {
            System.out.println("greeting的字符串长度为： " + n1);
        } else {
            System.out.println("greeting既不是null,也不是空字符串。");
        }
        System.out.println("mx = " + mx);
        System.out.println("nx = " + nx);
        System.out.println("s = " + s);
        System.out.println("greeting = " + greeting);
        System.out.println("'Hello'与greeting是否相等： " + a);
        System.out.println("'Hello'与'hello'是否相等： " + b);
        System.out.println("'greeting的实际长度，即代码点数量： " + cpCount);
        System.out.println("greeting的第一个字符是： " + first);
        System.out.println("greeting的最后一个字符是： " + last);
;
    }
}
