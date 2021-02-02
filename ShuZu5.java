import java.util.Arrays;

/**
 * 求数组中元素的平均值
 *
 * @author SongBiao
 * @Date 2021/1/06
 */
public class ShuZu5 {
    public static double pingJunZhi(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        //此时注意强制类型转换
        double avg = sum / (double) array.length;
        return avg;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        double avg = pingJunZhi(arr);
        System.out.println("平均值为" + avg);
    }
}
