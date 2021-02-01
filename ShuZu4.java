import java.util.Arrays;

/**
 * 找出数组中最大的元素
 *
 * @author SongBiao
 * @Date 2021/1/06
 */
public class ShuZu4 {
    public static int findMax(int[] array) {
        //假设数组第一个元素为最大值
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 10, 26, 2, 7, 9};
        System.out.println("最大数为" + findMax(arr));
    }
}
