import java.util.Arrays;

/**
 * Created by huangxi on 2016/5/26.
 */
public class twoDimensionalArray {
    public static void main(String[] args) {
        int[][] magicSquare =
                {
                        {1,9,0,4},
                        {3,6,4,1},
                        {7,4,3,2}
                };
        //Array.deepToString方法主要用于多位数组，会将内嵌数组的内容也打印出来,不管数组内嵌多少层,都会循环递归到最内层的数据
        System.out.println("二维数组为： " + Arrays.deepToString(magicSquare));
        System.out.println("二维数组为： " + Arrays.toString(magicSquare));

    }
}
