//自己创建的包
package com.bit.demo;

/*
//导入util下的Arrays包
import java.util.Arrays;
//导入util下的Date包
import java.util.Date;*/
//导入util下的所有的包

import java.util.Arrays;

//导入sql下的所有的包

/**
 * 类和对象
 * 导包
 *
 * @author SongBiao
 * @Date 2021/1/08
 */
class Girl{

}
public class LeiHeDuiXiang {
    public static void main(String[] args) {
        int b;
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(arr));
        /*
        因为java.sql 中的类 java.sql.Date 和 java.util 中的类 java.util.Date 都匹配
        在这种情况下需要使用完整类名
        */
        java.util.Date date = new java.util.Date();

        //此处体现出默认权限的实例成员变量a在同一包中的不同类也是可以被访问的
        Animal p = new Animal("ddd");
        System.out.println(p.a);
        p.eat();
    }
}
