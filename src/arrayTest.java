/**
 * Created by huangxi on 2016/5/25.
 */
public class arrayTest {
    public static void main(String[] args) {
        int[] a = new int[100];
        for (int i = 0; i < 100; i++) {
            a[i] = i;
            System.out.println("a[" + i + "] = " + i);
        }
    }
}
