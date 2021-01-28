import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: SongBiao
 * Date: 2021-1-04
 * Time: 19:44
 */
public class ShuZu {
    public static void print(int[] arr) {
        arr[2] = arr[2] * 2;
    }



    //java可以返回数组,但c不行
    public static int[] print1() {
        //写法1
        int[] ret = {1, 2, 3, 4, 5, 6};
        return ret;
        //写法2
        /* return new int[]{1,2,3,4,5,6};*/

    }

    //写一个方法，将数组中的每一个元素扩大2倍(改变原数组)
    public static int[] print2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }
        return arr;
    }

    //写一个方法，将数组中的每一个元素扩大2倍（不破坏原数组)
    public static int[] print3(int[] arr) {
        int[] ret = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ret[i] = arr[i] * 2;
        }
        return ret;
    }


    public static void main(String[] args) {
        //数组定义且初始化，此处为静态初始化
        int[] arr = {1, 2, 3, 4, 5, 6};
        //定义了数组，但没有初始化，默认值为0
        int[] arr1 = new int[6];
        //定义数组且初始化，此处为动态初始化
        int[] arr2 = new int[]{1, 2, 3, 4, 5, 6};




        //遍历输出数组
        //方法1：利用循环遍历输出数组，此方法可以获取数组下标值
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");//输出结果为1 2 3 4 5 6

        //方法2：利用foreach循环进行遍历输出数组，此方法只能获得数组中的值
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println("\n");
        //输出结果为1 2 3 4 5 6

        //方法3：利用Array工具类的toString方法进行遍历输出数组，但是toString方法只能遍历输出一维数组，toString方法的返回值为String
        //Array工具类是专门用来操作数组的工具类
        //将数组转化成字符串进行输出
        String str = Arrays.toString(arr);
        System.out.print(str + " ");
        //输出结果为[1, 2, 3, 4, 5, 6]

        //java中的数组越界,此时会抛出数组越界异常(截图)
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7};
        //System.out.println(arr3[7]);//数组越界异常

        //整数中的零值为0，而当我们定义了一个引用arr4，但并不知道其指向谁的时候，那么可以给这个引用赋一个null值
        int[] arr4 = {1, 2, 3, 4};
        arr4 = null;//arr4这个引用此时不指向任何一个对象,
        /*此时思考一个问题：当arr4不指向任何对象时，原来的数组对象去了哪里？
        答：当arr4等于null时，此时原来的数组对象被jvm中的垃圾回收器回收了
        总结：当一个对象不再被任何引用所引用的时候，此时会被垃圾回收器回收掉*/
        //System.out.println(arr4[2]);//此时会抛出一个空指针异常
        //System.out.println(arr4.length);//此时会抛出一个空指针异常(注意当抛出空指针异常时要检查此时引用是否为null)

        //数组中方法的调用，注意当两个引用指向相同的对象时，不管你通过哪个引用修改对象的值，另一个引用去访问的时候，都会受到影响
        int[] arr5 = {1, 2, 3, 4, 5, 6};
        print(arr5);
        System.out.println("\n");
        System.out.println(arr5[2]);//输出结果为6

        //对返回值为数组的方法的调用
        int[] arr6 = print1();
        String str1 = Arrays.toString(arr6);
        System.out.println(str1);//输出结果为[1, 2, 3, 4, 5, 6]



        int[] arr7 = {1, 2, 3, 4};
        int[] arr8 = arr7;//此处不能理解成为引用指向引用，因为引用是不能指向引用的，正确理解为arr8这个引用指向了arr7这个引用所指向的数组对象
        String str2 = Arrays.toString(arr8);
        System.out.println(str2);//输出结果为[1, 2, 3, 4]

        //一个引用只能同时指向一个对象
        //例如下面的代码此时arr9表面上看起来指向三个数组对象，实际上只能指向一个为{11，12，3，4，5}
        int[] arr9 = {1, 2, 3, 4, 5, 6, 7};
        arr9 = new int[]{3, 4, 5, 6};
        arr9 = new int[]{11, 12, 3, 4, 5};
        String str3 = Arrays.toString(arr9);
        System.out.println(str3);//输出结果为[11, 12, 3, 4, 5]


        //写一个方法，将数组中的每一个元素扩大2倍
        int[] arr10 = {1, 2, 3, 4, 5, 6};
        int[] arr11 = {1, 2, 3, 4, 5, 6};
        int[] arr12 = print2(arr10);
        int[] arr13 = print3(arr11);
        //输出结果为[2, 4, 6, 8, 10, 12]
        System.out.println(Arrays.toString(arr12));
        //输出结果为[2, 4, 6, 8, 10, 12]
        System.out.println(Arrays.toString(arr13));
    }
}
