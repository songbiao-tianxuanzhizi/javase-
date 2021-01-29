import java.util.Arrays;

/**
 * 数组练习
 *
 * @author SongBiao
 * @date 2020/1/05
 */

public class ShuZu1 {
    /**
     *
     *数组转化为字符串的练习
     *
     */
    public static String myToString(int[] array) {
        if(array==null){
            return null;
        }
        String ret = "[";
        for(int i=0;i<array.length;i++){
            if(i==array.length-1){
                ret=ret+array[i]+"]";
            }
            else{
                ret=ret+array[i]+",";
            }
        }

        return ret;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        String str=myToString(arr);
        System.out.println(str);
    }
}
