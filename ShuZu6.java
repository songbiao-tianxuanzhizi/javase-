import java.util.Arrays;

/**
 * 查找数组中指定元素(顺序查找)
 * 给定一个数组, 再给定一个元素, 找出该元素在数组中的位置.
 *
 * @author SongBiao
 * @Date 2021/1/06
 */
public class ShuZu6 {
    public static int findXiaBiao(int[] array, int num) {
        int xiaBiao = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                xiaBiao = i;
            }
        }
        return xiaBiao;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int n = findXiaBiao(arr, 6);
        System.out.println("6的下标为" + n);
    }
}
