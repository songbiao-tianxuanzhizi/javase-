package com.company;

/**
 * 讲解的是Strings[]args的作用?即运行时命令行参数
 */
public class Main {//一个java程序里面只能有一个公共类
    public static void main(String[] args) {//面试题：String[] args为运行时命令行参数,下面定义的数组里面都是空的，只有在命令行中输入java+类名+输入的东西时才会进行输出，而输入的命令行参数会存放到args数组中进行打印输出

    for(int i=0;i<args.length;i++) {
        System.out.println(args[i]);//本身args数组是空的
    }
    System.out.println("songbiao");
    Main p=new Main();
    p.set();

    }

    /**
     * 讲解的是长整型以及字符串和数据类型的拼接
     * Long占8个字节
     */
    public static void set() {
        long a=10L;//一般不写小写的l，会与大写L混淆
        System.out.println("a的值是"+a);
	    System.out.println("a的最大值是"+Long.MAX_VALUE);//拼接，长整型的最大值的取值范围
        System.out.println("a的最小值是"+Long.MIN_VALUE);//长整型最小值的取值范围，长整形的包装类为Long
        int a1=10;
        int b=5;
        System.out.println(a+b);
        System.out.println("hhhh"+ a + b );//拼接因为有了字符串,任何类型的数据和字符串进行拼接结果就是字符串
        System.out.println("a+b的和为"+(a+b));
        System.out.print(a1);//此处没有换行
        System.out.println(b);
    }
}
