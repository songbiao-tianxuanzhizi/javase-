package com.bit.demo9;

import java.util.Arrays;

/**
 * @author SongBiao
 * @Date 2021/1/18
 */
public class TestMain {
    public static void main24(String[] args) {
        String str1="abcd";
        String str2="Abcd";
        //equals方法比较两个字符串的内容，但是区分大小写
        //false
        System.out.println(str1.equals(str2));
        //equalsIgnoreCase方法比较两个字符串的内容，但是不区分大小写
        //true
        System.out.println(str1.equalsIgnoreCase(str2));
        //使用comcompareTo
        System.out.println(str1.compareTo(str2));
    }

//.......................................................................................
    public static void main23(String[] args) {
        //将整个字节数组转变为字符串。
        byte[] bytes={97,98,99,100,101,102};
        String str=new String(bytes);
        System.out.println(str);

        //将部分字节数组内容变为字符串
        byte[] bytes1={97,98,99,100,101,102};
        String str2=new String(bytes1,1,3);
        //输出结果为bcd
        System.out.println(str2);

        //将字符串以字节数组的方式返回
        String string="abcde";
        byte[] bytes2=string.getBytes();
        //输出结果为[97, 98, 99, 100, 101]
        System.out.println(Arrays.toString(bytes2));
    }

    //。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。
    public static void main22(String[] args) {
        //字符数组转换为字符串输出，将字符数组所有内容变为字符串进行输出
        char[] value = {'a', 'b', 'c', 'd'};
        String str = new String(value);
        System.out.println(str);

        //将字符数组部分内容变为字符串进行输出
        char[] val = {'a', 'b', 'c', 'd'};
        //offet为偏移量，是计算从哪个下标开始，例如为1就是从第二个数组元素开始，count为往后要的个数
        //假如此时个数超过了数组元素或者offset超过了数组长度-1，那么会发生StringIndexOutOfBoundsException异常
        String str1 = new String(value, 1, 3);
        //输出结果为bcd
        System.out.println(str1);

        //按照下标索引从0开始来提取字符串某个对应位置的字符
        String str2 = "hello";
        //提取字符串中下标为2处所对应的字符
        char ch = str2.charAt(2);
        //输出结果为l
        System.out.println(ch);

        //利用toCharArray()方法将一个字符串转化为字符数组并输出
        String str4 = "hello";
        char[] ch1 = str4.toCharArray();
        //输出结果为[h, e, l, l, o]
        System.out.println(Arrays.toString(ch1));


    }

    //。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。

    public static String verse(String s) {
        char[] value = s.toCharArray();
        int i = 0;
        int j = value.length - 1;
        while (i < j) {
            char tmp = value[i];
            value[i] = value[j];
            value[j] = tmp;
            i++;
            j--;
        }
        //字符数组转为字符串的三种方法
        //第一种：return String.valueOf(value);
        //第二种：return String.copyValueOf(value);
        //第三种如下
        return new String(value);
    }

    public static void main18(String[] args) {
        //字符串的逆置
        String str = "hello";
        String str1 = verse(str);
        System.out.println(str1);
    }
    //。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。

    public static void main56(String[] args) {
        String str1 = "hello";
        String str2="world";
        //st1是变量，变量在程序运行时才知道里面存储的内容
        String str3 = str1 + "world";
        //两个字符串常量相加在编译时期就已经确定了，所以等价为helloworld
        String str4 = "hello" + "world";
        String str5 = "helloworld";
        String str6=str1+str2;
        //false
        System.out.println(str3 == str5);
        //true
        System.out.println(str4 == str5);
        //false
        System.out.println(str5==str6);
    }

    //。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。
    public static void main6(String[] args) {
        String str1 = "hello";
        /*intern被称为手动插入，即检查当前常量池中是否有hello这个字符串常量
        如果有，便将常量池当中的引用返回给当前的引用
         */
        String str2 = new String("hello").intern();
        System.out.println(str1 == str2);
    }

    //。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。
    public static void main5(String[] args) {
        //equals需要注意的事项：
        String str1 = null;
        String str2 = "hello";
        //false
        System.out.println(str1 == str2);
        //因为此时我们用了一个空引用调用了equals方法，那么便会发生空指针异常
        System.out.println(str1.equals(str2));
        //下面的输出结果变为了false，从此处说明了一个问题就是我们在使用equals方法时最好使用上面这个方法
        //因为如果str1此时为空的话，下面的代码是检查不出来问题的，其最终果为false
        System.out.println(str2.equals(str1));

    }

    //。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。
    public static void main4(String[] args) {
        String str1 = "hello";
        String str2 = "hel" + "lo";//字符串常量在编译时就已经完成了字符串的拼接，所以此处等价于 String str2= "hello";
        //此处比较的是字符串的地址是否相同.
        System.out.println(str1 == str2);//true，
        //此处比较的是字符串内所存的内容是否相同，便可以用equals
        System.out.println(str1.equals(str2));//true
    }
    //。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。

    public static void main15(String args[]) {
        String str1 = "Hello";
        String str2 = str1;
        str1 = "hello";
        System.out.println(str2);
        System.out.println(str1);
    }
    //。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。

    public static void main21(String args[]) {
        String str1 = "Hello";
        //str2指向了str1指向的对象
        String str2 = str1;
        System.out.println(str1);
        System.out.println(str2);
        //true
        System.out.println(str2 == str1);
    }
    //。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。

    public static void main3(String[] args) {
        String str1 = "hello";
        String str2 = str1;
        System.out.println(str1);
        System.out.println(str2);
        str1 = "abc";
        System.out.println(str1);
        System.out.println(str2);
    }
    //。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。

    public static void main19(String[] args) {
        String str1 = "hello";
        String str2 = "hel" + "lo";//字符串常量在编译时就已经完成了字符串的拼接，所以此处等价于 String str2= "hello";
        String str3 = new String("hel") + "lo";
        String str4 = new String("hel") + new String("lo");
        /*
        final int a = 10;
        同样的，常量在编译时就已经完成了算数运算，所以此处等价于int c = 40;
        int c = a+30;
        */
        //true
        System.out.println(str1 == str2);
        //false
        System.out.println(str3 == str1);
        //false
        System.out.println(str1 == str4);
        //false
        System.out.println(str3 == str4);
    }
    //。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。

    public static void main1(String[] args) {
        String str1 = "abc";
        String str2 = new String("abc");
        System.out.println(str1 == str2);//false
        String str3 = "abc";
        System.out.println(str1 == str3);//tru
    }
}
