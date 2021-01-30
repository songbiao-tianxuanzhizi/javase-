import java.util.Arrays;

/**
 * 数组练习2：数组的拷贝
 *
 * @author SongBiao
 * @Date 2020/1/05
 */
public class ShuZu2 {
    public static void main(String[] args) {

        /*
        面试问题：这四种拷贝方法是深拷贝还是浅拷贝？
        答：这四种方法若是针对基本类型或者是简单类型为深拷贝，对于引用类型来说就是浅拷贝了
        深拷贝：
        浅拷贝：
        当拷贝结束后，通过一个引用修改所拷贝的新的对象的值时，并不影响原来的值，则此时便为深拷贝
        当拷贝结束后，此时两个引用指向了同一个数组对象，当通过其中一个引用去改变数组对象的某个值后，另一个引用在访问
        完数组对象后得到了另一个引用修改后的值，并非原来的值时，则此时便为浅拷贝
         */


        //数组的拷贝方法1：利用for循环来进行拷贝
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
        //输出结果为[1, 2, 3, 4, 5, 6]
        System.out.println(Arrays.toString(array));
        //输出结果为[1, 2, 3, 4, 5, 6]
        System.out.println(Arrays.toString(array2));


        //数组的拷贝方法2：利用copyof方法进行拷贝
        //定义一个数组array3
        int[] array3 = {1, 2, 3, 4, 5, 6};
        //copyOf方法是用来拷贝数组的一种方法，括号中放入的分别为引用和想要拷贝多长的数组的长度值
        int[] array4 = Arrays.copyOf(array3, 10);
        //输出结果为[1, 2, 3, 4, 5, 6]
        System.out.println(Arrays.toString(array3));
        //输出结果为[1, 2, 3, 4, 5, 6, 0, 0, 0, 0]
        System.out.println(Arrays.toString(array4));

        //copyOf方法的变形：copyOfRange()
        int[] ret = Arrays.copyOfRange(array3, 1, 5);
        int[] ret1 = Arrays.copyOfRange(array3, 1, 7);
        //输出结果为[2, 3, 4, 5]
        System.out.println(Arrays.toString(ret));
        //输出结果为[2, 3, 4, 5, 6, 0]
        System.out.println(Arrays.toString(ret1));


        //数组的拷贝方法3：利用arraycopy方法进行拷贝
        /*
         * 在这里思考一个问题：arraycopy方法和copyOf方法哪个拷贝速度更快呢？
         * 答：arraycopy方法会比较快，原因是当我们浏览arraycopy方法源码时会发现其被native所修饰，我们都知道
         native方法是由C/C++代码来实现的，我们是看不到具体实现的，而且被native所修饰的方法一般有个特点就是速度块
         所以arraycopy方法会速度更快些
         *同时在JVM中有一个本地方法栈，他的作用就是专门来运行底层由C/C++代码所实现的方法，也就是native方法
         */
        int[] array5 = {1, 2, 3, 4, 5, 6};
        int[] array6 = new int[array5.length];
        System.arraycopy(array5, 0, array6, 0, 6);
        //输出结果为[1, 2, 3, 4, 5, 6]
        System.out.println(Arrays.toString(array5));
        //输出结果为[1, 2, 3, 4, 5, 6]
        System.out.println(Arrays.toString(array6));


        //数组的拷贝方法4：利用clone方法进行拷贝
        int[] array7 = {1, 2, 3, 4, 5, 6};
        int[] array8 = array7.clone();
        //输出结果为[1, 2, 3, 4, 5, 6]
        System.out.println(Arrays.toString(array7));
        //输出结果为[1, 2, 3, 4, 5, 6]
        System.out.println(Arrays.toString(array8));


    }
}
