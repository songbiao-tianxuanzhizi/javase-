import java.util.Arrays;

/**
 * 给定一个整型数组, 将所有的偶数放在前半部分, 将所有的奇数放在数组后半部分
 *
 * @author SongBiao
 * @Date 2021/1/06
 */
public class ShuZu10 {
    public static void transform(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        for (; i <arr.length ; i++) {
            for (; j>=i ; j--) {
                if(arr[i]%2==1){
                    int tmp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }

        }

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7,8,9};
        transform(arr);
        System.out.println(Arrays.toString(arr));
    }
}
