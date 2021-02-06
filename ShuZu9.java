import java.util.Arrays;

/**
 * 给定一个数组, 将里面的元素逆序排列.
 * @author SongBiao
 * @Date 2021/1/06
 */
public class ShuZu9 {

    public static void reverse(int[] array) {
        //如果数组为空，则不发生就地逆置
        if(array == null) {
            return;
        }
        int i = 0;
        int j = array.length-1;
        while (i < j) {
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
            i++;
            j--;
        }
    }

    /**
     * 此方法并非就地逆置，而是将原数组进行拷贝逆置后赋给了ret进行输出的，并非是直接在arr上进行逆置操作
     * @param arr
     * @return
     */
    public static int[] reverse1(int[] arr) {
        int[] ret = Arrays.copyOf(arr, arr.length);
        int left = 0;
        int right = ret.length - 1;
        while (left <= right) {
            if (left == right) {
                break;
            } else {
                int temp = ret[left];
                ret[left] = ret[right];
                ret[right] = temp;
                left++;
                right--;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
