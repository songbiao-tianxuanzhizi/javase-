import java.util.Arrays;

/**
 * 查找数组中指定元素(运用二分查找法)
 *
 * @author SongBiao
 * @Date 2021/1/06
 */
public class ShuZu7 {
    public static int binarySearch(int[] array, int num) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = (right + left) / 2;
            if (array[mid] == num) {
                return mid;
            } else if (array[mid] > num) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        //若没有找到，返回-1
        return -1;
    }

    public static void main(String[] args) {
        //使用二分查找的前提是数组是有序数组
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int num = binarySearch(arr, 7);
        //输出结果为：7的下标是6
        System.out.println("7的下标是" + num);

        int[] arr1 = {2, 4, 7, 3, 5, 8, 9};
        //此时arr1数组无序，我们需要将其变为有序后在使用二分查找法
        Arrays.sort(arr1);
        //排完序后arr1变为{2，3，4，5，7，8，9}
        int num1 = binarySearch(arr1, 3);
        //输出结果为：3的下标为1
        System.out.println("3的下标为" + num1);


        //同样的Arrays工具类提供了二分查找的方法，我们也可以直接调用即可
        int[] arr2 = {1, 2, 3, 4, 5, 6};
        //输出arr2数组中3数字对应的下标
        System.out.println(Arrays.binarySearch(arr2, 3));
    }
}
