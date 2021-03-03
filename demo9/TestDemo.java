package com.bit.demo9;

/**
 * string01
 * @author SongBiao
 * @Date 2021/1/18
 */
public class TestDemo {
    public static void main(String[] args) {
        /*定义字符串常用的三种方式：*/
        //定义字符串方式1（也是三种方式中用的最多的）
        String str="abc";
        System.out.println(str);
        //定义字符串方式2
        String str1=new String("bcd");
        System.out.println(str1);
        //定义字符串方式3
        char[] value={'a','b','c','d','e'};
        String str3=new String(value);
        System.out.println(str3);

    }
}
