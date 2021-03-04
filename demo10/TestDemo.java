package com.bit.demo10;

import java.util.Scanner;

/**
 * 异常
 *
 * @author SongBiao
 * @Date 2021/1/18
 */
public class TestDemo {
    /*
   异常处理中，try、catch、finally的执行顺序，大家都知道是按顺序执行的。即，如果try中没有异常，则顺序为try→finally，
   如果try中有异常，则顺序为try→catch→finally。但是当try、catch、finally中加入return之后，就会有几种不同的情况出现，
   下面分别来说明一下。也可以跳到最后直接看总结。
     */
    public static int fun4(){
        int i = 1;
        try {
            i++;
            System.out.println("try:" + i);
            return i;
        } catch (Exception e) {
            i++;
            System.out.println("catch:" + i);
            return i;
        } finally {
            i++;
            System.out.println("finally:" + i);
            return i;
        }
    }
    public static void main35(String[] args) {
        fun4();

    }

    //.............................................................................................................................
    //throws为声明异常，是告诉方法的调用者使用这个方法会出现那些异常，然后在调用这个方法时时使用try catch处理异常
    //throws后面可以抛出多个异常
    public static void fun1(int y) throws ArithmeticException, NullPointerException {
        //throw名为抛出异常
        if (y == 0) {
            throw new ArithmeticException();
        }
        System.out.println(10 / y);


    }

    public static void main34(String[] args) {
        try {
            fun1(20);
            System.out.println("此段代码可以执行");
        } catch (ArithmeticException | NullPointerException e) {
            e.printStackTrace();
            fun1(10);
        }
        System.out.println("处理完异常了");
    }

    //..........................................................................................
    public static void fun() {
        int a = 0;
        System.out.println(10 / a);
        //下面的代码不会执行，因为交给jvm处理后，上述代码会报异常，程序会异常终止，下面的一行根本不会执行到
        System.out.println("此段代码不会被执行");
    }

    public static void main11(String[] args) {
        //此时的代码运行时会报算术异常，
        //假如此时程序中虽然具备发生异常的条件，但是都没有写出这个异常的话，最终会交给jvm来处理
        fun();
        //下面的代码不会执行，因为交给jvm处理后，上述代码会报异常，程序会异常终止，下面的一行根本不会执行到
        System.out.println("此段代码不会被执行");
    }

    public static void main(String[] args) {
        //如果try括号中写入了Scanner scanner = new Scanner(System.in)，那么finally中就不用写close方法了
        try (Scanner scanner = new Scanner(System.in)) {
            int a = scanner.nextInt();
            System.out.println(10 / a);
            System.out.println("当a不为0时，此段代码才会执行");

        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("当a为0时，此段代码才会执行");

        } finally {
            System.out.println("不管是否发生异常，finally块都会永远被执行");
        }
    }

    public static void main10(String[] args) {
        //scanner中的close方法
        Scanner scanner = new Scanner(System.in);
        try {
            int a = scanner.nextInt();
            System.out.println(10 / a);

        } catch (ArithmeticException e) {
            e.printStackTrace();

        } finally {
            scanner.close();
            System.out.println("不管是否发生异常，finally块都会永远被执行");
        }
    }

    public static void main6(String[] args) {
        int[] arr = {1, 2, 3};
        //也可以用一个 catch 捕获所有异常(不推荐)
        try {
            System.out.println("before");
            System.out.println(arr[100]);
            //因为此时上面的代码发生了异常，所以此时下面的代码是不会被执行的。
            System.out.println("after");
            //由于 Exception 类是所有异常类的父类. 因此可以用这个类型表示捕捉所有异常.
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("此段代码会执行");
        }
    }

    public static void main8(String[] args) {
        int[] arr = {1, 2, 3};
        //如果多个异常的处理方式是完全相同, catch也可以写成下面这样
        try {
            System.out.println("before");
            System.out.println(arr[100]);
            //因为此时上面的代码发生了异常，所以此时下面的代码是不会被执行的。
            System.out.println("after");

        } catch (ArithmeticException | NullPointerException e) {
            e.printStackTrace();
            //下面代码不会被执行，因为没有捕捉到对应的异常
            System.out.println("此段代码不会执行");
        }
    }


    public static void main4(String[] args) {
        int[] arr = {1, 2, 3};
        //catch代码块可以捕获多个异常
        try {
            System.out.println("before");
            System.out.println(arr[100]);
            //因为此时上面的代码发生了异常，所以此时下面的代码是不会被执行的。
            System.out.println("after");
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("此段代码不会执行");

        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("捕获了数组越界异常");
        }
        System.out.println("after try catch");
    }

    public static void main3(String[] args) {
        int[] arr = {1, 2, 3};
        try {
            System.out.println("before");
            System.out.println(arr[100]);
            //因为此时上面的代码发生了异常，所以此时下面的代码是不会被执行的。
            System.out.println("after");
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        /*因为此时本来应该捕获ArrayIndexOutOfBoundsException异常，
        但是此时我们捕获的是ArithmeticException异常，此时程序中没有可以处理这个异常的
        那么所以最终便会交给jvm处理，
        此时程序便会异常终止，下面的代码是不会被执行的
        */
        System.out.println("after try catch");
    }


    public static void main2(String[] args) {
        int[] arr = {1, 2, 3};
        try {
            System.out.println("before");
            System.out.println(arr[100]);
            //因为此时上面的代码发生了异常，所以此时下面的代码是不会被执行的。
            System.out.println("after");
        } catch (ArrayIndexOutOfBoundsException e) {
            // 打印出现异常的调用栈
            e.printStackTrace();
        }
        //因为此时使用了try..catch捕获了异常，所以下面的代码可以被执行
        System.out.println("after try catch");

    }


    public static void main1(String[] args) {
        int a = 0;
        try {
            //try中存放的是可能会发生异常的代码
            System.out.println(10 / a);
        } catch (ArithmeticException e) {
            //catch代码块放入的是处理异常的代码
            e.printStackTrace();
            a = 10;
            System.out.println(10 / a);
        }
        //如果上面使用try处理了异常，那么此时执行下面这段代码
        //假如不使用try处理的话，那么此时会交给jvm处理异常，那么最终程序会异常终止，且根本不会执行下面的代码
        System.out.println("执行");
    }
}
