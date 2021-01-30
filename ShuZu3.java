import java.util.Arrays;

/**
 * 自主实现数组的拷贝方法
 *
 * @author SongBiao
 * @Date 2021/1/06
 */
public class ShuZu3 {
    public static int[] kaoBei(int[] array) {
        int[] ret = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            ret[i] = array[i];
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] ret = kaoBei(array);
        System.out.println(Arrays.toString(ret));
    }
}
