import java.util.Arrays;

/**
 * 检查数组的有序性
 * 给定一个整型数组, 判断是否该数组是有序的(升序)
 *
 * @author SongBiao
 * @Date 2021/1/06
 */
public class ShuZu8 {
    public static boolean isSorted(int[] array) {
        //注意此处的i是小于数组的长度减1的，原因是若i此时等于数组的最后一个下标时，此时i+1会发生越界，从而导致异常
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 8, 3, 2};
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        //输出结果为false
        System.out.println(isSorted(arr));
        //输出结果为true
        System.out.println(isSorted(arr1));
    }
}
